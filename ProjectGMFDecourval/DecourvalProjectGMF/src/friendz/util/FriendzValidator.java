/**
 */
package friendz.util;

import friendz.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see friendz.FriendzPackage
 * @generated
 */
public class FriendzValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FriendzValidator INSTANCE = new FriendzValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "friendz";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendzValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FriendzPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FriendzPackage.FRIENDZ:
				return validateFriendz((Friendz)value, diagnostics, context);
			case FriendzPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case FriendzPackage.PUBLICATION:
				return validatePublication((Publication)value, diagnostics, context);
			case FriendzPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case FriendzPackage.ENEMITY:
				return validateEnemity((Enemity)value, diagnostics, context);
			case FriendzPackage.FRIENDSHIP:
				return validateFriendship((Friendship)value, diagnostics, context);
			case FriendzPackage.AUTHORSHIP:
				return validateAuthorship((Authorship)value, diagnostics, context);
			case FriendzPackage.PUBLI_REF:
				return validatePubliRef((PubliRef)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFriendz(Friendz friendz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(friendz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_UniqueId(user, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueId constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USER__UNIQUE_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'User must have a unique id',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tUser.allInstances () -> forAll (u1, u2 | u1 <> u2 implies u1.idUser <> u2.idUser)\n" +
		"}.status";

	/**
	 * Validates the UniqueId constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_UniqueId(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FriendzPackage.Literals.USER,
				 user,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueId",
				 USER__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublication(Publication publication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(publication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publication, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublication_UniqueId(publication, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueId constraint of '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PUBLICATION__UNIQUE_ID__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'User must have a unique id',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tPublication.allInstances () -> forAll (p1, p2 | p1 <> p2 implies p1.idPub <> p2.idPub)\n" +
		"}.status";

	/**
	 * Validates the UniqueId constraint of '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublication_UniqueId(Publication publication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FriendzPackage.Literals.PUBLICATION,
				 publication,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueId",
				 PUBLICATION__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnemity(Enemity enemity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enemity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enemity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnemity_Relation(enemity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Relation constraint of '<em>Enemity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENEMITY__RELATION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'User1 must be different from user2',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.user1 <> self.user2 \n" +
		"}.status";

	/**
	 * Validates the Relation constraint of '<em>Enemity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnemity_Relation(Enemity enemity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FriendzPackage.Literals.ENEMITY,
				 enemity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Relation",
				 ENEMITY__RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFriendship(Friendship friendship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(friendship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(friendship, diagnostics, context);
		if (result || diagnostics != null) result &= validateFriendship_Relation(friendship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Relation constraint of '<em>Friendship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FRIENDSHIP__RELATION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'User1 must be different from user2',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.user1 <> self.user2 \n" +
		"}.status";

	/**
	 * Validates the Relation constraint of '<em>Friendship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFriendship_Relation(Friendship friendship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FriendzPackage.Literals.FRIENDSHIP,
				 friendship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Relation",
				 FRIENDSHIP__RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorship(Authorship authorship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePubliRef(PubliRef publiRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(publiRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publiRef, diagnostics, context);
		if (result || diagnostics != null) result &= validatePubliRef_Relation(publiRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Relation constraint of '<em>Publi Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PUBLI_REF__RELATION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Publication must be different from Origin publication',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.publi <> self.publiRef \n" +
		"}.status";

	/**
	 * Validates the Relation constraint of '<em>Publi Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePubliRef_Relation(PubliRef publiRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FriendzPackage.Literals.PUBLI_REF,
				 publiRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Relation",
				 PUBLI_REF__RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FriendzValidator
