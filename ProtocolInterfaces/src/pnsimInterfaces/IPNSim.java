/**
 * @brief This is the expected interface for any PNSim
 * @author Miguel Gordo & Diego Gonzalez
 * @date 17-X-13
 */
package pnsimInterfaces;


import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import engine3DInterfaces.*;


public interface IPNSim {
	

	/**
	 * @brief This method returns the Shape associated with the given geometry
	 * @param geometry Reference to the geometry whose shape is needed
	 * @return String with the name of the shape
	 */
	public String getShape(String geometry) throws NotSuchGeometryException;
	
	/**
	 * @brief This function should initialize everything needed to start the simulation, as stated in the System Specification document
	 * @param pnmlfile Name of the pnml file from which to get the initial marking
	 * @throws PNSimNotInitializedCorrectlyException If something didn't go as expected, it will contain a String with the cause
	 */
	public void init(PetriNetDoc petrinet, IEngine3D engine) throws PNSimNotInitializedCorrectlyException;
	
	
	/**
	 * @brief This function allows to create an item in a selected geometry
	 * @param geometry Reference string to the geometry in which the niew item will be created
	 */
	public void addItem(String geometry);
	
	/**
	 * @brief This function will attempt to iterate the simulation the maximum number of steps possible, given the current state.
	 * Any number of IItems may be changed, depending on how many are involved in the next step of the simulation, 
	 * and all of them may change any of their attributes through the setters in the IItem interface. 
	 * @param it Reference to the IItem whose state has changed
	 */
	public void update(IItem it);

}
