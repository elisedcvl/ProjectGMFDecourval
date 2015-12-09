/**
 */
package friendz.impl;

import friendz.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FriendzFactoryImpl extends EFactoryImpl implements FriendzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FriendzFactory init() {
		try {
			FriendzFactory theFriendzFactory = (FriendzFactory)EPackage.Registry.INSTANCE.getEFactory(FriendzPackage.eNS_URI);
			if (theFriendzFactory != null) {
				return theFriendzFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FriendzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendzFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FriendzPackage.FRIENDZ: return createFriendz();
			case FriendzPackage.USER: return createUser();
			case FriendzPackage.PUBLICATION: return createPublication();
			case FriendzPackage.COMMENT: return createComment();
			case FriendzPackage.ENEMITY: return createEnemity();
			case FriendzPackage.FRIENDSHIP: return createFriendship();
			case FriendzPackage.AUTHORSHIP: return createAuthorship();
			case FriendzPackage.PUBLI_REF: return createPubliRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Friendz createFriendz() {
		FriendzImpl friendz = new FriendzImpl();
		return friendz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publication createPublication() {
		PublicationImpl publication = new PublicationImpl();
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemity createEnemity() {
		EnemityImpl enemity = new EnemityImpl();
		return enemity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Friendship createFriendship() {
		FriendshipImpl friendship = new FriendshipImpl();
		return friendship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorship createAuthorship() {
		AuthorshipImpl authorship = new AuthorshipImpl();
		return authorship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubliRef createPubliRef() {
		PubliRefImpl publiRef = new PubliRefImpl();
		return publiRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendzPackage getFriendzPackage() {
		return (FriendzPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FriendzPackage getPackage() {
		return FriendzPackage.eINSTANCE;
	}

} //FriendzFactoryImpl
