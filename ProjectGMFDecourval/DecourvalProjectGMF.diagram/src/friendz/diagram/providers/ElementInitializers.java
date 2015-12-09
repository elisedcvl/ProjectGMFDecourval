package friendz.diagram.providers;

import friendz.diagram.part.FriendzGMFWithoutLikeDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = FriendzGMFWithoutLikeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
