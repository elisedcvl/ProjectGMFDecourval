package friendz.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;

/**
 * @generated
 */
public class EnemityItemSemanticEditPolicy extends
		FriendzGMFWithoutLikeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnemityItemSemanticEditPolicy() {
		super(FriendzGMFWithoutLikeElementTypes.Enemity_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
