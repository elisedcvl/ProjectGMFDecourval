package friendz.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import friendz.diagram.edit.commands.CommentCreateCommand;
import friendz.diagram.edit.commands.PublicationCreateCommand;
import friendz.diagram.edit.commands.UserCreateCommand;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;

/**
 * @generated
 */
public class FriendzItemSemanticEditPolicy extends
		FriendzGMFWithoutLikeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FriendzItemSemanticEditPolicy() {
		super(FriendzGMFWithoutLikeElementTypes.Friendz_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FriendzGMFWithoutLikeElementTypes.User_2001 == req.getElementType()) {
			return getGEFWrapper(new UserCreateCommand(req));
		}
		if (FriendzGMFWithoutLikeElementTypes.Publication_2002 == req
				.getElementType()) {
			return getGEFWrapper(new PublicationCreateCommand(req));
		}
		if (FriendzGMFWithoutLikeElementTypes.Comment_2003 == req
				.getElementType()) {
			return getGEFWrapper(new CommentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
