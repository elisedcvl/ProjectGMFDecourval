package friendz.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.FriendzGMFWithoutLikeEditPartFactory;
import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeEditPartProvider extends
		DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FriendzGMFWithoutLikeEditPartProvider() {
		super(new FriendzGMFWithoutLikeEditPartFactory(),
				FriendzGMFWithoutLikeVisualIDRegistry.TYPED_INSTANCE,
				FriendzEditPart.MODEL_ID);
	}

}
