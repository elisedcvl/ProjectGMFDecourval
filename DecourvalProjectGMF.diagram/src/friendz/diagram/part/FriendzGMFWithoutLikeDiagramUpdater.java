package friendz.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import friendz.Authorship;
import friendz.Comment;
import friendz.Enemity;
import friendz.Friendship;
import friendz.Friendz;
import friendz.FriendzPackage;
import friendz.PubliRef;
import friendz.Publication;
import friendz.User;
import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.CommentEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.PubliRefEditPart;
import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.providers.FriendzGMFWithoutLikeElementTypes;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeNodeDescriptor> getSemanticChildren(
			View view) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case FriendzEditPart.VISUAL_ID:
			return getFriendz_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeNodeDescriptor> getFriendz_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Friendz modelElement = (Friendz) view.getElement();
		LinkedList<FriendzGMFWithoutLikeNodeDescriptor> result = new LinkedList<FriendzGMFWithoutLikeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUsers().iterator(); it.hasNext();) {
			User childElement = (User) it.next();
			int visualID = FriendzGMFWithoutLikeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == UserEditPart.VISUAL_ID) {
				result.add(new FriendzGMFWithoutLikeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPublications().iterator(); it
				.hasNext();) {
			Publication childElement = (Publication) it.next();
			int visualID = FriendzGMFWithoutLikeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == PublicationEditPart.VISUAL_ID) {
				result.add(new FriendzGMFWithoutLikeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComments().iterator(); it
				.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = FriendzGMFWithoutLikeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CommentEditPart.VISUAL_ID) {
				result.add(new FriendzGMFWithoutLikeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getContainedLinks(
			View view) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case FriendzEditPart.VISUAL_ID:
			return getFriendz_1000ContainedLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2001ContainedLinks(view);
		case PublicationEditPart.VISUAL_ID:
			return getPublication_2002ContainedLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2003ContainedLinks(view);
		case AuthorshipEditPart.VISUAL_ID:
			return getAuthorship_4001ContainedLinks(view);
		case FriendshipEditPart.VISUAL_ID:
			return getFriendship_4002ContainedLinks(view);
		case PubliRefEditPart.VISUAL_ID:
			return getPubliRef_4003ContainedLinks(view);
		case EnemityEditPart.VISUAL_ID:
			return getEnemity_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getIncomingLinks(
			View view) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case UserEditPart.VISUAL_ID:
			return getUser_2001IncomingLinks(view);
		case PublicationEditPart.VISUAL_ID:
			return getPublication_2002IncomingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2003IncomingLinks(view);
		case AuthorshipEditPart.VISUAL_ID:
			return getAuthorship_4001IncomingLinks(view);
		case FriendshipEditPart.VISUAL_ID:
			return getFriendship_4002IncomingLinks(view);
		case PubliRefEditPart.VISUAL_ID:
			return getPubliRef_4003IncomingLinks(view);
		case EnemityEditPart.VISUAL_ID:
			return getEnemity_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {
		case UserEditPart.VISUAL_ID:
			return getUser_2001OutgoingLinks(view);
		case PublicationEditPart.VISUAL_ID:
			return getPublication_2002OutgoingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2003OutgoingLinks(view);
		case AuthorshipEditPart.VISUAL_ID:
			return getAuthorship_4001OutgoingLinks(view);
		case FriendshipEditPart.VISUAL_ID:
			return getFriendship_4002OutgoingLinks(view);
		case PubliRefEditPart.VISUAL_ID:
			return getPubliRef_4003OutgoingLinks(view);
		case EnemityEditPart.VISUAL_ID:
			return getEnemity_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getFriendz_1000ContainedLinks(
			View view) {
		Friendz modelElement = (Friendz) view.getElement();
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Authorship_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Friendship_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PubliRef_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Enemity_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getUser_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPublication_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getComment_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getAuthorship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getFriendship_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPubliRef_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getEnemity_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getUser_2001IncomingLinks(
			View view) {
		User modelElement = (User) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Friendship_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enemity_4004(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPublication_2002IncomingLinks(
			View view) {
		Publication modelElement = (Publication) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Authorship_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PubliRef_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getComment_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getAuthorship_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getFriendship_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPubliRef_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getEnemity_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getUser_2001OutgoingLinks(
			View view) {
		User modelElement = (User) view.getElement();
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Authorship_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Friendship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enemity_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPublication_2002OutgoingLinks(
			View view) {
		Publication modelElement = (Publication) view.getElement();
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PubliRef_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getComment_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getAuthorship_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getFriendship_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getPubliRef_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FriendzGMFWithoutLikeLinkDescriptor> getEnemity_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getContainedTypeModelFacetLinks_Authorship_4001(
			Friendz container) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getAuthorships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Authorship) {
				continue;
			}
			Authorship link = (Authorship) linkObject;
			if (AuthorshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Publication dst = link.getPubli();
			User src = link.getAuthor();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Authorship_4001,
					AuthorshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getContainedTypeModelFacetLinks_Friendship_4002(
			Friendz container) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getFriendships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Friendship) {
				continue;
			}
			Friendship link = (Friendship) linkObject;
			if (FriendshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User dst = link.getUser4();
			User src = link.getUser3();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Friendship_4002,
					FriendshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getContainedTypeModelFacetLinks_PubliRef_4003(
			Friendz container) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getPubliRefs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PubliRef) {
				continue;
			}
			PubliRef link = (PubliRef) linkObject;
			if (PubliRefEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Publication dst = link.getPubliRef();
			Publication src = link.getPubli();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.PubliRef_4003,
					PubliRefEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getContainedTypeModelFacetLinks_Enemity_4004(
			Friendz container) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getEnemities().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enemity) {
				continue;
			}
			Enemity link = (Enemity) linkObject;
			if (EnemityEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User dst = link.getUser2();
			User src = link.getUser1();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Enemity_4004,
					EnemityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getIncomingTypeModelFacetLinks_Authorship_4001(
			Publication target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FriendzPackage.eINSTANCE
					.getAuthorship_Publi()
					|| false == setting.getEObject() instanceof Authorship) {
				continue;
			}
			Authorship link = (Authorship) setting.getEObject();
			if (AuthorshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User src = link.getAuthor();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, target,
					link, FriendzGMFWithoutLikeElementTypes.Authorship_4001,
					AuthorshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getIncomingTypeModelFacetLinks_Friendship_4002(
			User target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FriendzPackage.eINSTANCE
					.getFriendship_User4()
					|| false == setting.getEObject() instanceof Friendship) {
				continue;
			}
			Friendship link = (Friendship) setting.getEObject();
			if (FriendshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User src = link.getUser3();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, target,
					link, FriendzGMFWithoutLikeElementTypes.Friendship_4002,
					FriendshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getIncomingTypeModelFacetLinks_PubliRef_4003(
			Publication target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FriendzPackage.eINSTANCE
					.getPubliRef_PubliRef()
					|| false == setting.getEObject() instanceof PubliRef) {
				continue;
			}
			PubliRef link = (PubliRef) setting.getEObject();
			if (PubliRefEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Publication src = link.getPubli();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, target,
					link, FriendzGMFWithoutLikeElementTypes.PubliRef_4003,
					PubliRefEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getIncomingTypeModelFacetLinks_Enemity_4004(
			User target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FriendzPackage.eINSTANCE
					.getEnemity_User2()
					|| false == setting.getEObject() instanceof Enemity) {
				continue;
			}
			Enemity link = (Enemity) setting.getEObject();
			if (EnemityEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User src = link.getUser1();
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, target,
					link, FriendzGMFWithoutLikeElementTypes.Enemity_4004,
					EnemityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingTypeModelFacetLinks_Authorship_4001(
			User source) {
		Friendz container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Friendz) {
				container = (Friendz) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getAuthorships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Authorship) {
				continue;
			}
			Authorship link = (Authorship) linkObject;
			if (AuthorshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Publication dst = link.getPubli();
			User src = link.getAuthor();
			if (src != source) {
				continue;
			}
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Authorship_4001,
					AuthorshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingTypeModelFacetLinks_Friendship_4002(
			User source) {
		Friendz container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Friendz) {
				container = (Friendz) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getFriendships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Friendship) {
				continue;
			}
			Friendship link = (Friendship) linkObject;
			if (FriendshipEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User dst = link.getUser4();
			User src = link.getUser3();
			if (src != source) {
				continue;
			}
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Friendship_4002,
					FriendshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingTypeModelFacetLinks_PubliRef_4003(
			Publication source) {
		Friendz container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Friendz) {
				container = (Friendz) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getPubliRefs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PubliRef) {
				continue;
			}
			PubliRef link = (PubliRef) linkObject;
			if (PubliRefEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Publication dst = link.getPubliRef();
			Publication src = link.getPubli();
			if (src != source) {
				continue;
			}
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.PubliRef_4003,
					PubliRefEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingTypeModelFacetLinks_Enemity_4004(
			User source) {
		Friendz container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Friendz) {
				container = (Friendz) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FriendzGMFWithoutLikeLinkDescriptor> result = new LinkedList<FriendzGMFWithoutLikeLinkDescriptor>();
		for (Iterator<?> links = container.getEnemities().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enemity) {
				continue;
			}
			Enemity link = (Enemity) linkObject;
			if (EnemityEditPart.VISUAL_ID != FriendzGMFWithoutLikeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User dst = link.getUser2();
			User src = link.getUser1();
			if (src != source) {
				continue;
			}
			result.add(new FriendzGMFWithoutLikeLinkDescriptor(src, dst, link,
					FriendzGMFWithoutLikeElementTypes.Enemity_4004,
					EnemityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FriendzGMFWithoutLikeNodeDescriptor> getSemanticChildren(
				View view) {
			return FriendzGMFWithoutLikeDiagramUpdater
					.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FriendzGMFWithoutLikeLinkDescriptor> getContainedLinks(
				View view) {
			return FriendzGMFWithoutLikeDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FriendzGMFWithoutLikeLinkDescriptor> getIncomingLinks(
				View view) {
			return FriendzGMFWithoutLikeDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FriendzGMFWithoutLikeLinkDescriptor> getOutgoingLinks(
				View view) {
			return FriendzGMFWithoutLikeDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
