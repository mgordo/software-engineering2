/**
 */
package OurPNVis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import OurPNVis.Activities;
import OurPNVis.Arc;
import OurPNVis.CanChange;
import OurPNVis.Finished;
import OurPNVis.Geometry;
import OurPNVis.KeepAnim;
import OurPNVis.OurPNVisFactory;
import OurPNVis.OurPNVisPackage;
import OurPNVis.PNVis;
import OurPNVis.Place;
import OurPNVis.Shape;
import OurPNVis.Tokens;
import OurPNVis.Transition;
import OurPNVis.ident;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OurPNVisFactoryImpl extends EFactoryImpl implements OurPNVisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OurPNVisFactory init() {
		try {
			OurPNVisFactory theOurPNVisFactory = (OurPNVisFactory)EPackage.Registry.INSTANCE.getEFactory(OurPNVisPackage.eNS_URI);
			if (theOurPNVisFactory != null) {
				return theOurPNVisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OurPNVisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPNVisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OurPNVisPackage.PN_VIS: return createPNVis();
			case OurPNVisPackage.ARC: return createArc();
			case OurPNVisPackage.PLACE: return createPlace();
			case OurPNVisPackage.TRANSITION: return createTransition();
			case OurPNVisPackage.FINISHED: return createFinished();
			case OurPNVisPackage.TOKENS: return createTokens();
			case OurPNVisPackage.CAN_CHANGE: return createCanChange();
			case OurPNVisPackage.SHAPE: return createShape();
			case OurPNVisPackage.ACTIVITIES: return createActivities();
			case OurPNVisPackage.GEOMETRY: return createGeometry();
			case OurPNVisPackage.KEEP_ANIM: return createKeepAnim();
			case OurPNVisPackage.IDENT: return createident();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PNVis createPNVis() {
		PNVisImpl pnVis = new PNVisImpl();
		return pnVis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finished createFinished() {
		FinishedImpl finished = new FinishedImpl();
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tokens createTokens() {
		TokensImpl tokens = new TokensImpl();
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CanChange createCanChange() {
		CanChangeImpl canChange = new CanChangeImpl();
		return canChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeepAnim createKeepAnim() {
		KeepAnimImpl keepAnim = new KeepAnimImpl();
		return keepAnim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ident createident() {
		identImpl ident = new identImpl();
		return ident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activities createActivities() {
		ActivitiesImpl activities = new ActivitiesImpl();
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OurPNVisPackage getOurPNVisPackage() {
		return (OurPNVisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OurPNVisPackage getPackage() {
		return OurPNVisPackage.eINSTANCE;
	}

} //OurPNVisFactoryImpl
