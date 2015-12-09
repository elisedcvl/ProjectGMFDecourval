package friendz.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FriendzGMFWithoutLikeNavigatorItem) {
			FriendzGMFWithoutLikeNavigatorItem item = (FriendzGMFWithoutLikeNavigatorItem) element;
			return FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
