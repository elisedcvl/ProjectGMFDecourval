/**
 */
package friendz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see friendz.FriendzFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FriendzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "friendz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "friendz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "friendz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FriendzPackage eINSTANCE = friendz.impl.FriendzPackageImpl.init();

	/**
	 * The meta object id for the '{@link friendz.impl.FriendzImpl <em>Friendz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.FriendzImpl
	 * @see friendz.impl.FriendzPackageImpl#getFriendz()
	 * @generated
	 */
	int FRIENDZ = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__USERS = 0;

	/**
	 * The feature id for the '<em><b>Friendships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__FRIENDSHIPS = 1;

	/**
	 * The feature id for the '<em><b>Enemities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__ENEMITIES = 2;

	/**
	 * The feature id for the '<em><b>Publications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__PUBLICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Authorships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__AUTHORSHIPS = 5;

	/**
	 * The feature id for the '<em><b>Publi Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ__PUBLI_REFS = 6;

	/**
	 * The number of structural features of the '<em>Friendz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Friendz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.UserImpl
	 * @see friendz.impl.FriendzPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID_USER = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.PublicationImpl
	 * @see friendz.impl.FriendzPackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 2;

	/**
	 * The feature id for the '<em><b>Id Pub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__ID_PUB = 0;

	/**
	 * The feature id for the '<em><b>Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLICATION = 1;

	/**
	 * The feature id for the '<em><b>Date Pub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__DATE_PUB = 2;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Author</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___IS_AUTHOR__PUBLICATION = 0;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link friendz.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.CommentImpl
	 * @see friendz.impl.FriendzPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Id Com</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID_COM = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Date Com</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DATE_COM = 2;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.EnemityImpl <em>Enemity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.EnemityImpl
	 * @see friendz.impl.FriendzPackageImpl#getEnemity()
	 * @generated
	 */
	int ENEMITY = 4;

	/**
	 * The feature id for the '<em><b>User1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMITY__USER1 = 0;

	/**
	 * The feature id for the '<em><b>User2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMITY__USER2 = 1;

	/**
	 * The feature id for the '<em><b>Date Enemy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMITY__DATE_ENEMY = 2;

	/**
	 * The number of structural features of the '<em>Enemity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enemity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.FriendshipImpl <em>Friendship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.FriendshipImpl
	 * @see friendz.impl.FriendzPackageImpl#getFriendship()
	 * @generated
	 */
	int FRIENDSHIP = 5;

	/**
	 * The feature id for the '<em><b>User3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDSHIP__USER3 = 0;

	/**
	 * The feature id for the '<em><b>User4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDSHIP__USER4 = 1;

	/**
	 * The feature id for the '<em><b>Date Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDSHIP__DATE_FRIEND = 2;

	/**
	 * The number of structural features of the '<em>Friendship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Friendship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.AuthorshipImpl <em>Authorship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.AuthorshipImpl
	 * @see friendz.impl.FriendzPackageImpl#getAuthorship()
	 * @generated
	 */
	int AUTHORSHIP = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORSHIP__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Publi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORSHIP__PUBLI = 1;

	/**
	 * The number of structural features of the '<em>Authorship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authorship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link friendz.impl.PubliRefImpl <em>Publi Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see friendz.impl.PubliRefImpl
	 * @see friendz.impl.FriendzPackageImpl#getPubliRef()
	 * @generated
	 */
	int PUBLI_REF = 7;

	/**
	 * The feature id for the '<em><b>Publi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF__PUBLI = 0;

	/**
	 * The feature id for the '<em><b>Publi Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF__PUBLI_REF = 1;

	/**
	 * The number of structural features of the '<em>Publi Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Author</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF___IS_AUTHOR__PUBLICATION = 0;

	/**
	 * The operation id for the '<em>Is Friend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF___IS_FRIEND__USER = 1;

	/**
	 * The number of operations of the '<em>Publi Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLI_REF_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link friendz.Friendz <em>Friendz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friendz</em>'.
	 * @see friendz.Friendz
	 * @generated
	 */
	EClass getFriendz();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see friendz.Friendz#getUsers()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getFriendships <em>Friendships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Friendships</em>'.
	 * @see friendz.Friendz#getFriendships()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Friendships();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getEnemities <em>Enemities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enemities</em>'.
	 * @see friendz.Friendz#getEnemities()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Enemities();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getPublications <em>Publications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publications</em>'.
	 * @see friendz.Friendz#getPublications()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Publications();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see friendz.Friendz#getComments()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getAuthorships <em>Authorships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorships</em>'.
	 * @see friendz.Friendz#getAuthorships()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_Authorships();

	/**
	 * Returns the meta object for the containment reference list '{@link friendz.Friendz#getPubliRefs <em>Publi Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publi Refs</em>'.
	 * @see friendz.Friendz#getPubliRefs()
	 * @see #getFriendz()
	 * @generated
	 */
	EReference getFriendz_PubliRefs();

	/**
	 * Returns the meta object for class '{@link friendz.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see friendz.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link friendz.User#getIdUser <em>Id User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id User</em>'.
	 * @see friendz.User#getIdUser()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IdUser();

	/**
	 * Returns the meta object for the attribute '{@link friendz.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see friendz.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link friendz.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see friendz.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for class '{@link friendz.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see friendz.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Publication#getIdPub <em>Id Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pub</em>'.
	 * @see friendz.Publication#getIdPub()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_IdPub();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Publication#getPublication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication</em>'.
	 * @see friendz.Publication#getPublication()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Publication();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Publication#getDatePub <em>Date Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Pub</em>'.
	 * @see friendz.Publication#getDatePub()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_DatePub();

	/**
	 * Returns the meta object for the '{@link friendz.Publication#isAuthor(friendz.Publication) <em>Is Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Author</em>' operation.
	 * @see friendz.Publication#isAuthor(friendz.Publication)
	 * @generated
	 */
	EOperation getPublication__IsAuthor__Publication();

	/**
	 * Returns the meta object for class '{@link friendz.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see friendz.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Comment#getIdCom <em>Id Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Com</em>'.
	 * @see friendz.Comment#getIdCom()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_IdCom();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see friendz.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Comment#getDateCom <em>Date Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Com</em>'.
	 * @see friendz.Comment#getDateCom()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_DateCom();

	/**
	 * Returns the meta object for class '{@link friendz.Enemity <em>Enemity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemity</em>'.
	 * @see friendz.Enemity
	 * @generated
	 */
	EClass getEnemity();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Enemity#getUser1 <em>User1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User1</em>'.
	 * @see friendz.Enemity#getUser1()
	 * @see #getEnemity()
	 * @generated
	 */
	EReference getEnemity_User1();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Enemity#getUser2 <em>User2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User2</em>'.
	 * @see friendz.Enemity#getUser2()
	 * @see #getEnemity()
	 * @generated
	 */
	EReference getEnemity_User2();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Enemity#getDateEnemy <em>Date Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Enemy</em>'.
	 * @see friendz.Enemity#getDateEnemy()
	 * @see #getEnemity()
	 * @generated
	 */
	EAttribute getEnemity_DateEnemy();

	/**
	 * Returns the meta object for class '{@link friendz.Friendship <em>Friendship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friendship</em>'.
	 * @see friendz.Friendship
	 * @generated
	 */
	EClass getFriendship();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Friendship#getUser3 <em>User3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User3</em>'.
	 * @see friendz.Friendship#getUser3()
	 * @see #getFriendship()
	 * @generated
	 */
	EReference getFriendship_User3();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Friendship#getUser4 <em>User4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User4</em>'.
	 * @see friendz.Friendship#getUser4()
	 * @see #getFriendship()
	 * @generated
	 */
	EReference getFriendship_User4();

	/**
	 * Returns the meta object for the attribute '{@link friendz.Friendship#getDateFriend <em>Date Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Friend</em>'.
	 * @see friendz.Friendship#getDateFriend()
	 * @see #getFriendship()
	 * @generated
	 */
	EAttribute getFriendship_DateFriend();

	/**
	 * Returns the meta object for class '{@link friendz.Authorship <em>Authorship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorship</em>'.
	 * @see friendz.Authorship
	 * @generated
	 */
	EClass getAuthorship();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Authorship#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see friendz.Authorship#getAuthor()
	 * @see #getAuthorship()
	 * @generated
	 */
	EReference getAuthorship_Author();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.Authorship#getPubli <em>Publi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publi</em>'.
	 * @see friendz.Authorship#getPubli()
	 * @see #getAuthorship()
	 * @generated
	 */
	EReference getAuthorship_Publi();

	/**
	 * Returns the meta object for class '{@link friendz.PubliRef <em>Publi Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publi Ref</em>'.
	 * @see friendz.PubliRef
	 * @generated
	 */
	EClass getPubliRef();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.PubliRef#getPubli <em>Publi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publi</em>'.
	 * @see friendz.PubliRef#getPubli()
	 * @see #getPubliRef()
	 * @generated
	 */
	EReference getPubliRef_Publi();

	/**
	 * Returns the meta object for the containment reference '{@link friendz.PubliRef#getPubliRef <em>Publi Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publi Ref</em>'.
	 * @see friendz.PubliRef#getPubliRef()
	 * @see #getPubliRef()
	 * @generated
	 */
	EReference getPubliRef_PubliRef();

	/**
	 * Returns the meta object for the '{@link friendz.PubliRef#isAuthor(friendz.Publication) <em>Is Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Author</em>' operation.
	 * @see friendz.PubliRef#isAuthor(friendz.Publication)
	 * @generated
	 */
	EOperation getPubliRef__IsAuthor__Publication();

	/**
	 * Returns the meta object for the '{@link friendz.PubliRef#isFriend(friendz.User) <em>Is Friend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Friend</em>' operation.
	 * @see friendz.PubliRef#isFriend(friendz.User)
	 * @generated
	 */
	EOperation getPubliRef__IsFriend__User();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FriendzFactory getFriendzFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link friendz.impl.FriendzImpl <em>Friendz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.FriendzImpl
		 * @see friendz.impl.FriendzPackageImpl#getFriendz()
		 * @generated
		 */
		EClass FRIENDZ = eINSTANCE.getFriendz();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__USERS = eINSTANCE.getFriendz_Users();

		/**
		 * The meta object literal for the '<em><b>Friendships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__FRIENDSHIPS = eINSTANCE.getFriendz_Friendships();

		/**
		 * The meta object literal for the '<em><b>Enemities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__ENEMITIES = eINSTANCE.getFriendz_Enemities();

		/**
		 * The meta object literal for the '<em><b>Publications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__PUBLICATIONS = eINSTANCE.getFriendz_Publications();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__COMMENTS = eINSTANCE.getFriendz_Comments();

		/**
		 * The meta object literal for the '<em><b>Authorships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__AUTHORSHIPS = eINSTANCE.getFriendz_Authorships();

		/**
		 * The meta object literal for the '<em><b>Publi Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDZ__PUBLI_REFS = eINSTANCE.getFriendz_PubliRefs();

		/**
		 * The meta object literal for the '{@link friendz.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.UserImpl
		 * @see friendz.impl.FriendzPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID_USER = eINSTANCE.getUser_IdUser();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '{@link friendz.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.PublicationImpl
		 * @see friendz.impl.FriendzPackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();

		/**
		 * The meta object literal for the '<em><b>Id Pub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__ID_PUB = eINSTANCE.getPublication_IdPub();

		/**
		 * The meta object literal for the '<em><b>Publication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__PUBLICATION = eINSTANCE.getPublication_Publication();

		/**
		 * The meta object literal for the '<em><b>Date Pub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__DATE_PUB = eINSTANCE.getPublication_DatePub();

		/**
		 * The meta object literal for the '<em><b>Is Author</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLICATION___IS_AUTHOR__PUBLICATION = eINSTANCE.getPublication__IsAuthor__Publication();

		/**
		 * The meta object literal for the '{@link friendz.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.CommentImpl
		 * @see friendz.impl.FriendzPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Id Com</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID_COM = eINSTANCE.getComment_IdCom();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '<em><b>Date Com</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DATE_COM = eINSTANCE.getComment_DateCom();

		/**
		 * The meta object literal for the '{@link friendz.impl.EnemityImpl <em>Enemity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.EnemityImpl
		 * @see friendz.impl.FriendzPackageImpl#getEnemity()
		 * @generated
		 */
		EClass ENEMITY = eINSTANCE.getEnemity();

		/**
		 * The meta object literal for the '<em><b>User1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMITY__USER1 = eINSTANCE.getEnemity_User1();

		/**
		 * The meta object literal for the '<em><b>User2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMITY__USER2 = eINSTANCE.getEnemity_User2();

		/**
		 * The meta object literal for the '<em><b>Date Enemy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMITY__DATE_ENEMY = eINSTANCE.getEnemity_DateEnemy();

		/**
		 * The meta object literal for the '{@link friendz.impl.FriendshipImpl <em>Friendship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.FriendshipImpl
		 * @see friendz.impl.FriendzPackageImpl#getFriendship()
		 * @generated
		 */
		EClass FRIENDSHIP = eINSTANCE.getFriendship();

		/**
		 * The meta object literal for the '<em><b>User3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDSHIP__USER3 = eINSTANCE.getFriendship_User3();

		/**
		 * The meta object literal for the '<em><b>User4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDSHIP__USER4 = eINSTANCE.getFriendship_User4();

		/**
		 * The meta object literal for the '<em><b>Date Friend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIENDSHIP__DATE_FRIEND = eINSTANCE.getFriendship_DateFriend();

		/**
		 * The meta object literal for the '{@link friendz.impl.AuthorshipImpl <em>Authorship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.AuthorshipImpl
		 * @see friendz.impl.FriendzPackageImpl#getAuthorship()
		 * @generated
		 */
		EClass AUTHORSHIP = eINSTANCE.getAuthorship();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORSHIP__AUTHOR = eINSTANCE.getAuthorship_Author();

		/**
		 * The meta object literal for the '<em><b>Publi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORSHIP__PUBLI = eINSTANCE.getAuthorship_Publi();

		/**
		 * The meta object literal for the '{@link friendz.impl.PubliRefImpl <em>Publi Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see friendz.impl.PubliRefImpl
		 * @see friendz.impl.FriendzPackageImpl#getPubliRef()
		 * @generated
		 */
		EClass PUBLI_REF = eINSTANCE.getPubliRef();

		/**
		 * The meta object literal for the '<em><b>Publi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLI_REF__PUBLI = eINSTANCE.getPubliRef_Publi();

		/**
		 * The meta object literal for the '<em><b>Publi Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLI_REF__PUBLI_REF = eINSTANCE.getPubliRef_PubliRef();

		/**
		 * The meta object literal for the '<em><b>Is Author</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLI_REF___IS_AUTHOR__PUBLICATION = eINSTANCE.getPubliRef__IsAuthor__Publication();

		/**
		 * The meta object literal for the '<em><b>Is Friend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLI_REF___IS_FRIEND__USER = eINSTANCE.getPubliRef__IsFriend__User();

	}

} //FriendzPackage
