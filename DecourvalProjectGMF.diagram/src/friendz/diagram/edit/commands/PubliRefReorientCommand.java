package friendz.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import friendz.Friendz;
import friendz.PubliRef;
import friendz.Publication;
import friendz.diagram.edit.policies.FriendzGMFWithoutLikeBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PubliRefReorientCommand extends EditElementCommand {

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
	public PubliRefReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PubliRef) {
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
		if (!(oldEnd instanceof Publication && newEnd instanceof Publication)) {
			return false;
		}
		Publication target = getLink().getPubliRef();
		if (!(getLink().eContainer() instanceof Friendz)) {
			return false;
		}
		Friendz container = (Friendz) getLink().eContainer();
		return FriendzGMFWithoutLikeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPubliRef_4003(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Publication && newEnd instanceof Publication)) {
			return false;
		}
		Publication source = getLink().getPubli();
		if (!(getLink().eContainer() instanceof Friendz)) {
			return false;
		}
		Friendz container = (Friendz) getLink().eContainer();
		return FriendzGMFWithoutLikeBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPubliRef_4003(container,
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
		getLink().setPubli(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPubliRef(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PubliRef getLink() {
		return (PubliRef) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Publication getOldSource() {
		return (Publication) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Publication getNewSource() {
		return (Publication) newEnd;
	}

	/**
	 * @generated
	 */
	protected Publication getOldTarget() {
		return (Publication) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Publication getNewTarget() {
		return (Publication) newEnd;
	}
}
