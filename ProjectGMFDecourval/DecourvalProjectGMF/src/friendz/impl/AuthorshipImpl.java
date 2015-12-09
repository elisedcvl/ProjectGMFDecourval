/**
 */
package friendz.impl;

import friendz.Authorship;
import friendz.FriendzPackage;
import friendz.Publication;
import friendz.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.AuthorshipImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link friendz.impl.AuthorshipImpl#getPubli <em>Publi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorshipImpl extends MinimalEObjectImpl.Container implements Authorship {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.AUTHORSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(User newAuthor, NotificationChain msgs) {
		User oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.AUTHORSHIP__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(User newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.AUTHORSHIP__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.AUTHORSHIP__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.AUTHORSHIP__AUTHOR, newAuthor, newAuthor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FriendzPackage.AUTHORSHIP__PUBLI, oldPubli, newPubli);
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
				msgs = ((InternalEObject)publi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.AUTHORSHIP__PUBLI, null, msgs);
			if (newPubli != null)
				msgs = ((InternalEObject)newPubli).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FriendzPackage.AUTHORSHIP__PUBLI, null, msgs);
			msgs = basicSetPubli(newPubli, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FriendzPackage.AUTHORSHIP__PUBLI, newPubli, newPubli));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FriendzPackage.AUTHORSHIP__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FriendzPackage.AUTHORSHIP__PUBLI:
				return basicSetPubli(null, msgs);
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
			case FriendzPackage.AUTHORSHIP__AUTHOR:
				return getAuthor();
			case FriendzPackage.AUTHORSHIP__PUBLI:
				return getPubli();
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
			case FriendzPackage.AUTHORSHIP__AUTHOR:
				setAuthor((User)newValue);
				return;
			case FriendzPackage.AUTHORSHIP__PUBLI:
				setPubli((Publication)newValue);
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
			case FriendzPackage.AUTHORSHIP__AUTHOR:
				setAuthor((User)null);
				return;
			case FriendzPackage.AUTHORSHIP__PUBLI:
				setPubli((Publication)null);
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
			case FriendzPackage.AUTHORSHIP__AUTHOR:
				return author != null;
			case FriendzPackage.AUTHORSHIP__PUBLI:
				return publi != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorshipImpl
