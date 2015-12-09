package friendz.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;
import friendz.diagram.providers.FriendzGMFWithoutLikeModelingAssistantProvider;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeModelingAssistantProviderOfPublicationEditPart
		extends FriendzGMFWithoutLikeModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PublicationEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(PublicationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FriendzGMFWithoutLikeElementTypes.PubliRef_4003);
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
		return doGetRelTypesOnSourceAndTarget(
				(PublicationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			PublicationEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PublicationEditPart) {
			types.add(FriendzGMFWithoutLikeElementTypes.PubliRef_4003);
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
		return doGetTypesForTarget((PublicationEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(PublicationEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FriendzGMFWithoutLikeElementTypes.PubliRef_4003) {
			types.add(FriendzGMFWithoutLikeElementTypes.Publication_2002);
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
		return doGetRelTypesOnTarget((PublicationEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(PublicationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FriendzGMFWithoutLikeElementTypes.Authorship_4001);
		types.add(FriendzGMFWithoutLikeElementTypes.PubliRef_4003);
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
		return doGetTypesForSource((PublicationEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(PublicationEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FriendzGMFWithoutLikeElementTypes.Authorship_4001) {
			types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		} else if (relationshipType == FriendzGMFWithoutLikeElementTypes.PubliRef_4003) {
			types.add(FriendzGMFWithoutLikeElementTypes.Publication_2002);
		}
		return types;
	}

}
