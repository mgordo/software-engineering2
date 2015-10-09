/**
 */
package OurPNVis.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import OurPNVis.OurPNVisPackage;
import OurPNVis.PNVis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PN Vis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PNVisImpl extends PetriNetTypeImpl implements PNVis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PNVisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OurPNVisPackage.Literals.PN_VIS;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		//Changed to provide the resource URI
		return "http://OurPNVIs";
	}

} //PNVisImpl
