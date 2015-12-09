/**
 */
package friendz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.User#getIdUser <em>Id User</em>}</li>
 *   <li>{@link friendz.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link friendz.User#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueId='Tuple {\n\tmessage : String = \'User must have a unique id\',\n\tstatus : Boolean = \n\t\tUser.allInstances () -> forAll (u1, u2 | u1 <> u2 implies u1.idUser <> u2.idUser)\n}.status'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id User</em>' attribute.
	 * @see #setIdUser(String)
	 * @see friendz.FriendzPackage#getUser_IdUser()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdUser();

	/**
	 * Sets the value of the '{@link friendz.User#getIdUser <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id User</em>' attribute.
	 * @see #getIdUser()
	 * @generated
	 */
	void setIdUser(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see friendz.FriendzPackage#getUser_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link friendz.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see friendz.FriendzPackage#getUser_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link friendz.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // User
