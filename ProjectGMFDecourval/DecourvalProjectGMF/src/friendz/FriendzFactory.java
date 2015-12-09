/**
 */
package friendz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see friendz.FriendzPackage
 * @generated
 */
public interface FriendzFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FriendzFactory eINSTANCE = friendz.impl.FriendzFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Friendz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friendz</em>'.
	 * @generated
	 */
	Friendz createFriendz();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publication</em>'.
	 * @generated
	 */
	Publication createPublication();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Enemity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enemity</em>'.
	 * @generated
	 */
	Enemity createEnemity();

	/**
	 * Returns a new object of class '<em>Friendship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friendship</em>'.
	 * @generated
	 */
	Friendship createFriendship();

	/**
	 * Returns a new object of class '<em>Authorship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorship</em>'.
	 * @generated
	 */
	Authorship createAuthorship();

	/**
	 * Returns a new object of class '<em>Publi Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publi Ref</em>'.
	 * @generated
	 */
	PubliRef createPubliRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FriendzPackage getFriendzPackage();

} //FriendzFactory
