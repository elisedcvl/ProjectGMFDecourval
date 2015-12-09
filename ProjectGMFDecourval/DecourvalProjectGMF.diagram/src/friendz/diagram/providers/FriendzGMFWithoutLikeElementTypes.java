package friendz.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import friendz.FriendzPackage;
import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.CommentEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.PubliRefEditPart;
import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.part.FriendzGMFWithoutLikeDiagramEditorPlugin;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeElementTypes {

	/**
	 * @generated
	 */
	private FriendzGMFWithoutLikeElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Friendz_1000 = getElementType("DecourvalProjectGMF.diagram.Friendz_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType User_2001 = getElementType("DecourvalProjectGMF.diagram.User_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Publication_2002 = getElementType("DecourvalProjectGMF.diagram.Publication_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comment_2003 = getElementType("DecourvalProjectGMF.diagram.Comment_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Authorship_4001 = getElementType("DecourvalProjectGMF.diagram.Authorship_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Friendship_4002 = getElementType("DecourvalProjectGMF.diagram.Friendship_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PubliRef_4003 = getElementType("DecourvalProjectGMF.diagram.PubliRef_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enemity_4004 = getElementType("DecourvalProjectGMF.diagram.Enemity_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Friendz_1000, FriendzPackage.eINSTANCE.getFriendz());

			elements.put(User_2001, FriendzPackage.eINSTANCE.getUser());

			elements.put(Publication_2002,
					FriendzPackage.eINSTANCE.getPublication());

			elements.put(Comment_2003, FriendzPackage.eINSTANCE.getComment());

			elements.put(Authorship_4001,
					FriendzPackage.eINSTANCE.getAuthorship());

			elements.put(Friendship_4002,
					FriendzPackage.eINSTANCE.getFriendship());

			elements.put(PubliRef_4003, FriendzPackage.eINSTANCE.getPubliRef());

			elements.put(Enemity_4004, FriendzPackage.eINSTANCE.getEnemity());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Friendz_1000);
			KNOWN_ELEMENT_TYPES.add(User_2001);
			KNOWN_ELEMENT_TYPES.add(Publication_2002);
			KNOWN_ELEMENT_TYPES.add(Comment_2003);
			KNOWN_ELEMENT_TYPES.add(Authorship_4001);
			KNOWN_ELEMENT_TYPES.add(Friendship_4002);
			KNOWN_ELEMENT_TYPES.add(PubliRef_4003);
			KNOWN_ELEMENT_TYPES.add(Enemity_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FriendzEditPart.VISUAL_ID:
			return Friendz_1000;
		case UserEditPart.VISUAL_ID:
			return User_2001;
		case PublicationEditPart.VISUAL_ID:
			return Publication_2002;
		case CommentEditPart.VISUAL_ID:
			return Comment_2003;
		case AuthorshipEditPart.VISUAL_ID:
			return Authorship_4001;
		case FriendshipEditPart.VISUAL_ID:
			return Friendship_4002;
		case PubliRefEditPart.VISUAL_ID:
			return PubliRef_4003;
		case EnemityEditPart.VISUAL_ID:
			return Enemity_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
