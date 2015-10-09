/**
 */
package config;

import geometry.Geometry;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link config.Config#getPetri <em>Petri</em>}</li>
 *   <li>{@link config.Config#getGeo <em>Geo</em>}</li>
 * </ul>
 * </p>
 *
 * @see config.ConfigPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri</em>' reference.
	 * @see #setPetri(PetriNetDoc)
	 * @see config.ConfigPackage#getConfig_Petri()
	 * @model required="true"
	 * @generated
	 */
	PetriNetDoc getPetri();

	/**
	 * Sets the value of the '{@link config.Config#getPetri <em>Petri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri</em>' reference.
	 * @see #getPetri()
	 * @generated
	 */
	void setPetri(PetriNetDoc value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geometry)
	 * @see config.ConfigPackage#getConfig_Geo()
	 * @model required="true"
	 * @generated
	 */
	Geometry getGeo();

	/**
	 * Sets the value of the '{@link config.Config#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geometry value);

} // Config
