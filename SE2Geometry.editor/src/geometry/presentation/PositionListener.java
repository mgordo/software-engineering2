package geometry.presentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;

import geometry.Coordinates;
import geometry.Line;
import geometry.Point;
import geometry.GeometryFactory;

/**
 * Positionlistener used to store the positions
 * of places, transitions and bendpoints in
 * the model.
 * @author Simon
 *
 */
public class PositionListener extends EContentAdapter {

	public PositionListener() {
		// add filter? like shown in tutorial?
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			super.notifyChanged(notification);
		}
		// add filter? like shown in tutorial?
		if ((notification instanceof ENotificationImpl)
				&& (notification.getNotifier() instanceof EObject)) {

			ENotificationImpl eNotifImpl = (ENotificationImpl) notification;
			EObject eNotifier = (EObject) eNotifImpl.getNotifier();
			
//			if (eNotifier instanceof Edge){
//				updateIntermediatePositions(eNotifier);
//			}
			if (NotationPackage.eINSTANCE.getBounds().isSuperTypeOf(
					eNotifier.eClass())) {
				updatePositions(eNotifImpl, eNotifier);
			} else if (eNotifier instanceof RelativeBendpoints) {
				updateIntermediatePositions(eNotifier);
			}
		}
	}

	/**
	 * Updates the positions of the bendpoints
	 * @param eNotifier
	 */
	private void updateIntermediatePositions(EObject eNotifier) {
		EObject obj = eNotifier.eContainer();
		if (obj instanceof Edge) {
			// cast obj to edge and get the view element.
			Edge edge = (Edge) obj;
			EObject view = edge.getElement();
			if (view != null && view instanceof Line) {
				Line arc = (Line) view;
				
				// deletes all points
				arc.getLineDim().clear();
				
				float currX = 0;
				float currY = 0;
				float scaledX = 0;
				float scaledY = 0;
				
				// gets the source of the arc to calculate the absolute position
				Point sourcePoint = arc.getSource();
				
				currX = sourcePoint.getX();
				currY = sourcePoint.getY();
				
				
				Bendpoints bendpoints = edge.getBendpoints();
				if(bendpoints instanceof RelativeBendpoints){
					RelativeBendpoints relBendPoints = (RelativeBendpoints)bendpoints;
					for(Object currPoint : relBendPoints.getPoints()){
						if(currPoint instanceof RelativeBendpoint){
							RelativeBendpoint currRelBendPoint = (RelativeBendpoint)currPoint;
							
							Coordinates pos = GeometryFactory.eINSTANCE.createCoordinates();
							System.out.println("currx" + currX);
							System.out.println("curry" + currY);
							System.out.println("BendX" + currRelBendPoint.getSourceX());
							System.out.println("BendY" + currRelBendPoint.getSourceY());
							scaledX = (float) (currX + (currRelBendPoint.getSourceX()/10.0));
							scaledY = (float) (currY + (currRelBendPoint.getSourceY()/10.0));
							System.out.println("ScaledX" + scaledX);
							System.out.println("ScaledY" + scaledY);
							pos.setX(scaledX);
							pos.setY(scaledY);

							// adds the points to the pos list of the arc.
							arc.getLineDim().add(pos);
						}
					}
				}
				//FIXME remove last and first bendpoint.
				// But since its just for demonstration purpose,
				// this quick fix is legit!
				arc.getLineDim().remove(arc.getLineDim().size()-1);
				arc.getLineDim().remove(0);
			}
		}
	}

	/**
	 * Updates the positions of the places and transitions.
	 * @param eNotifImpl
	 * @param eNotifier
	 */
	private void updatePositions(ENotificationImpl eNotifImpl, EObject eNotifier) {
		int id = eNotifImpl.getFeatureID(EAttribute.class);
		EObject view = ((View) eNotifier.eContainer()).getElement();

		if (view instanceof Point) {
			Point node = (Point) view;

			switch (id) {
			case NotationPackage.BOUNDS__X:
				int x = eNotifImpl.getNewIntValue();
				float scaledX = (float) (x/10.0);
				node.setX(scaledX);
				break;
			case NotationPackage.BOUNDS__Y:
				int y = eNotifImpl.getNewIntValue();
				float scaledY = (float) (y/10.0);
				node.setY(scaledY);
				break;
			}
		}
	}
}
