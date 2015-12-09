package friendz.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import friendz.Enemity;
import friendz.Friendship;
import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.CommentCommentEditPart;
import friendz.diagram.edit.parts.CommentEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.PubliRefEditPart;
import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.PublicationPublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.edit.parts.UserFirstNameLastNameEditPart;
import friendz.diagram.part.FriendzGMFWithoutLikeDiagramEditorPlugin;
import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;
import friendz.diagram.providers.FriendzGMFWithoutLikeParserProvider;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FriendzGMFWithoutLikeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FriendzGMFWithoutLikeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FriendzGMFWithoutLikeNavigatorItem
				&& !isOwnView(((FriendzGMFWithoutLikeNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FriendzGMFWithoutLikeNavigatorGroup) {
			FriendzGMFWithoutLikeNavigatorGroup group = (FriendzGMFWithoutLikeNavigatorGroup) element;
			return FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof FriendzGMFWithoutLikeNavigatorItem) {
			FriendzGMFWithoutLikeNavigatorItem navigatorItem = (FriendzGMFWithoutLikeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case FriendzEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?friendz.ecore?Friendz", FriendzGMFWithoutLikeElementTypes.Friendz_1000); //$NON-NLS-1$
		case UserEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?friendz.ecore?User", FriendzGMFWithoutLikeElementTypes.User_2001); //$NON-NLS-1$
		case PublicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?friendz.ecore?Publication", FriendzGMFWithoutLikeElementTypes.Publication_2002); //$NON-NLS-1$
		case CommentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?friendz.ecore?Comment", FriendzGMFWithoutLikeElementTypes.Comment_2003); //$NON-NLS-1$
		case AuthorshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?friendz.ecore?Authorship", FriendzGMFWithoutLikeElementTypes.Authorship_4001); //$NON-NLS-1$
		case FriendshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?friendz.ecore?Friendship", FriendzGMFWithoutLikeElementTypes.Friendship_4002); //$NON-NLS-1$
		case PubliRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?friendz.ecore?PubliRef", FriendzGMFWithoutLikeElementTypes.PubliRef_4003); //$NON-NLS-1$
		case EnemityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?friendz.ecore?Enemity", FriendzGMFWithoutLikeElementTypes.Enemity_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FriendzGMFWithoutLikeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& FriendzGMFWithoutLikeElementTypes
						.isKnownElementType(elementType)) {
			image = FriendzGMFWithoutLikeElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FriendzGMFWithoutLikeNavigatorGroup) {
			FriendzGMFWithoutLikeNavigatorGroup group = (FriendzGMFWithoutLikeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FriendzGMFWithoutLikeNavigatorItem) {
			FriendzGMFWithoutLikeNavigatorItem navigatorItem = (FriendzGMFWithoutLikeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case FriendzEditPart.VISUAL_ID:
			return getFriendz_1000Text(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2001Text(view);
		case PublicationEditPart.VISUAL_ID:
			return getPublication_2002Text(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2003Text(view);
		case AuthorshipEditPart.VISUAL_ID:
			return getAuthorship_4001Text(view);
		case FriendshipEditPart.VISUAL_ID:
			return getFriendship_4002Text(view);
		case PubliRefEditPart.VISUAL_ID:
			return getPubliRef_4003Text(view);
		case EnemityEditPart.VISUAL_ID:
			return getEnemity_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFriendz_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUser_2001Text(View view) {
		IParser parser = FriendzGMFWithoutLikeParserProvider.getParser(
				FriendzGMFWithoutLikeElementTypes.User_2001,
				view.getElement() != null ? view.getElement() : view,
				FriendzGMFWithoutLikeVisualIDRegistry
						.getType(UserFirstNameLastNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPublication_2002Text(View view) {
		IParser parser = FriendzGMFWithoutLikeParserProvider.getParser(
				FriendzGMFWithoutLikeElementTypes.Publication_2002, view
						.getElement() != null ? view.getElement() : view,
				FriendzGMFWithoutLikeVisualIDRegistry
						.getType(PublicationPublicationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComment_2003Text(View view) {
		IParser parser = FriendzGMFWithoutLikeParserProvider.getParser(
				FriendzGMFWithoutLikeElementTypes.Comment_2003, view
						.getElement() != null ? view.getElement() : view,
				FriendzGMFWithoutLikeVisualIDRegistry
						.getType(CommentCommentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAuthorship_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFriendship_4002Text(View view) {
		Friendship domainModelElement = (Friendship) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getDateFriend());
		} else {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPubliRef_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnemity_4004Text(View view) {
		Enemity domainModelElement = (Enemity) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getDateEnemy());
		} else {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FriendzEditPart.MODEL_ID
				.equals(FriendzGMFWithoutLikeVisualIDRegistry.getModelID(view));
	}

}
