package friendz.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;

/**
 * @generated
 */
public class FriendzGMFWithoutLikePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFriendz1Group());
	}

	/**
	 * Creates "friendz" palette tool group
	 * @generated
	 */
	private PaletteContainer createFriendz1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Friendz1Group_title);
		paletteContainer.setId("createFriendz1Group"); //$NON-NLS-1$
		paletteContainer.add(createUser1CreationTool());
		paletteContainer.add(createPublication2CreationTool());
		paletteContainer.add(createComment3CreationTool());
		paletteContainer.add(createEnemity4CreationTool());
		paletteContainer.add(createFriendship5CreationTool());
		paletteContainer.add(createAuthorship6CreationTool());
		paletteContainer.add(createPubliRef7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUser1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.User1CreationTool_title,
				Messages.User1CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.User_2001));
		entry.setId("createUser1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.User_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublication2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Publication2CreationTool_title,
				Messages.Publication2CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.Publication_2002));
		entry.setId("createPublication2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.Publication_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Comment3CreationTool_title,
				Messages.Comment3CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.Comment_2003));
		entry.setId("createComment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.Comment_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnemity4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Enemity4CreationTool_title,
				Messages.Enemity4CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.Enemity_4004));
		entry.setId("createEnemity4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.Enemity_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFriendship5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Friendship5CreationTool_title,
				Messages.Friendship5CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.Friendship_4002));
		entry.setId("createFriendship5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.Friendship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAuthorship6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Authorship6CreationTool_title,
				Messages.Authorship6CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.Authorship_4001));
		entry.setId("createAuthorship6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.Authorship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPubliRef7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.PubliRef7CreationTool_title,
				Messages.PubliRef7CreationTool_desc,
				Collections
						.singletonList(FriendzGMFWithoutLikeElementTypes.PubliRef_4003));
		entry.setId("createPubliRef7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FriendzGMFWithoutLikeElementTypes
				.getImageDescriptor(FriendzGMFWithoutLikeElementTypes.PubliRef_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
