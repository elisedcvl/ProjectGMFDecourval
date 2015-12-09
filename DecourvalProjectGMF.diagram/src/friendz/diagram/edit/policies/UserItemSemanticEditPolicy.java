package friendz.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import friendz.diagram.edit.commands.AuthorshipCreateCommand;
import friendz.diagram.edit.commands.AuthorshipReorientCommand;
import friendz.diagram.edit.commands.EnemityCreateCommand;
import friendz.diagram.edit.commands.EnemityReorientCommand;
import friendz.diagram.edit.commands.FriendshipCreateCommand;
import friendz.diagram.edit.commands.FriendshipReorientCommand;
import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;

/**
 * @generated
 */
public class UserItemSemanticEditPolicy extends
		FriendzGMFWithoutLikeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UserItemSemanticEditPolicy() {
		super(FriendzGMFWithoutLikeElementTypes.User_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(incomingLink) == FriendshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(incomingLink) == EnemityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(outgoingLink) == AuthorshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(outgoingLink) == FriendshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(outgoingLink) == EnemityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FriendzGMFWithoutLikeElementTypes.Authorship_4001 == req
				.getElementType()) {
			return getGEFWrapper(new AuthorshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FriendzGMFWithoutLikeElementTypes.Friendship_4002 == req
				.getElementType()) {
			return getGEFWrapper(new FriendshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FriendzGMFWithoutLikeElementTypes.Enemity_4004 == req
				.getElementType()) {
			return getGEFWrapper(new EnemityCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FriendzGMFWithoutLikeElementTypes.Authorship_4001 == req
				.getElementType()) {
			return null;
		}
		if (FriendzGMFWithoutLikeElementTypes.Friendship_4002 == req
				.getElementType()) {
			return getGEFWrapper(new FriendshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FriendzGMFWithoutLikeElementTypes.Enemity_4004 == req
				.getElementType()) {
			return getGEFWrapper(new EnemityCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AuthorshipEditPart.VISUAL_ID:
			return getGEFWrapper(new AuthorshipReorientCommand(req));
		case FriendshipEditPart.VISUAL_ID:
			return getGEFWrapper(new FriendshipReorientCommand(req));
		case EnemityEditPart.VISUAL_ID:
			return getGEFWrapper(new EnemityReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
