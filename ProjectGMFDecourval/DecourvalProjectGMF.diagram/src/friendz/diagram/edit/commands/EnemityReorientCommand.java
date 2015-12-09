package friendz.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import friendz.Enemity;
import friendz.Friendz;
import friendz.User;
import friendz.diagram.edit.policies.FriendzGMFWithoutLikeBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class EnemityReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public EnemityReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Enemity) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof User && newEnd instanceof User)) {
			return false;
		}
		User target = getLink().getUser2();
		if (!(getLink().eContainer() instanceof Friendz)) {
			return false;
		}
		Friendz container = (Friendz) getLink().eContainer();
		return FriendzGMFWithoutLikeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEnemity_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof User && newEnd instanceof User)) {
			return false;
		}
		User source = getLink().getUser1();
		if (!(getLink().eContainer() instanceof Friendz)) {
			return false;
		}
		Friendz container = (Friendz) getLink().eContainer();
		return FriendzGMFWithoutLikeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistEnemity_4004(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setUser1(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setUser2(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Enemity getLink() {
		return (Enemity) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected User getOldSource() {
		return (User) oldEnd;
	}

	/**
	 * @generated
	 */
	protected User getNewSource() {
		return (User) newEnd;
	}

	/**
	 * @generated
	 */
	protected User getOldTarget() {
		return (User) oldEnd;
	}

	/**
	 * @generated
	 */
	protected User getNewTarget() {
		return (User) newEnd;
	}
}
