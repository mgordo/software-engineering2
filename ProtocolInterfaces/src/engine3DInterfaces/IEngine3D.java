package engine3DInterfaces;

import geometry.Geometry;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import animations.Animation;



/**
 * @brief This is the expected interface for any Engine3D
 * @author Miguel Gordo & Diego Gonzalez
 * @date 17-X-13
 */


public interface IEngine3D {
	
	/**
	 * @brief This function creates a new IItem with the given parameters
	 * @param shape Reference to the shape of the IItem to be created
	 * @param geometry Reference to the geometry of the IItem to be created
	 * @param activity Reference to the activity of the IItem to be created
	 * @return An IItem correctly initialized
	 */
	public IItem createIItem(String shape, String geometry, Animation activity);
	/**
	 * This should have these 2 arguments
	 * @param geoRoot
	 */
	public void run(PetriNetDoc pet, Geometry geoRoot, Map<String,List<URI>> list);
	
}
