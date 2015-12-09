/**
 */
package friendz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Authorship#getAuthor <em>Author</em>}</li>
 *   <li>{@link friendz.Authorship#getPubli <em>Publi</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getAuthorship()
 * @model
 * @generated
 */
public interface Authorship extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(User)
	 * @see friendz.FriendzPackage#getAuthorship_Author()
	 * @model containment="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link friendz.Authorship#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

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
	 * @see friendz.FriendzPackage#getAuthorship_Publi()
	 * @model containment="true"
	 * @generated
	 */
	Publication getPubli();

	/**
	 * Sets the value of the '{@link friendz.Authorship#getPubli <em>Publi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publi</em>' containment reference.
	 * @see #getPubli()
	 * @generated
	 */
	void setPubli(Publication value);

} // Authorship
