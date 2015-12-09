package friendz.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import friendz.diagram.edit.parts.AuthorshipEditPart;
import friendz.diagram.edit.parts.CommentEditPart;
import friendz.diagram.edit.parts.EnemityEditPart;
import friendz.diagram.edit.parts.FriendshipEditPart;
import friendz.diagram.edit.parts.FriendzEditPart;
import friendz.diagram.edit.parts.PubliRefEditPart;
import friendz.diagram.edit.parts.PublicationEditPart;
import friendz.diagram.edit.parts.UserEditPart;
import friendz.diagram.part.FriendzGMFWithoutLikeVisualIDRegistry;
import friendz.diagram.part.Messages;

/**
 * @generated
 */
public class FriendzGMFWithoutLikeNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public FriendzGMFWithoutLikeNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<FriendzGMFWithoutLikeNavigatorItem> result = new ArrayList<FriendzGMFWithoutLikeNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, FriendzEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof FriendzGMFWithoutLikeNavigatorGroup) {
			FriendzGMFWithoutLikeNavigatorGroup group = (FriendzGMFWithoutLikeNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof FriendzGMFWithoutLikeNavigatorItem) {
			FriendzGMFWithoutLikeNavigatorItem navigatorItem = (FriendzGMFWithoutLikeNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (FriendzGMFWithoutLikeVisualIDRegistry.getVisualID(view)) {

		case FriendzEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			FriendzGMFWithoutLikeNavigatorGroup links = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Friendz_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PublicationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(CommentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(AuthorshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(FriendshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PubliRefEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(EnemityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case UserEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Node sv = (Node) view;
			FriendzGMFWithoutLikeNavigatorGroup outgoinglinks = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_User_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup incominglinks = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_User_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(AuthorshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(FriendshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(FriendshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(EnemityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(EnemityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PublicationEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Node sv = (Node) view;
			FriendzGMFWithoutLikeNavigatorGroup incominglinks = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Publication_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup outgoinglinks = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Publication_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(AuthorshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PubliRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PubliRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AuthorshipEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FriendzGMFWithoutLikeNavigatorGroup target = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Authorship_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup source = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Authorship_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PublicationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case FriendshipEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FriendzGMFWithoutLikeNavigatorGroup target = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Friendship_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup source = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Friendship_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PubliRefEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FriendzGMFWithoutLikeNavigatorGroup target = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_PubliRef_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup source = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_PubliRef_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PublicationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(PublicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EnemityEditPart.VISUAL_ID: {
			LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem> result = new LinkedList<FriendzGMFWithoutLikeAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FriendzGMFWithoutLikeNavigatorGroup target = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Enemity_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FriendzGMFWithoutLikeNavigatorGroup source = new FriendzGMFWithoutLikeNavigatorGroup(
					Messages.NavigatorGroupName_Enemity_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FriendzGMFWithoutLikeVisualIDRegistry
							.getType(UserEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FriendzEditPart.MODEL_ID
				.equals(FriendzGMFWithoutLikeVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<FriendzGMFWithoutLikeNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<FriendzGMFWithoutLikeNavigatorItem> result = new ArrayList<FriendzGMFWithoutLikeNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new FriendzGMFWithoutLikeNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof FriendzGMFWithoutLikeAbstractNavigatorItem) {
			FriendzGMFWithoutLikeAbstractNavigatorItem abstractNavigatorItem = (FriendzGMFWithoutLikeAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
