/**
 */
package friendz.impl;

import friendz.Authorship;
import friendz.Comment;
import friendz.Enemity;
import friendz.Friendship;
import friendz.Friendz;
import friendz.FriendzPackage;
import friendz.PubliRef;
import friendz.Publication;
import friendz.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friendz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link friendz.impl.FriendzImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getFriendships <em>Friendships</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getEnemities <em>Enemities</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getPublications <em>Publications</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getAuthorships <em>Authorships</em>}</li>
 *   <li>{@link friendz.impl.FriendzImpl#getPubliRefs <em>Publi Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FriendzImpl extends MinimalEObjectImpl.Container implements Friendz {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getFriendships() <em>Friendships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendships()
	 * @generated
	 * @ordered
	 */
	protected EList<Friendship> friendships;

	/**
	 * The cached value of the '{@link #getEnemities() <em>Enemities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemities()
	 * @generated
	 * @ordered
	 */
	protected EList<Enemity> enemities;

	/**
	 * The cached value of the '{@link #getPublications() <em>Publications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublications()
	 * @generated
	 * @ordered
	 */
	protected EList<Publication> publications;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getAuthorships() <em>Authorships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorships()
	 * @generated
	 * @ordered
	 */
	protected EList<Authorship> authorships;

	/**
	 * The cached value of the '{@link #getPubliRefs() <em>Publi Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubliRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<PubliRef> publiRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FriendzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FriendzPackage.Literals.FRIENDZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, FriendzPackage.FRIENDZ__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Friendship> getFriendships() {
		if (friendships == null) {
			friendships = new EObjectContainmentEList<Friendship>(Friendship.class, this, FriendzPackage.FRIENDZ__FRIENDSHIPS);
		}
		return friendships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enemity> getEnemities() {
		if (enemities == null) {
			enemities = new EObjectContainmentEList<Enemity>(Enemity.class, this, FriendzPackage.FRIENDZ__ENEMITIES);
		}
		return enemities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publication> getPublications() {
		if (publications == null) {
			publications = new EObjectContainmentEList<Publication>(Publication.class, this, FriendzPackage.FRIENDZ__PUBLICATIONS);
		}
		return publications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, FriendzPackage.FRIENDZ__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authorship> getAuthorships() {
		if (authorships == null) {
			authorships = new EObjectContainmentEList<Authorship>(Authorship.class, this, FriendzPackage.FRIENDZ__AUTHORSHIPS);
		}
		return authorships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PubliRef> getPubliRefs() {
		if (publiRefs == null) {
			publiRefs = new EObjectContainmentEList<PubliRef>(PubliRef.class, this, FriendzPackage.FRIENDZ__PUBLI_REFS);
		}
		return publiRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FriendzPackage.FRIENDZ__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
				return ((InternalEList<?>)getFriendships()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__ENEMITIES:
				return ((InternalEList<?>)getEnemities()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
				return ((InternalEList<?>)getPublications()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
				return ((InternalEList<?>)getAuthorships()).basicRemove(otherEnd, msgs);
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				return ((InternalEList<?>)getPubliRefs()).basicRemove(otherEnd, msgs);
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
			case FriendzPackage.FRIENDZ__USERS:
				return getUsers();
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
				return getFriendships();
			case FriendzPackage.FRIENDZ__ENEMITIES:
				return getEnemities();
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
				return getPublications();
			case FriendzPackage.FRIENDZ__COMMENTS:
				return getComments();
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
				return getAuthorships();
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				return getPubliRefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FriendzPackage.FRIENDZ__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
				getFriendships().clear();
				getFriendships().addAll((Collection<? extends Friendship>)newValue);
				return;
			case FriendzPackage.FRIENDZ__ENEMITIES:
				getEnemities().clear();
				getEnemities().addAll((Collection<? extends Enemity>)newValue);
				return;
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
				getPublications().clear();
				getPublications().addAll((Collection<? extends Publication>)newValue);
				return;
			case FriendzPackage.FRIENDZ__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
				getAuthorships().clear();
				getAuthorships().addAll((Collection<? extends Authorship>)newValue);
				return;
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				getPubliRefs().clear();
				getPubliRefs().addAll((Collection<? extends PubliRef>)newValue);
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
			case FriendzPackage.FRIENDZ__USERS:
				getUsers().clear();
				return;
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
				getFriendships().clear();
				return;
			case FriendzPackage.FRIENDZ__ENEMITIES:
				getEnemities().clear();
				return;
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
				getPublications().clear();
				return;
			case FriendzPackage.FRIENDZ__COMMENTS:
				getComments().clear();
				return;
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
				getAuthorships().clear();
				return;
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				getPubliRefs().clear();
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
			case FriendzPackage.FRIENDZ__USERS:
				return users != null && !users.isEmpty();
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
				return friendships != null && !friendships.isEmpty();
			case FriendzPackage.FRIENDZ__ENEMITIES:
				return enemities != null && !enemities.isEmpty();
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
				return publications != null && !publications.isEmpty();
			case FriendzPackage.FRIENDZ__COMMENTS:
				return comments != null && !comments.isEmpty();
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
				return authorships != null && !authorships.isEmpty();
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				return publiRefs != null && !publiRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FriendzImpl
