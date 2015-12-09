/**
 */
package friendz;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Enemity#getUser1 <em>User1</em>}</li>
 *   <li>{@link friendz.Enemity#getUser2 <em>User2</em>}</li>
 *   <li>{@link friendz.Enemity#getDateEnemy <em>Date Enemy</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getEnemity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Relation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Relation='Tuple {\n\tmessage : String = \'User1 must be different from user2\',\n\tstatus : Boolean = \n\t\tself.user1 <> self.user2 \n}.status'"
 * @generated
 */
public interface Enemity extends EObject {
	/**
	 * Returns the value of the '<em><b>User1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User1</em>' containment reference.
	 * @see #setUser1(User)
	 * @see friendz.FriendzPackage#getEnemity_User1()
	 * @model containment="true"
	 * @generated
	 */
	User getUser1();

	/**
	 * Sets the value of the '{@link friendz.Enemity#getUser1 <em>User1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User1</em>' containment reference.
	 * @see #getUser1()
	 * @generated
	 */
	void setUser1(User value);

	/**
	 * Returns the value of the '<em><b>User2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User2</em>' containment reference.
	 * @see #setUser2(User)
	 * @see friendz.FriendzPackage#getEnemity_User2()
	 * @model containment="true"
	 * @generated
	 */
	User getUser2();

	/**
	 * Sets the value of the '{@link friendz.Enemity#getUser2 <em>User2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User2</em>' containment reference.
	 * @see #getUser2()
	 * @generated
	 */
	void setUser2(User value);

	/**
	 * Returns the value of the '<em><b>Date Enemy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Enemy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Enemy</em>' attribute.
	 * @see #setDateEnemy(Date)
	 * @see friendz.FriendzPackage#getEnemity_DateEnemy()
	 * @model
	 * @generated
	 */
	Date getDateEnemy();

	/**
	 * Sets the value of the '{@link friendz.Enemity#getDateEnemy <em>Date Enemy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Enemy</em>' attribute.
	 * @see #getDateEnemy()
	 * @generated
	 */
	void setDateEnemy(Date value);

} // Enemity
