package geometry.diagram.part;

import geometry.Geometry;
import geometry.GeometryPackage;
import geometry.Line;
import geometry.Point;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.edit.parts.PointEditPart;
import geometry.diagram.providers.GeometryElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GeometryDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GeometryNodeDescriptor> getSemanticChildren(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryNodeDescriptor> getGeometry_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GeometryNodeDescriptor> result = new LinkedList<GeometryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPoints().iterator(); it.hasNext();) {
			Point childElement = (Point) it.next();
			int visualID = GeometryVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PointEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getContainedLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000ContainedLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2001ContainedLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getIncomingLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case PointEditPart.VISUAL_ID:
			return getPoint_2001IncomingLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getOutgoingLinks(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case PointEditPart.VISUAL_ID:
			return getPoint_2001OutgoingLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getGeometry_1000ContainedLinks(
			View view) {
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Line_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getPoint_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getLine_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getPoint_2001IncomingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Line_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getLine_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getPoint_2001OutgoingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Line_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeometryLinkDescriptor> getLine_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getContainedTypeModelFacetLinks_Line_4001(
			Geometry container) {
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		for (Iterator<?> links = container.getLines().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Line) {
				continue;
			}
			Line link = (Line) linkObject;
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point dst = link.getTarget();
			Point src = link.getSource();
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getIncomingTypeModelFacetLinks_Line_4001(
			Point target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GeometryPackage.eINSTANCE
					.getLine_Target()
					|| false == setting.getEObject() instanceof Line) {
				continue;
			}
			Line link = (Line) setting.getEObject();
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point src = link.getSource();
			result.add(new GeometryLinkDescriptor(src, target, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeometryLinkDescriptor> getOutgoingTypeModelFacetLinks_Line_4001(
			Point source) {
		Geometry container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Geometry) {
				container = (Geometry) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GeometryLinkDescriptor> result = new LinkedList<GeometryLinkDescriptor>();
		for (Iterator<?> links = container.getLines().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Line) {
				continue;
			}
			Line link = (Line) linkObject;
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point dst = link.getTarget();
			Point src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<GeometryNodeDescriptor> getSemanticChildren(View view) {
			return GeometryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getContainedLinks(View view) {
			return GeometryDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getIncomingLinks(View view) {
			return GeometryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GeometryLinkDescriptor> getOutgoingLinks(View view) {
			return GeometryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
