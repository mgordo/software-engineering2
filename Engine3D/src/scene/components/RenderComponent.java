package scene.components;

import core.Model3D;


/**
 * Main component for the render behavior.
 * Gives the objects, that contain
 * this component the ability to be drawn on the screen.
 * Contains a 3DModel which consists of textures and
 * vertices, used to describe the shape of the model.
 * @author Simon, Mikkel
 */
public class RenderComponent extends SceneComponent {
	
	Model3D model3D;
	
	public RenderComponent(Model3D model3D) {
		this.model3D = model3D;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public Model3D getModel3D() {
		return model3D;
	}

	@Override
	public void dispose() {
		model3D.dispose();		
	}

	/**
	 * This function changes the associated Model3D for this RenderComponent.
	 * If the model is found to be already loaded it will be just set to that Model3D.
	 * Else if the model is not found to be already loaded, the model will be loaded and set. 
	 * @author Mikkel
	 * @param modelName The file name of the model without extension
	 */
	public void setModel3D(String modelName) {
		Model3D storedModel3D = Model3D.getModel3DDataMap().get(modelName);
		if (storedModel3D != null)
			this.model3D = storedModel3D;
		else
			Model3D.loadModel3D(modelName);
	}
	
	public void setModel3D(Model3D model3D) {
		this.model3D = model3D;
	}

}
