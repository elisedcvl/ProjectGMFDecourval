/**
 */
package friendz.impl;

import friendz.FriendzPackage;
import friendz.Publication;
import friendz.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.PublicationImpl#getIdPub <em>Id Pub</em>}</li>
 *   <li>{@link friendz.impl.PublicationImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link friendz.impl.PublicationImpl#getDatePub <em>Date Pub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationImpl extends MinimalEObjectImpl.Container implements Publication {
	/**
	 * The default value of the '{@link #getIdPub() <em>Id Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPub()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PUB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdPub() <em>Id Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPub()
	 * @generated
	 * @ordered
	 */
	protected String idPub = ID_PUB_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublication() <em>Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublication() <em>Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected String publication = PUBLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePub() <em>Date Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePub()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PUB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePub() <em>Date Pub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePub()
	 * @generated
	 * @ordered
	 */
	protected Date datePub = DATE_PUB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.PUBLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPub() {
		return idPub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPub(String newIdPub) {
		String oldIdPub = idPub;
		idPub = newIdPub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLICATION__ID_PUB, oldIdPub, idPub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublication() {
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublication(String newPublication) {
		String oldPublication = publication;
		publication = newPublication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLICATION__PUBLICATION, oldPublication, publication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePub() {
		return datePub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePub(Date newDatePub) {
		Date oldDatePub = datePub;
		datePub = newDatePub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLICATION__DATE_PUB, oldDatePub, datePub));
	}

	/**
	 * The cached invocation delegate for the '{@link #isAuthor(friendz.Publication) <em>Is Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthor(friendz.Publication)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_AUTHOR_PUBLICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)FriendzPackage.Literals.PUBLICATION___IS_AUTHOR__PUBLICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User isAuthor(Publication p) {
		try {
			return (User)IS_AUTHOR_PUBLICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{p}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FriendzPackage.PUBLICATION__ID_PUB:
				return getIdPub();
			case FriendzPackage.PUBLICATION__PUBLICATION:
				return getPublication();
			case FriendzPackage.PUBLICATION__DATE_PUB:
				return getDatePub();
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
			case FriendzPackage.PUBLICATION__ID_PUB:
				setIdPub((String)newValue);
				return;
			case FriendzPackage.PUBLICATION__PUBLICATION:
				setPublication((String)newValue);
				return;
			case FriendzPackage.PUBLICATION__DATE_PUB:
				setDatePub((Date)newValue);
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
			case FriendzPackage.PUBLICATION__ID_PUB:
				setIdPub(ID_PUB_EDEFAULT);
				return;
			case FriendzPackage.PUBLICATION__PUBLICATION:
				setPublication(PUBLICATION_EDEFAULT);
				return;
			case FriendzPackage.PUBLICATION__DATE_PUB:
				setDatePub(DATE_PUB_EDEFAULT);
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
			case FriendzPackage.PUBLICATION__ID_PUB:
				return ID_PUB_EDEFAULT == null ? idPub != null : !ID_PUB_EDEFAULT.equals(idPub);
			case FriendzPackage.PUBLICATION__PUBLICATION:
				return PUBLICATION_EDEFAULT == null ? publication != null : !PUBLICATION_EDEFAULT.equals(publication);
			case FriendzPackage.PUBLICATION__DATE_PUB:
				return DATE_PUB_EDEFAULT == null ? datePub != null : !DATE_PUB_EDEFAULT.equals(datePub);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FriendzPackage.PUBLICATION___IS_AUTHOR__PUBLICATION:
				return isAuthor((Publication)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (idPub: ");
		result.append(idPub);
		result.append(", publication: ");
		result.append(publication);
		result.append(", datePub: ");
		result.append(datePub);
		result.append(')');
		return result.toString();
	}

} //PublicationImpl
