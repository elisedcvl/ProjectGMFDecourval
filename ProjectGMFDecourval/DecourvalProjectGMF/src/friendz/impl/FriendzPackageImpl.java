/**
 */
package friendz.impl;

import friendz.Authorship;
import friendz.Comment;
import friendz.Enemity;
import friendz.Friendship;
import friendz.Friendz;
import friendz.FriendzFactory;
import friendz.FriendzPackage;
import friendz.PubliRef;
import friendz.Publication;
import friendz.User;

import friendz.util.FriendzValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FriendzPackageImpl extends EPackageImpl implements FriendzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass friendzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass friendshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publiRefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see friendz.FriendzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FriendzPackageImpl() {
		super(eNS_URI, FriendzFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FriendzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FriendzPackage init() {
		if (isInited) return (FriendzPackage)EPackage.Registry.INSTANCE.getEPackage(FriendzPackage.eNS_URI);

		// Obtain or create and register package
		FriendzPackageImpl theFriendzPackage = (FriendzPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FriendzPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FriendzPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFriendzPackage.createPackageContents();

		// Initialize created meta-data
		theFriendzPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFriendzPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FriendzValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFriendzPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FriendzPackage.eNS_URI, theFriendzPackage);
		return theFriendzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFriendz() {
		return friendzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Users() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Friendships() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Enemities() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Publications() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Comments() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_Authorships() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendz_PubliRefs() {
		return (EReference)friendzEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IdUser() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublication_IdPub() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublication_Publication() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublication_DatePub() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPublication__IsAuthor__Publication() {
		return publicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_IdCom() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Comment() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_DateCom() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnemity() {
		return enemityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnemity_User1() {
		return (EReference)enemityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnemity_User2() {
		return (EReference)enemityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemity_DateEnemy() {
		return (EAttribute)enemityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFriendship() {
		return friendshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendship_User3() {
		return (EReference)friendshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendship_User4() {
		return (EReference)friendshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFriendship_DateFriend() {
		return (EAttribute)friendshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorship() {
		return authorshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorship_Author() {
		return (EReference)authorshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorship_Publi() {
		return (EReference)authorshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPubliRef() {
		return publiRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubliRef_Publi() {
		return (EReference)publiRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPubliRef_PubliRef() {
		return (EReference)publiRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPubliRef__IsAuthor__Publication() {
		return publiRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPubliRef__IsFriend__User() {
		return publiRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendzFactory getFriendzFactory() {
		return (FriendzFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		friendzEClass = createEClass(FRIENDZ);
		createEReference(friendzEClass, FRIENDZ__USERS);
		createEReference(friendzEClass, FRIENDZ__FRIENDSHIPS);
		createEReference(friendzEClass, FRIENDZ__ENEMITIES);
		createEReference(friendzEClass, FRIENDZ__PUBLICATIONS);
		createEReference(friendzEClass, FRIENDZ__COMMENTS);
		createEReference(friendzEClass, FRIENDZ__AUTHORSHIPS);
		createEReference(friendzEClass, FRIENDZ__PUBLI_REFS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID_USER);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);

		publicationEClass = createEClass(PUBLICATION);
		createEAttribute(publicationEClass, PUBLICATION__ID_PUB);
		createEAttribute(publicationEClass, PUBLICATION__PUBLICATION);
		createEAttribute(publicationEClass, PUBLICATION__DATE_PUB);
		createEOperation(publicationEClass, PUBLICATION___IS_AUTHOR__PUBLICATION);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__ID_COM);
		createEAttribute(commentEClass, COMMENT__COMMENT);
		createEAttribute(commentEClass, COMMENT__DATE_COM);

		enemityEClass = createEClass(ENEMITY);
		createEReference(enemityEClass, ENEMITY__USER1);
		createEReference(enemityEClass, ENEMITY__USER2);
		createEAttribute(enemityEClass, ENEMITY__DATE_ENEMY);

		friendshipEClass = createEClass(FRIENDSHIP);
		createEReference(friendshipEClass, FRIENDSHIP__USER3);
		createEReference(friendshipEClass, FRIENDSHIP__USER4);
		createEAttribute(friendshipEClass, FRIENDSHIP__DATE_FRIEND);

		authorshipEClass = createEClass(AUTHORSHIP);
		createEReference(authorshipEClass, AUTHORSHIP__AUTHOR);
		createEReference(authorshipEClass, AUTHORSHIP__PUBLI);

		publiRefEClass = createEClass(PUBLI_REF);
		createEReference(publiRefEClass, PUBLI_REF__PUBLI);
		createEReference(publiRefEClass, PUBLI_REF__PUBLI_REF);
		createEOperation(publiRefEClass, PUBLI_REF___IS_AUTHOR__PUBLICATION);
		createEOperation(publiRefEClass, PUBLI_REF___IS_FRIEND__USER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(friendzEClass, Friendz.class, "Friendz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFriendz_Users(), this.getUser(), null, "users", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_Friendships(), this.getFriendship(), null, "friendships", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_Enemities(), this.getEnemity(), null, "enemities", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_Publications(), this.getPublication(), null, "publications", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_Comments(), this.getComment(), null, "comments", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_Authorships(), this.getAuthorship(), null, "authorships", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendz_PubliRefs(), this.getPubliRef(), null, "publiRefs", null, 0, -1, Friendz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_IdUser(), ecorePackage.getEString(), "idUser", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublication_IdPub(), ecorePackage.getEString(), "idPub", null, 1, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_Publication(), ecorePackage.getEString(), "publication", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_DatePub(), ecorePackage.getEDate(), "datePub", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPublication__IsAuthor__Publication(), this.getUser(), "isAuthor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPublication(), "p", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_IdCom(), ecorePackage.getEString(), "idCom", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_DateCom(), ecorePackage.getEDate(), "dateCom", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enemityEClass, Enemity.class, "Enemity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnemity_User1(), this.getUser(), null, "user1", null, 0, 1, Enemity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnemity_User2(), this.getUser(), null, "user2", null, 0, 1, Enemity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemity_DateEnemy(), ecorePackage.getEDate(), "dateEnemy", null, 0, 1, Enemity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(friendshipEClass, Friendship.class, "Friendship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFriendship_User3(), this.getUser(), null, "user3", null, 0, 1, Friendship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriendship_User4(), this.getUser(), null, "user4", null, 0, 1, Friendship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFriendship_DateFriend(), ecorePackage.getEDate(), "dateFriend", null, 0, 1, Friendship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorshipEClass, Authorship.class, "Authorship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorship_Author(), this.getUser(), null, "author", null, 0, 1, Authorship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorship_Publi(), this.getPublication(), null, "publi", null, 0, 1, Authorship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publiRefEClass, PubliRef.class, "PubliRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPubliRef_Publi(), this.getPublication(), null, "publi", null, 0, 1, PubliRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubliRef_PubliRef(), this.getPublication(), null, "publiRef", null, 0, 1, PubliRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPubliRef__IsAuthor__Publication(), this.getUser(), "isAuthor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPublication(), "p", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPubliRef__IsFriend__User(), this.getUser(), "isFriend", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUser(), "u", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (userEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueId"
		   });	
		addAnnotation
		  (publicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueId"
		   });	
		addAnnotation
		  (enemityEClass, 
		   source, 
		   new String[] {
			 "constraints", "Relation"
		   });	
		addAnnotation
		  (friendshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "Relation"
		   });	
		addAnnotation
		  (publiRefEClass, 
		   source, 
		   new String[] {
			 "constraints", "Relation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (userEClass, 
		   source, 
		   new String[] {
			 "UniqueId", "Tuple {\n\tmessage : String = \'User must have a unique id\',\n\tstatus : Boolean = \n\t\tUser.allInstances () -> forAll (u1, u2 | u1 <> u2 implies u1.idUser <> u2.idUser)\n}.status"
		   });	
		addAnnotation
		  (publicationEClass, 
		   source, 
		   new String[] {
			 "UniqueId", "Tuple {\n\tmessage : String = \'User must have a unique id\',\n\tstatus : Boolean = \n\t\tPublication.allInstances () -> forAll (p1, p2 | p1 <> p2 implies p1.idPub <> p2.idPub)\n}.status"
		   });	
		addAnnotation
		  (getPublication__IsAuthor__Publication(), 
		   source, 
		   new String[] {
			 "body", "self ->select(u : User | Authorship.publi = p) "
		   });	
		addAnnotation
		  (enemityEClass, 
		   source, 
		   new String[] {
			 "Relation", "Tuple {\n\tmessage : String = \'User1 must be different from user2\',\n\tstatus : Boolean = \n\t\tself.user1 <> self.user2 \n}.status"
		   });	
		addAnnotation
		  (friendshipEClass, 
		   source, 
		   new String[] {
			 "Relation", "Tuple {\n\tmessage : String = \'User1 must be different from user2\',\n\tstatus : Boolean = \n\t\tself.user1 <> self.user2 \n}.status"
		   });	
		addAnnotation
		  (publiRefEClass, 
		   source, 
		   new String[] {
			 "Relation", "Tuple {\n\tmessage : String = \'Publication must be different from Origin publication\',\n\tstatus : Boolean = \n\t\tself.publi <> self.publiRef \n}.status"
		   });	
		addAnnotation
		  (getPubliRef__IsAuthor__Publication(), 
		   source, 
		   new String[] {
			 "body", "self ->select(u : User | Authorship.publi = p) "
		   });	
		addAnnotation
		  (getPubliRef__IsFriend__User(), 
		   source, 
		   new String[] {
			 "body", "self ->select(u2 : User | Friendship.user1 = u) "
		   });
	}

} //FriendzPackageImpl
