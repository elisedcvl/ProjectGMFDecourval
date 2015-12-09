/**
 */
package friendz.impl;

import friendz.Friendship;
import friendz.FriendzPackage;
import friendz.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friendship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.FriendshipImpl#getUser3 <em>User3</em>}</li>
 *   <li>{@link friendz.impl.FriendshipImpl#getUser4 <em>User4</em>}</li>
 *   <li>{@link friendz.impl.FriendshipImpl#getDateFriend <em>Date Friend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FriendshipImpl extends MinimalEObjectImpl.Container implements Friendship {
	/**
	 * The cached value of the '{@link #getUser3() <em>User3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser3()
	 * @generated
	 * @ordered
	 */
	protected User user3;

	/**
	 * The cached value of the '{@link #getUser4() <em>User4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser4()
	 * @generated
	 * @ordered
	 */
	protected User user4;

	/**
	 * The default value of the '{@link #getDateFriend() <em>Date Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFriend()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FRIEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFriend() <em>Date Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFriend()
	 * @generated
	 * @ordered
	 */
	protected Date dateFriend = DATE_FRIEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FriendshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.FRIENDSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser3() {
		return user3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser3(User newUser3, NotificationChain msgs) {
		User oldUser3 = user3;
		user3 = newUser3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.FRIENDSHIP__USER3, oldUser3, newUser3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser3(User newUser3) {
		if (newUser3 != user3) {
			NotificationChain msgs = null;
			if (user3 != null)
				msgs = ((InternalEObject)user3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.FRIENDSHIP__USER3, null, msgs);
			if (newUser3 != null)
				msgs = ((InternalEObject)newUser3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.FRIENDSHIP__USER3, null, msgs);
			msgs = basicSetUser3(newUser3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.FRIENDSHIP__USER3, newUser3, newUser3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser4() {
		return user4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser4(User newUser4, NotificationChain msgs) {
		User oldUser4 = user4;
		user4 = newUser4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.FRIENDSHIP__USER4, oldUser4, newUser4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser4(User newUser4) {
		if (newUser4 != user4) {
			NotificationChain msgs = null;
			if (user4 != null)
				msgs = ((InternalEObject)user4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.FRIENDSHIP__USER4, null, msgs);
			if (newUser4 != null)
				msgs = ((InternalEObject)newUser4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.FRIENDSHIP__USER4, null, msgs);
			msgs = basicSetUser4(newUser4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.FRIENDSHIP__USER4, newUser4, newUser4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFriend() {
		return dateFriend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFriend(Date newDateFriend) {
		Date oldDateFriend = dateFriend;
		dateFriend = newDateFriend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.FRIENDSHIP__DATE_FRIEND, oldDateFriend, dateFriend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FriendzPackage.FRIENDSHIP__USER3:
				return basicSetUser3(null, msgs);
			case FriendzPackage.FRIENDSHIP__USER4:
				return basicSetUser4(null, msgs);
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
			case FriendzPackage.FRIENDSHIP__USER3:
				return getUser3();
			case FriendzPackage.FRIENDSHIP__USER4:
				return getUser4();
			case FriendzPackage.FRIENDSHIP__DATE_FRIEND:
				return getDateFriend();
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
			case FriendzPackage.FRIENDSHIP__USER3:
				setUser3((User)newValue);
				return;
			case FriendzPackage.FRIENDSHIP__USER4:
				setUser4((User)newValue);
				return;
			case FriendzPackage.FRIENDSHIP__DATE_FRIEND:
				setDateFriend((Date)newValue);
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
			case FriendzPackage.FRIENDSHIP__USER3:
				setUser3((User)null);
				return;
			case FriendzPackage.FRIENDSHIP__USER4:
				setUser4((User)null);
				return;
			case FriendzPackage.FRIENDSHIP__DATE_FRIEND:
				setDateFriend(DATE_FRIEND_EDEFAULT);
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
			case FriendzPackage.FRIENDSHIP__USER3:
				return user3 != null;
			case FriendzPackage.FRIENDSHIP__USER4:
				return user4 != null;
			case FriendzPackage.FRIENDSHIP__DATE_FRIEND:
				return DATE_FRIEND_EDEFAULT == null ? dateFriend != null : !DATE_FRIEND_EDEFAULT.equals(dateFriend);
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
		result.append(" (dateFriend: ");
		result.append(dateFriend);
		result.append(')');
		return result.toString();
	}

} //FriendshipImpl
