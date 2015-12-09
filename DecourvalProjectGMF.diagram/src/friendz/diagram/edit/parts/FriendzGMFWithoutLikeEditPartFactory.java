package friendz.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {

			case FriendzEditPart.VISUAL_ID:
				return new FriendzEditPart(view);

			case UserEditPart.VISUAL_ID:
				return new UserEditPart(view);

			case UserFirstNameLastNameEditPart.VISUAL_ID:
				return new UserFirstNameLastNameEditPart(view);

			case PublicationEditPart.VISUAL_ID:
				return new PublicationEditPart(view);

			case PublicationPublicationEditPart.VISUAL_ID:
				return new PublicationPublicationEditPart(view);

			case CommentEditPart.VISUAL_ID:
				return new CommentEditPart(view);

			case CommentCommentEditPart.VISUAL_ID:
				return new CommentCommentEditPart(view);

			case AuthorshipEditPart.VISUAL_ID:
				return new AuthorshipEditPart(view);

			case FriendshipEditPart.VISUAL_ID:
				return new FriendshipEditPart(view);

			case PubliRefEditPart.VISUAL_ID:
				return new PubliRefEditPart(view);

			case EnemityEditPart.VISUAL_ID:
				return new EnemityEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
