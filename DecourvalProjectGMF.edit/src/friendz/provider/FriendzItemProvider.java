/**
 */
package friendz.provider;


import friendz.Friendz;
import friendz.FriendzFactory;
import friendz.FriendzPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link friendz.Friendz} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FriendzItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendzItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__USERS);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__FRIENDSHIPS);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__ENEMITIES);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__PUBLICATIONS);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__COMMENTS);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__AUTHORSHIPS);
			childrenFeatures.add(FriendzPackage.Literals.FRIENDZ__PUBLI_REFS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Friendz.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Friendz"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Friendz_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Friendz.class)) {
			case FriendzPackage.FRIENDZ__USERS:
			case FriendzPackage.FRIENDZ__FRIENDSHIPS:
			case FriendzPackage.FRIENDZ__ENEMITIES:
			case FriendzPackage.FRIENDZ__PUBLICATIONS:
			case FriendzPackage.FRIENDZ__COMMENTS:
			case FriendzPackage.FRIENDZ__AUTHORSHIPS:
			case FriendzPackage.FRIENDZ__PUBLI_REFS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__USERS,
				 FriendzFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__FRIENDSHIPS,
				 FriendzFactory.eINSTANCE.createFriendship()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__ENEMITIES,
				 FriendzFactory.eINSTANCE.createEnemity()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__PUBLICATIONS,
				 FriendzFactory.eINSTANCE.createPublication()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__COMMENTS,
				 FriendzFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__AUTHORSHIPS,
				 FriendzFactory.eINSTANCE.createAuthorship()));

		newChildDescriptors.add
			(createChildParameter
				(FriendzPackage.Literals.FRIENDZ__PUBLI_REFS,
				 FriendzFactory.eINSTANCE.createPubliRef()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FriendzGMFWithoutLikeEditPlugin.INSTANCE;
	}

}
