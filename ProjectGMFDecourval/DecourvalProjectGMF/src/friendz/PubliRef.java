/**
 */
package friendz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publi Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.PubliRef#getPubli <em>Publi</em>}</li>
 *   <li>{@link friendz.PubliRef#getPubliRef <em>Publi Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getPubliRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Relation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Relation='Tuple {\n\tmessage : String = \'Publication must be different from Origin publication\',\n\tstatus : Boolean = \n\t\tself.publi <> self.publiRef \n}.status'"
 * @generated
 */
public interface PubliRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Publi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publi</em>' containment reference.
	 * @see #setPubli(Publication)
	 * @see friendz.FriendzPackage#getPubliRef_Publi()
	 * @model containment="true"
	 * @generated
	 */
	Publication getPubli();

	/**
	 * Sets the value of the '{@link friendz.PubliRef#getPubli <em>Publi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publi</em>' containment reference.
	 * @see #getPubli()
	 * @generated
	 */
	void setPubli(Publication value);

	/**
	 * Returns the value of the '<em><b>Publi Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publi Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publi Ref</em>' containment reference.
	 * @see #setPubliRef(Publication)
	 * @see friendz.FriendzPackage#getPubliRef_PubliRef()
	 * @model containment="true"
	 * @generated
	 */
	Publication getPubliRef();

	/**
	 * Sets the value of the '{@link friendz.PubliRef#getPubliRef <em>Publi Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publi Ref</em>' containment reference.
	 * @see #getPubliRef()
	 * @generated
	 */
	void setPubliRef(Publication value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self ->select(u : User | Authorship.publi = p) '"
	 * @generated
	 */
	User isAuthor(Publication p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" uRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self ->select(u2 : User | Friendship.user1 = u) '"
	 * @generated
	 */
	EList<User> isFriend(User u);

} // PubliRef
