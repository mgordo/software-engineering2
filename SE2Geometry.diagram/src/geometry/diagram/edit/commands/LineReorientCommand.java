package geometry.diagram.edit.commands;

import geometry.Geometry;
import geometry.Line;
import geometry.Point;
import geometry.diagram.edit.policies.GeometryBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class LineReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public LineReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Line) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Point && newEnd instanceof Point)) {
			return false;
		}
		Point target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLine_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Point && newEnd instanceof Point)) {
			return false;
		}
		Point source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLine_4001(container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Line getLink() {
		return (Line) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Point getOldSource() {
		return (Point) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Point getNewSource() {
		return (Point) newEnd;
	}

	/**
	 * @generated
	 */
	protected Point getOldTarget() {
		return (Point) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Point getNewTarget() {
		return (Point) newEnd;
	}
}
