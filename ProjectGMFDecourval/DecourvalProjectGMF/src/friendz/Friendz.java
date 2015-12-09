/**
 */
package friendz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friendz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Friendz#getUsers <em>Users</em>}</li>
 *   <li>{@link friendz.Friendz#getFriendships <em>Friendships</em>}</li>
 *   <li>{@link friendz.Friendz#getEnemities <em>Enemities</em>}</li>
 *   <li>{@link friendz.Friendz#getPublications <em>Publications</em>}</li>
 *   <li>{@link friendz.Friendz#getComments <em>Comments</em>}</li>
 *   <li>{@link friendz.Friendz#getAuthorships <em>Authorships</em>}</li>
 *   <li>{@link friendz.Friendz#getPubliRefs <em>Publi Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getFriendz()
 * @model
 * @generated
 */
public interface Friendz extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Friendships</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.Friendship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friendships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friendships</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Friendships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Friendship> getFriendships();

	/**
	 * Returns the value of the '<em><b>Enemities</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.Enemity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enemities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enemities</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Enemities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enemity> getEnemities();

	/**
	 * Returns the value of the '<em><b>Publications</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.Publication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publications</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Publications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publication> getPublications();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Authorships</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.Authorship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorships</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_Authorships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Authorship> getAuthorships();

	/**
	 * Returns the value of the '<em><b>Publi Refs</b></em>' containment reference list.
	 * The list contents are of type {@link friendz.PubliRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publi Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publi Refs</em>' containment reference list.
	 * @see friendz.FriendzPackage#getFriendz_PubliRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PubliRef> getPubliRefs();

} // Friendz
