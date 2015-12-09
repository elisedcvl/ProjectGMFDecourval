/**
 */
package friendz.impl;

import friendz.Comment;
import friendz.FriendzPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.CommentImpl#getIdCom <em>Id Com</em>}</li>
 *   <li>{@link friendz.impl.CommentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link friendz.impl.CommentImpl#getDateCom <em>Date Com</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The default value of the '{@link #getIdCom() <em>Id Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCom()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdCom() <em>Id Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCom()
	 * @generated
	 * @ordered
	 */
	protected String idCom = ID_COM_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCom() <em>Date Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCom()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_COM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCom() <em>Date Com</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCom()
	 * @generated
	 * @ordered
	 */
	protected Date dateCom = DATE_COM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdCom() {
		return idCom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCom(String newIdCom) {
		String oldIdCom = idCom;
		idCom = newIdCom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.COMMENT__ID_COM, oldIdCom, idCom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.COMMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCom() {
		return dateCom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCom(Date newDateCom) {
		Date oldDateCom = dateCom;
		dateCom = newDateCom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.COMMENT__DATE_COM, oldDateCom, dateCom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FriendzPackage.COMMENT__ID_COM:
				return getIdCom();
			case FriendzPackage.COMMENT__COMMENT:
				return getComment();
			case FriendzPackage.COMMENT__DATE_COM:
				return getDateCom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FriendzPackage.COMMENT__ID_COM:
				setIdCom((String)newValue);
				return;
			case FriendzPackage.COMMENT__COMMENT:
				setComment((String)newValue);
				return;
			case FriendzPackage.COMMENT__DATE_COM:
				setDateCom((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FriendzPackage.COMMENT__ID_COM:
				setIdCom(ID_COM_EDEFAULT);
				return;
			case FriendzPackage.COMMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case FriendzPackage.COMMENT__DATE_COM:
				setDateCom(DATE_COM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FriendzPackage.COMMENT__ID_COM:
				return ID_COM_EDEFAULT == null ? idCom != null : !ID_COM_EDEFAULT.equals(idCom);
			case FriendzPackage.COMMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case FriendzPackage.COMMENT__DATE_COM:
				return DATE_COM_EDEFAULT == null ? dateCom != null : !DATE_COM_EDEFAULT.equals(dateCom);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idCom: ");
		result.append(idCom);
		result.append(", comment: ");
		result.append(comment);
		result.append(", dateCom: ");
		result.append(dateCom);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
