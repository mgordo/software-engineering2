/**
 */
package geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.Line#getID <em>ID</em>}</li>
 *   <li>{@link geometry.Line#getLineDim <em>Line Dim</em>}</li>
 *   <li>{@link geometry.Line#getSource <em>Source</em>}</li>
 *   <li>{@link geometry.Line#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends Detail {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see geometry.GeometryPackage#getLine_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link geometry.Line#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Line Dim</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.Coordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Dim</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Dim</em>' containment reference list.
	 * @see geometry.GeometryPackage#getLine_LineDim()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Coordinates> getLineDim();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.Point#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Point)
	 * @see geometry.GeometryPackage#getLine_Source()
	 * @see geometry.Point#getPrevious
	 * @model opposite="previous" required="true"
	 * @generated
	 */
	Point getSource();

	/**
	 * Sets the value of the '{@link geometry.Line#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Point value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.Point#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Point)
	 * @see geometry.GeometryPackage#getLine_Target()
	 * @see geometry.Point#getNext
	 * @model opposite="next" required="true"
	 * @generated
	 */
	Point getTarget();

	/**
	 * Sets the value of the '{@link geometry.Line#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Point value);

} // Line
