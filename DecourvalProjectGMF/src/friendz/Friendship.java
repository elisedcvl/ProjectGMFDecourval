/**
 */
package friendz;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friendship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Friendship#getUser3 <em>User3</em>}</li>
 *   <li>{@link friendz.Friendship#getUser4 <em>User4</em>}</li>
 *   <li>{@link friendz.Friendship#getDateFriend <em>Date Friend</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getFriendship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Relation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Relation='Tuple {\n\tmessage : String = \'User1 must be different from user2\',\n\tstatus : Boolean = \n\t\tself.user1 <> self.user2 \n}.status'"
 * @generated
 */
public interface Friendship extends EObject {
	/**
	 * Returns the value of the '<em><b>User3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User3</em>' containment reference.
	 * @see #setUser3(User)
	 * @see friendz.FriendzPackage#getFriendship_User3()
	 * @model containment="true"
	 * @generated
	 */
	User getUser3();

	/**
	 * Sets the value of the '{@link friendz.Friendship#getUser3 <em>User3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User3</em>' containment reference.
	 * @see #getUser3()
	 * @generated
	 */
	void setUser3(User value);

	/**
	 * Returns the value of the '<em><b>User4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User4</em>' containment reference.
	 * @see #setUser4(User)
	 * @see friendz.FriendzPackage#getFriendship_User4()
	 * @model containment="true"
	 * @generated
	 */
	User getUser4();

	/**
	 * Sets the value of the '{@link friendz.Friendship#getUser4 <em>User4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User4</em>' containment reference.
	 * @see #getUser4()
	 * @generated
	 */
	void setUser4(User value);

	/**
	 * Returns the value of the '<em><b>Date Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Friend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Friend</em>' attribute.
	 * @see #setDateFriend(Date)
	 * @see friendz.FriendzPackage#getFriendship_DateFriend()
	 * @model
	 * @generated
	 */
	Date getDateFriend();

	/**
	 * Sets the value of the '{@link friendz.Friendship#getDateFriend <em>Date Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Friend</em>' attribute.
	 * @see #getDateFriend()
	 * @generated
	 */
	void setDateFriend(Date value);

} // Friendship
