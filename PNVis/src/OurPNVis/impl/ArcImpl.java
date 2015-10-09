/**
 */
package OurPNVis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import OurPNVis.Arc;
import OurPNVis.Finished;
import OurPNVis.KeepAnim;
import OurPNVis.OurPNVisPackage;
import OurPNVis.ident;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OurPNVis.impl.ArcImpl#getFinished <em>Finished</em>}</li>
 *   <li>{@link OurPNVis.impl.ArcImpl#getKeepanm <em>Keepanm</em>}</li>
 *   <li>{@link OurPNVis.impl.ArcImpl#getIdnt <em>Idnt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl implements Arc {
	/**
	 * The cached value of the '{@link #getFinished() <em>Finished</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinished()
	 * @generated
	 * @ordered
	 */
	protected Finished finished;

	/**
	 * The cached value of the '{@link #getKeepanm() <em>Keepanm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepanm()
	 * @generated
	 * @ordered
	 */
	protected KeepAnim keepanm;
	/**
	 * The cached value of the '{@link #getIdnt() <em>Idnt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdnt()
	 * @generated
	 * @ordered
	 */
	protected ident idnt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OurPNVisPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finished getFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinished(Finished newFinished, NotificationChain msgs) {
		Finished oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__FINISHED, oldFinished, newFinished);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinished(Finished newFinished) {
		if (newFinished != finished) {
			NotificationChain msgs = null;
			if (finished != null)
				msgs = ((InternalEObject)finished).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__FINISHED, null, msgs);
			if (newFinished != null)
				msgs = ((InternalEObject)newFinished).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__FINISHED, null, msgs);
			msgs = basicSetFinished(newFinished, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__FINISHED, newFinished, newFinished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeepAnim getKeepanm() {
		return keepanm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeepanm(KeepAnim newKeepanm, NotificationChain msgs) {
		KeepAnim oldKeepanm = keepanm;
		keepanm = newKeepanm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__KEEPANM, oldKeepanm, newKeepanm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepanm(KeepAnim newKeepanm) {
		if (newKeepanm != keepanm) {
			NotificationChain msgs = null;
			if (keepanm != null)
				msgs = ((InternalEObject)keepanm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__KEEPANM, null, msgs);
			if (newKeepanm != null)
				msgs = ((InternalEObject)newKeepanm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__KEEPANM, null, msgs);
			msgs = basicSetKeepanm(newKeepanm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__KEEPANM, newKeepanm, newKeepanm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ident getIdnt() {
		return idnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdnt(ident newIdnt, NotificationChain msgs) {
		ident oldIdnt = idnt;
		idnt = newIdnt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__IDNT, oldIdnt, newIdnt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdnt(ident newIdnt) {
		if (newIdnt != idnt) {
			NotificationChain msgs = null;
			if (idnt != null)
				msgs = ((InternalEObject)idnt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__IDNT, null, msgs);
			if (newIdnt != null)
				msgs = ((InternalEObject)newIdnt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OurPNVisPackage.ARC__IDNT, null, msgs);
			msgs = basicSetIdnt(newIdnt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPNVisPackage.ARC__IDNT, newIdnt, newIdnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OurPNVisPackage.ARC__FINISHED:
				return basicSetFinished(null, msgs);
			case OurPNVisPackage.ARC__KEEPANM:
				return basicSetKeepanm(null, msgs);
			case OurPNVisPackage.ARC__IDNT:
				return basicSetIdnt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OurPNVisPackage.ARC__FINISHED:
				return getFinished();
			case OurPNVisPackage.ARC__KEEPANM:
				return getKeepanm();
			case OurPNVisPackage.ARC__IDNT:
				return getIdnt();
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
			case OurPNVisPackage.ARC__FINISHED:
				setFinished((Finished)newValue);
				return;
			case OurPNVisPackage.ARC__KEEPANM:
				setKeepanm((KeepAnim)newValue);
				return;
			case OurPNVisPackage.ARC__IDNT:
				setIdnt((ident)newValue);
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
			case OurPNVisPackage.ARC__FINISHED:
				setFinished((Finished)null);
				return;
			case OurPNVisPackage.ARC__KEEPANM:
				setKeepanm((KeepAnim)null);
				return;
			case OurPNVisPackage.ARC__IDNT:
				setIdnt((ident)null);
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
			case OurPNVisPackage.ARC__FINISHED:
				return finished != null;
			case OurPNVisPackage.ARC__KEEPANM:
				return keepanm != null;
			case OurPNVisPackage.ARC__IDNT:
				return idnt != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
