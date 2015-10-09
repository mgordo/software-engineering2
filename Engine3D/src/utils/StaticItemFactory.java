package utils;

import java.util.ArrayList;

import geometry.Coordinates;
import geometry.Line;

import org.eclipse.emf.common.util.EList;
import org.lwjgl.util.vector.Vector3f;

import animations.Animation;
import scene.objects.PlaneSceneObject;
import scene.objects.SceneObject;

/**
 * Concrete item factory for the traffic lights.
 * 
 * @author Simon, Mikkel
 * 
 */
public class StaticItemFactory extends ItemFactory {

	@Override
	protected ArrayList<SceneObject> createItems(String shape, String geometry,
			Animation activity) {
		Line currentLine = engine3DInstance.getLineContainer(geometry);
		String lineTexture = currentLine.getTexture();
		ArrayList<Vector3f[]> lines = new ArrayList<Vector3f[]>();
		ArrayList<SceneObject> tracks = new ArrayList<SceneObject>();
		if (currentLine.getLineDim().size() > 0) {
			
			// calculate all lines
			// external libary interpolation call
			// for now 
			ArrayList<Vector3f> interpolatedPoints = new ArrayList<Vector3f>();
			Vector3f startPoint = new Vector3f(currentLine.getSource().getX(), currentLine.getSource().getY(), currentLine.getSource().getZ());
			interpolatedPoints.add(startPoint);
			for(Coordinates coordinate : currentLine.getLineDim()) {
				Vector3f point = new Vector3f(coordinate.getX(), coordinate.getY(), coordinate.getZ());
				interpolatedPoints.add(point);
			}

			Vector3f endPoint = new Vector3f(currentLine.getTarget().getX(), currentLine.getTarget().getY(), currentLine.getTarget().getZ());
			interpolatedPoints.add(endPoint);
			
			// we have all points, create lines now:
			
			for(int index = 1; index < interpolatedPoints.size(); index ++){
				Vector3f[] line = new Vector3f[2];
				line[0] = interpolatedPoints.get(index - 1);
				line[1] = interpolatedPoints.get(index);
				lines.add(line);
			}
			
		} else {
			Vector3f[] line = new Vector3f[2];
			line[0] = new Vector3f(currentLine.getSource().getX(),currentLine.getSource().getY(),currentLine.getSource().getZ());
			line[1] = new Vector3f(currentLine.getTarget().getX(),currentLine.getTarget().getY(),currentLine.getTarget().getZ());
			lines.add(line);
		}
		for (Vector3f[] line : lines) {
			// TODO Auto-generated method stub
			System.out.println("creating " + geometry + " with texture "
					+ lineTexture);
			Vector3f begin = new Vector3f(line[0].getX(),
					line[0].getZ(), line[0]
							.getY());
			Vector3f end = new Vector3f(line[1].getX(),
					line[1].getZ(), line[1]
							.getY());

			tracks.add(new PlaneSceneObject(engine3DInstance, begin, end,
					dataPaths, lineTexture, geometry));
		}
		engine3DInstance.setLines(geometry, lines);
		return tracks;

	}

}
