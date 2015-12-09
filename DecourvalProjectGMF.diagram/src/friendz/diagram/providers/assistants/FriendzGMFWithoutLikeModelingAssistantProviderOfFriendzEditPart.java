package friendz.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;
import friendz.diagram.providers.FriendzGMFWithoutLikeModelingAssistantProvider;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeModelingAssistantProviderOfFriendzEditPart
		extends FriendzGMFWithoutLikeModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FriendzGMFWithoutLikeElementTypes.User_2001);
		types.add(FriendzGMFWithoutLikeElementTypes.Publication_2002);
		types.add(FriendzGMFWithoutLikeElementTypes.Comment_2003);
		return types;
	}

}
