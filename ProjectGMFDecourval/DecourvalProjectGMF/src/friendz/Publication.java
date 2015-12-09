/**
 */
package friendz;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link friendz.Publication#getIdPub <em>Id Pub</em>}</li>
 *   <li>{@link friendz.Publication#getPublication <em>Publication</em>}</li>
 *   <li>{@link friendz.Publication#getDatePub <em>Date Pub</em>}</li>
 * </ul>
 * </p>
 *
 * @see friendz.FriendzPackage#getPublication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueId='Tuple {\n\tmessage : String = \'User must have a unique id\',\n\tstatus : Boolean = \n\t\tPublication.allInstances () -> forAll (p1, p2 | p1 <> p2 implies p1.idPub <> p2.idPub)\n}.status'"
 * @generated
 */
public interface Publication extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Pub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pub</em>' attribute.
	 * @see #setIdPub(String)
	 * @see friendz.FriendzPackage#getPublication_IdPub()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdPub();

	/**
	 * Sets the value of the '{@link friendz.Publication#getIdPub <em>Id Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pub</em>' attribute.
	 * @see #getIdPub()
	 * @generated
	 */
	void setIdPub(String value);

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication</em>' attribute.
	 * @see #setPublication(String)
	 * @see friendz.FriendzPackage#getPublication_Publication()
	 * @model
	 * @generated
	 */
	String getPublication();

	/**
	 * Sets the value of the '{@link friendz.Publication#getPublication <em>Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication</em>' attribute.
	 * @see #getPublication()
	 * @generated
	 */
	void setPublication(String value);

	/**
	 * Returns the value of the '<em><b>Date Pub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Pub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Pub</em>' attribute.
	 * @see #setDatePub(Date)
	 * @see friendz.FriendzPackage#getPublication_DatePub()
	 * @model
	 * @generated
	 */
	Date getDatePub();

	/**
	 * Sets the value of the '{@link friendz.Publication#getDatePub <em>Date Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Pub</em>' attribute.
	 * @see #getDatePub()
	 * @generated
	 */
	void setDatePub(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self ->select(u : User | Authorship.publi = p) '"
	 * @generated
	 */
	User isAuthor(Publication p);

} // Publication
