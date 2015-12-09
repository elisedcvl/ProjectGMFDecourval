/**
 */
package friendz;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Comment#getIdCom <em>Id Com</em>}</li>
 *   <li>{@link friendz.Comment#getComment <em>Comment</em>}</li>
 *   <li>{@link friendz.Comment#getDateCom <em>Date Com</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Com</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Com</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Com</em>' attribute.
	 * @see #setIdCom(String)
	 * @see friendz.FriendzPackage#getComment_IdCom()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdCom();

	/**
	 * Sets the value of the '{@link friendz.Comment#getIdCom <em>Id Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Com</em>' attribute.
	 * @see #getIdCom()
	 * @generated
	 */
	void setIdCom(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see friendz.FriendzPackage#getComment_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link friendz.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Date Com</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Com</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Com</em>' attribute.
	 * @see #setDateCom(Date)
	 * @see friendz.FriendzPackage#getComment_DateCom()
	 * @model
	 * @generated
	 */
	Date getDateCom();

	/**
	 * Sets the value of the '{@link friendz.Comment#getDateCom <em>Date Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Com</em>' attribute.
	 * @see #getDateCom()
	 * @generated
	 */
	void setDateCom(Date value);

} // Comment
