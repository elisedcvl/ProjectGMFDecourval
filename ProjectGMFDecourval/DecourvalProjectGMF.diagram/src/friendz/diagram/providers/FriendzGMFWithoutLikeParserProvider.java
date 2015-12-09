package friendz.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import friendz.FriendzPackage;
import friendz.diagram.edit.parts.CommentCommentEditPart;
import friendz.diagram.edit.parts.PublicationPublicationEditPart;
import friendz.diagram.edit.parts.UserFirstNameLastNameEditPart;
import friendz.diagram.parsers.MessageFormatParser;
import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser userFirstNameLastName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUserFirstNameLastName_5001Parser() {
		if (userFirstNameLastName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FriendzPackage.eINSTANCE.getUser_FirstName(),
					FriendzPackage.eINSTANCE.getUser_LastName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userFirstNameLastName_5001Parser = parser;
		}
		return userFirstNameLastName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser publicationPublication_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPublicationPublication_5002Parser() {
		if (publicationPublication_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FriendzPackage.eINSTANCE
					.getPublication_Publication() };
			MessageFormatParser parser = new MessageFormatParser(features);
			publicationPublication_5002Parser = parser;
		}
		return publicationPublication_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser commentComment_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCommentComment_5003Parser() {
		if (commentComment_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { FriendzPackage.eINSTANCE
					.getComment_Comment() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commentComment_5003Parser = parser;
		}
		return commentComment_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserFirstNameLastNameEditPart.VISUAL_ID:
			return getUserFirstNameLastName_5001Parser();
		case PublicationPublicationEditPart.VISUAL_ID:
			return getPublicationPublication_5002Parser();
		case CommentCommentEditPart.VISUAL_ID:
			return getCommentComment_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FriendzGMFWithoutLikeVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FriendzGMFWithoutLikeVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FriendzGMFWithoutLikeElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
