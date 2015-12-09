package friendz.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;
import friendz.diagram.providers.FriendzGMFWithoutLikeModelingAssistantProvider;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeModelingAssistantProviderOfUserEditPart
		extends FriendzGMFWithoutLikeModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((UserEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(UserEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FriendzGMFWithoutLikeElementTypes.Authorship_4001);
		types.add(FriendzGMFWithoutLikeElementTypes.Friendship_4002);
		types.add(FriendzGMFWithoutLikeElementTypes.Enemity_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((UserEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			UserEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PublicationEditPart) {
			types.add(FriendzGMFWithoutLikeElementTypes.Authorship_4001);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(FriendzGMFWithoutLikeElementTypes.Friendship_4002);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(FriendzGMFWithoutLikeElementTypes.Enemity_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((UserEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(UserEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FriendzGMFWithoutLikeElementTypes.Authorship_4001) {
			types.add(FriendzGMFWithoutLikeElementTypes.Publication_2002);
		} else if (relationshipType == FriendzGMFWithoutLikeElementTypes.Friendship_4002) {
			types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		} else if (relationshipType == FriendzGMFWithoutLikeElementTypes.Enemity_4004) {
			types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((UserEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(UserEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FriendzGMFWithoutLikeElementTypes.Friendship_4002);
		types.add(FriendzGMFWithoutLikeElementTypes.Enemity_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((UserEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(UserEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FriendzGMFWithoutLikeElementTypes.Friendship_4002) {
			types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		} else if (relationshipType == FriendzGMFWithoutLikeElementTypes.Enemity_4004) {
			types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		}
		return types;
	}

}
