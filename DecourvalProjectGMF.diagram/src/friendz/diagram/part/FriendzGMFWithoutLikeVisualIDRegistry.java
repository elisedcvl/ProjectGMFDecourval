package friendz.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import friendz.Friendz;
import friendz.FriendzPackage;
import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.CommentCommentEditPart;
import friendz.diagram.edit.parts.CommentEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.PubliRefEditPart;
import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.PublicationPublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.edit.parts.UserFirstNameLastNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FriendzGMFWithoutLikeVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "DecourvalProjectGMF.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FriendzEditPart.MODEL_ID.equals(view.getType())) {
				return FriendzEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FriendzGMFWithoutLikeDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FriendzPackage.eINSTANCE.getFriendz().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Friendz) domainElement)) {
			return FriendzEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
				.getModelID(containerView);
		if (!FriendzEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FriendzEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FriendzEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FriendzEditPart.VISUAL_ID:
			if (FriendzPackage.eINSTANCE.getUser().isSuperTypeOf(
					domainElement.eClass())) {
				return UserEditPart.VISUAL_ID;
			}
			if (FriendzPackage.eINSTANCE.getPublication().isSuperTypeOf(
					domainElement.eClass())) {
				return PublicationEditPart.VISUAL_ID;
			}
			if (FriendzPackage.eINSTANCE.getComment().isSuperTypeOf(
					domainElement.eClass())) {
				return CommentEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
				.getModelID(containerView);
		if (!FriendzEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FriendzEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FriendzEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FriendzEditPart.VISUAL_ID:
			if (UserEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PublicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserEditPart.VISUAL_ID:
			if (UserFirstNameLastNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PublicationEditPart.VISUAL_ID:
			if (PublicationPublicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentEditPart.VISUAL_ID:
			if (CommentCommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FriendzPackage.eINSTANCE.getAuthorship().isSuperTypeOf(
				domainElement.eClass())) {
			return AuthorshipEditPart.VISUAL_ID;
		}
		if (FriendzPackage.eINSTANCE.getFriendship().isSuperTypeOf(
				domainElement.eClass())) {
			return FriendshipEditPart.VISUAL_ID;
		}
		if (FriendzPackage.eINSTANCE.getPubliRef().isSuperTypeOf(
				domainElement.eClass())) {
			return PubliRefEditPart.VISUAL_ID;
		}
		if (FriendzPackage.eINSTANCE.getEnemity().isSuperTypeOf(
				domainElement.eClass())) {
			return EnemityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Friendz element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FriendzEditPart.VISUAL_ID:
			return false;
		case UserEditPart.VISUAL_ID:
		case PublicationEditPart.VISUAL_ID:
		case CommentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
