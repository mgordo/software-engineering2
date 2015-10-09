package geometry.diagram.edit.policies;

import geometry.diagram.providers.GeometryElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class LineItemSemanticEditPolicy extends
		GeometryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LineItemSemanticEditPolicy() {
		super(GeometryElementTypes.Line_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
