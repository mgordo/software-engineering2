package geometry.diagram.navigator;

import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GeometryNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem item = (GeometryNavigatorItem) element;
			return GeometryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
