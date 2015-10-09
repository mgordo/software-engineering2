package engine3DInterfaces;

import java.util.Collection;

import animations.Animation;


/**
 * @brief This is the expected interface for any IItem
 * @author Miguel Gordo & Diego Gonzalez
 * @date 17-X-13
 */

public interface IItem {	
	
	/**
	 * @brief Sets the ready attribute of the IItem
	 * @param bool New value for the ready attribute
	 */
	public void setReady(boolean bool);
	
	/**
	 * @brief Gets the ready attribute of the IItem
	 * @return The value of the attribute
	 */
	public boolean getReady();
	
	/**
	 * @brief Gets the activity attribute of the IItem
	 * @return The value of the attribute
	 */
	public Animation getActivity();
	
	/**
	 * @brief Sets the activity attribute of the IItem
	 * @param activity New value for the activity attribute
	 */
	public void setActivity(Animation activity);	
	
	/**
	 * @brief Gets the shape attribute of the IItem
	 * @return The value of the attribute
	 */
	public String getShape();
	
	/**
	 * @brief Sets the shape attribute of the IItem
	 * @param shape New value for the shape attribute
	 */
	public void setShape(String shape);
	
	/**
	 * @brief Gets the geometry attribute of the IItem
	 * @return The value of the attribute
	 */
	public String getGeometry();
	
	/**
	 * @brief Sets the geometry attribute of the IItem
	 * @param geometry New value for the geometry attribute
	 */
	public void setGeometry(String geo);	

}
