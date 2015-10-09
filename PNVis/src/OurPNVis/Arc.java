/**
 */
package OurPNVis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OurPNVis.Arc#getFinished <em>Finished</em>}</li>
 *   <li>{@link OurPNVis.Arc#getKeepanm <em>Keepanm</em>}</li>
 *   <li>{@link OurPNVis.Arc#getIdnt <em>Idnt</em>}</li>
 * </ul>
 * </p>
 *
 * @see OurPNVis.OurPNVisPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Finished</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' containment reference.
	 * @see #setFinished(Finished)
	 * @see OurPNVis.OurPNVisPackage#getArc_Finished()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Finished getFinished();

	/**
	 * Sets the value of the '{@link OurPNVis.Arc#getFinished <em>Finished</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' containment reference.
	 * @see #getFinished()
	 * @generated
	 */
	void setFinished(Finished value);

	/**
	 * Returns the value of the '<em><b>Keepanm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keepanm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keepanm</em>' containment reference.
	 * @see #setKeepanm(KeepAnim)
	 * @see OurPNVis.OurPNVisPackage#getArc_Keepanm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	KeepAnim getKeepanm();

	/**
	 * Sets the value of the '{@link OurPNVis.Arc#getKeepanm <em>Keepanm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keepanm</em>' containment reference.
	 * @see #getKeepanm()
	 * @generated
	 */
	void setKeepanm(KeepAnim value);

	/**
	 * Returns the value of the '<em><b>Idnt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idnt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idnt</em>' containment reference.
	 * @see #setIdnt(ident)
	 * @see OurPNVis.OurPNVisPackage#getArc_Idnt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ident getIdnt();

	/**
	 * Sets the value of the '{@link OurPNVis.Arc#getIdnt <em>Idnt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idnt</em>' containment reference.
	 * @see #getIdnt()
	 * @generated
	 */
	void setIdnt(ident value);

} // Arc
