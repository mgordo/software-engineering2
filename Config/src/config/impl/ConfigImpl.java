/**
 */
package config.impl;

import geometry.Geometry;
import config.Config;
import config.ConfigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link config.impl.ConfigImpl#getPetri <em>Petri</em>}</li>
 *   <li>{@link config.impl.ConfigImpl#getGeo <em>Geo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The cached value of the '{@link #getPetri() <em>Petri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetri()
	 * @generated
	 * @ordered
	 */
	protected PetriNetDoc petri;

	/**
	 * The cached value of the '{@link #getGeo() <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo()
	 * @generated
	 * @ordered
	 */
	protected Geometry geo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetDoc getPetri() {
		if (petri != null && petri.eIsProxy()) {
			InternalEObject oldPetri = (InternalEObject)petri;
			petri = (PetriNetDoc)eResolveProxy(oldPetri);
			if (petri != oldPetri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.CONFIG__PETRI, oldPetri, petri));
			}
		}
		return petri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetDoc basicGetPetri() {
		return petri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetri(PetriNetDoc newPetri) {
		PetriNetDoc oldPetri = petri;
		petri = newPetri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__PETRI, oldPetri, petri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeo() {
		if (geo != null && geo.eIsProxy()) {
			InternalEObject oldGeo = (InternalEObject)geo;
			geo = (Geometry)eResolveProxy(oldGeo);
			if (geo != oldGeo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.CONFIG__GEO, oldGeo, geo));
			}
		}
		return geo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry basicGetGeo() {
		return geo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeo(Geometry newGeo) {
		Geometry oldGeo = geo;
		geo = newGeo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__GEO, oldGeo, geo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.CONFIG__PETRI:
				if (resolve) return getPetri();
				return basicGetPetri();
			case ConfigPackage.CONFIG__GEO:
				if (resolve) return getGeo();
				return basicGetGeo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.CONFIG__PETRI:
				setPetri((PetriNetDoc)newValue);
				return;
			case ConfigPackage.CONFIG__GEO:
				setGeo((Geometry)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.CONFIG__PETRI:
				setPetri((PetriNetDoc)null);
				return;
			case ConfigPackage.CONFIG__GEO:
				setGeo((Geometry)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.CONFIG__PETRI:
				return petri != null;
			case ConfigPackage.CONFIG__GEO:
				return geo != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigImpl
