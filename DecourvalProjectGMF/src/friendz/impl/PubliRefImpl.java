/**
 */
package friendz.impl;

import friendz.FriendzPackage;
import friendz.PubliRef;
import friendz.Publication;
import friendz.User;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publi Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.PubliRefImpl#getPubli <em>Publi</em>}</li>
 *   <li>{@link friendz.impl.PubliRefImpl#getPubliRef <em>Publi Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PubliRefImpl extends MinimalEObjectImpl.Container implements PubliRef {
	/**
	 * The cached value of the '{@link #getPubli() <em>Publi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubli()
	 * @generated
	 * @ordered
	 */
	protected Publication publi;

	/**
	 * The cached value of the '{@link #getPubliRef() <em>Publi Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubliRef()
	 * @generated
	 * @ordered
	 */
	protected Publication publiRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubliRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.PUBLI_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publication getPubli() {
		return publi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubli(Publication newPubli, NotificationChain msgs) {
		Publication oldPubli = publi;
		publi = newPubli;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLI_REF__PUBLI, oldPubli, newPubli);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubli(Publication newPubli) {
		if (newPubli != publi) {
			NotificationChain msgs = null;
			if (publi != null)
				msgs = ((InternalEObject)publi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.PUBLI_REF__PUBLI, null, msgs);
			if (newPubli != null)
				msgs = ((InternalEObject)newPubli).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.PUBLI_REF__PUBLI, null, msgs);
			msgs = basicSetPubli(newPubli, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLI_REF__PUBLI, newPubli, newPubli));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publication getPubliRef() {
		return publiRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPubliRef(Publication newPubliRef, NotificationChain msgs) {
		Publication oldPubliRef = publiRef;
		publiRef = newPubliRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLI_REF__PUBLI_REF, oldPubliRef, newPubliRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubliRef(Publication newPubliRef) {
		if (newPubliRef != publiRef) {
			NotificationChain msgs = null;
			if (publiRef != null)
				msgs = ((InternalEObject)publiRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.PUBLI_REF__PUBLI_REF, null, msgs);
			if (newPubliRef != null)
				msgs = ((InternalEObject)newPubliRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.PUBLI_REF__PUBLI_REF, null, msgs);
			msgs = basicSetPubliRef(newPubliRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.PUBLI_REF__PUBLI_REF, newPubliRef, newPubliRef));
	}

	/**
	 * The cached invocation delegate for the '{@link #isAuthor(friendz.Publication) <em>Is Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthor(friendz.Publication)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_AUTHOR_PUBLICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)FriendzPackage.Literals.PUBLI_REF___IS_AUTHOR__PUBLICATION).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #isFriend(friendz.User) <em>Is Friend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFriend(friendz.User)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FRIEND_USER__EINVOCATION_DELEGATE = ((EOperation.Internal)FriendzPackage.Literals.PUBLI_REF___IS_FRIEND__USER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> isFriend(User u) {
		try {
			return (EList<User>)IS_FRIEND_USER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{u}));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FriendzPackage.PUBLI_REF__PUBLI:
				return basicSetPubli(null, msgs);
			case FriendzPackage.PUBLI_REF__PUBLI_REF:
				return basicSetPubliRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FriendzPackage.PUBLI_REF__PUBLI:
				return getPubli();
			case FriendzPackage.PUBLI_REF__PUBLI_REF:
				return getPubliRef();
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
			case FriendzPackage.PUBLI_REF__PUBLI:
				setPubli((Publication)newValue);
				return;
			case FriendzPackage.PUBLI_REF__PUBLI_REF:
				setPubliRef((Publication)newValue);
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
			case FriendzPackage.PUBLI_REF__PUBLI:
				setPubli((Publication)null);
				return;
			case FriendzPackage.PUBLI_REF__PUBLI_REF:
				setPubliRef((Publication)null);
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
			case FriendzPackage.PUBLI_REF__PUBLI:
				return publi != null;
			case FriendzPackage.PUBLI_REF__PUBLI_REF:
				return publiRef != null;
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
			case FriendzPackage.PUBLI_REF___IS_AUTHOR__PUBLICATION:
				return isAuthor((Publication)arguments.get(0));
			case FriendzPackage.PUBLI_REF___IS_FRIEND__USER:
				return isFriend((User)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PubliRefImpl
