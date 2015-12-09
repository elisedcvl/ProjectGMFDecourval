/**
 */
package friendz.impl;

import friendz.Enemity;
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
 * An implementation of the model object '<em><b>Enemity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.EnemityImpl#getUser1 <em>User1</em>}</li>
 *   <li>{@link friendz.impl.EnemityImpl#getUser2 <em>User2</em>}</li>
 *   <li>{@link friendz.impl.EnemityImpl#getDateEnemy <em>Date Enemy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnemityImpl extends MinimalEObjectImpl.Container implements Enemity {
	/**
	 * The cached value of the '{@link #getUser1() <em>User1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser1()
	 * @generated
	 * @ordered
	 */
	protected User user1;

	/**
	 * The cached value of the '{@link #getUser2() <em>User2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser2()
	 * @generated
	 * @ordered
	 */
	protected User user2;

	/**
	 * The default value of the '{@link #getDateEnemy() <em>Date Enemy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnemy()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ENEMY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnemy() <em>Date Enemy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnemy()
	 * @generated
	 * @ordered
	 */
	protected Date dateEnemy = DATE_ENEMY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnemityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.ENEMITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser1() {
		return user1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser1(User newUser1, NotificationChain msgs) {
		User oldUser1 = user1;
		user1 = newUser1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.ENEMITY__USER1, oldUser1, newUser1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser1(User newUser1) {
		if (newUser1 != user1) {
			NotificationChain msgs = null;
			if (user1 != null)
				msgs = ((InternalEObject)user1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.ENEMITY__USER1, null, msgs);
			if (newUser1 != null)
				msgs = ((InternalEObject)newUser1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.ENEMITY__USER1, null, msgs);
			msgs = basicSetUser1(newUser1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.ENEMITY__USER1, newUser1, newUser1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser2() {
		return user2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser2(User newUser2, NotificationChain msgs) {
		User oldUser2 = user2;
		user2 = newUser2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.ENEMITY__USER2, oldUser2, newUser2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser2(User newUser2) {
		if (newUser2 != user2) {
			NotificationChain msgs = null;
			if (user2 != null)
				msgs = ((InternalEObject)user2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.ENEMITY__USER2, null, msgs);
			if (newUser2 != null)
				msgs = ((InternalEObject)newUser2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.ENEMITY__USER2, null, msgs);
			msgs = basicSetUser2(newUser2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.ENEMITY__USER2, newUser2, newUser2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEnemy() {
		return dateEnemy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnemy(Date newDateEnemy) {
		Date oldDateEnemy = dateEnemy;
		dateEnemy = newDateEnemy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.ENEMITY__DATE_ENEMY, oldDateEnemy, dateEnemy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FriendzPackage.ENEMITY__USER1:
				return basicSetUser1(null, msgs);
			case FriendzPackage.ENEMITY__USER2:
				return basicSetUser2(null, msgs);
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
			case FriendzPackage.ENEMITY__USER1:
				return getUser1();
			case FriendzPackage.ENEMITY__USER2:
				return getUser2();
			case FriendzPackage.ENEMITY__DATE_ENEMY:
				return getDateEnemy();
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
			case FriendzPackage.ENEMITY__USER1:
				setUser1((User)newValue);
				return;
			case FriendzPackage.ENEMITY__USER2:
				setUser2((User)newValue);
				return;
			case FriendzPackage.ENEMITY__DATE_ENEMY:
				setDateEnemy((Date)newValue);
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
			case FriendzPackage.ENEMITY__USER1:
				setUser1((User)null);
				return;
			case FriendzPackage.ENEMITY__USER2:
				setUser2((User)null);
				return;
			case FriendzPackage.ENEMITY__DATE_ENEMY:
				setDateEnemy(DATE_ENEMY_EDEFAULT);
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
			case FriendzPackage.ENEMITY__USER1:
				return user1 != null;
			case FriendzPackage.ENEMITY__USER2:
				return user2 != null;
			case FriendzPackage.ENEMITY__DATE_ENEMY:
				return DATE_ENEMY_EDEFAULT == null ? dateEnemy != null : !DATE_ENEMY_EDEFAULT.equals(dateEnemy);
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
		result.append(" (dateEnemy: ");
		result.append(dateEnemy);
		result.append(')');
		return result.toString();
	}

} //EnemityImpl
