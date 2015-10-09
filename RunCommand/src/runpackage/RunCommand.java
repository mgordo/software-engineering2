package runpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import OurPNVis.Place;
import config.Config;
import core.Engine3D;
import engine3DInterfaces.IEngine3D;
import geometry.Geometry;
import geometry.Line;

/**
 * 
 * @author Diego
 *
 */
public class RunCommand extends AbstractHandler {


	private Config conf=null;

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		super.addHandlerListener(handlerListener);

	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		
		if(isEnabled()){

			HashMap<String, List<URI>> resourcesMap = new HashMap<String, List<URI>>();

			Shell thisshell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			
			/*IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();*/

		
			/*DirectoryDialog ddiag = new DirectoryDialog(thisshell);
			String result = ddiag.open();
			System.out.println(result);*/

			/*ContainerSelectionDialog container = new ContainerSelectionDialog(
					thisshell,
					myWorkspaceRoot,
					false,
					"Select the folder with the 3D models");*/
			
			

			List<ViewerFilter> filters = new ArrayList<ViewerFilter>(); 
			filters.add(new ViewerFilter() {

				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					return true;
				} 
			});

			IContainer[] list = WorkspaceResourceDialog.openFolderSelection(
					thisshell, 
					"Select the folders with the 3D models, shaders and textures", 
					"Please select the folders", 
					true, 
					null, 
					filters);

			/*WorkspaceResourceDialog.openFileSelection(thisshell, 
					"Select the 3D Models folder", "Please select a folder", 
					false, null, filters);*/


			for(int i=0; i< list.length; i++){

				IContainer modelFolder = list[i];			
				IResource[] modelresources=null;
				try {
					modelresources = modelFolder.members();
				} catch (CoreException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(new JFrame(), "CoreException");
					return null;
				}
				for(IResource r:modelresources){					
					String[] parts = r.getLocationURI().toString().split("/");
					String id = parts[parts.length-1];
					String[] id2 = id.split("[.]");

					if(resourcesMap.get(id2[0]) == null){/*First Appear */
						ArrayList<URI> lista = new ArrayList<URI>();
						lista.add(r.getLocationURI());
						resourcesMap.put(id2[0], lista);
					}else{/*The resource has more than one file*/
						resourcesMap.get(id2[0]).add(r.getLocationURI());
					}
				}

			}

/*
			String[] l = conf.eResource().getURI().path().split("/");
			IProject myProject = myWorkspaceRoot.getProject(l[2]);

			

			if(myProject.findMember("data/3DModels") == null){
				JOptionPane.showMessageDialog(new JFrame(), "folder data/3DModels missing");
				return null;
			}

			if(myProject.findMember("data/3DModels") instanceof IContainer){
				modelFolder = (IContainer)myProject.findMember("data/3DModels");				
				modelresources=null;
				try {
					modelresources = modelFolder.members();
				} catch (CoreException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(new JFrame(), "CoreException");
					return null;
				}
				for(IResource r:modelresources){					
					String[] parts = r.getLocationURI().toString().split("/");
					String id = parts[parts.length-1];
					String[] id2 = id.split("[.]");

					if(resourcesMap.get(id2[0]) == null){
						ArrayList<URI> lista = new ArrayList<URI>();
						lista.add(r.getLocationURI());
						resourcesMap.put(id2[0], lista);
					}else{
						resourcesMap.get(id2[0]).add(r.getLocationURI());
					}
				}
			}

			Obtain the data from shaders

			if(myProject.findMember("data/shaders") == null){
				JOptionPane.showMessageDialog(new JFrame(), "folder data/shaders missing");
				return null;
			}

			if(myProject.findMember("data/shaders") instanceof IContainer){
				modelFolder = (IContainer)myProject.findMember("data/shaders");				
				modelresources=null;
				try {
					modelresources = modelFolder.members();
				} catch (CoreException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(new JFrame(), "CoreException");
					return null;
				}
				for(IResource r:modelresources){					
					String[] parts = r.getLocationURI().toString().split("/");
					String id = parts[parts.length-1];
					String[] id2 = id.split("[.]");
					if(resourcesMap.get(id2[0]) == null){
						ArrayList<URI> lista = new ArrayList<URI>();
						lista.add(r.getLocationURI());
						resourcesMap.put(id2[0], lista);
					}else{
						resourcesMap.get(id2[0]).add(r.getLocationURI());
					}
				}
			}

			Obtain the data from textures

			if(myProject.findMember("data/textures") == null){
				JOptionPane.showMessageDialog(new JFrame(), "folder data/textures missing");
				return null;
			}

			if(myProject.findMember("data/textures") instanceof IContainer){
				modelFolder = (IContainer)myProject.findMember("data/textures");				
				modelresources=null;
				try {
					modelresources = modelFolder.members();
				} catch (CoreException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(new JFrame(), "CoreException");
					return null;
				}
				for(IResource r:modelresources){					
					String[] parts = r.getLocationURI().toString().split("/");
					String id = parts[parts.length-1];
					String[] id2 = id.split("[.]");
					if(resourcesMap.get(id2[0]) == null){
						ArrayList<URI> lista = new ArrayList<URI>();
						lista.add(r.getLocationURI());
						resourcesMap.put(id2[0], lista);
					}else{
						resourcesMap.get(id2[0]).add(r.getLocationURI());
					}
				}
			}*/

			
			
			
			
			
			/*
			 * Verification of the Petri Net and the Geometry:
			 * All the shapes and textures must exists in
			 * the Map.
			 */
			try{
			    verify(conf.getPetri(),conf.getGeo(),resourcesMap);
			}catch(IllegalArgumentException e){
				Shell thisshell1=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				MessageDialog.openError(thisshell1, "Error in model","Description: "+e.getMessage());
				return null;
			}

			IEngine3D engine = new Engine3D();
			engine.run(conf.getPetri(),conf.getGeo(),resourcesMap);
		}
		return null;
	}

	/**
	 * 
	 * @param petri
	 * @param geo
	 * @param resourcesMap
	 */
	private void verify(PetriNetDoc petri, Geometry geo,
			HashMap<String, List<URI>> resourcesMap) throws IllegalArgumentException{

		Set<String> set = resourcesMap.keySet();

		/*Verify the Geometry*/
		EList<Line> lineList = geo.getLines();
		for(Line l:lineList){
			if(!set.contains(l.getTexture())){
				throw new IllegalArgumentException("Missing "+l.getTexture()+" in the Geometry");
			}
		}

		/*Verify the Petri Net*/
		PetriNet pet = petri.getNet().get(0);/*Only the first Net*/
		for(Page page:pet.getPage()){
			verifyPage(page,set);
		}

		return;
	}

	private void verifyPage(Page page, Set<String> set) throws IllegalArgumentException{

		for(Object o:page.getObject()){
			if(o instanceof Place){/*Verify the shape of the place*/
				Place p = (Place)o;
				if(!set.contains(p.getShape().getText())){
					throw new IllegalArgumentException("Missing "+p.getShape().getText()+" in the PetriNet");
				}
			}else if(o instanceof Page){
				verifyPage((Page)o, set);
			}
		}
	}

	@Override
	public boolean isEnabled() {
		if(conf!=null && isLoaded()) return true;
		else return false;
	}

	private boolean isLoaded() {
		if(conf.getPetri() != null && conf.getGeo()!=null)
			return true;
		else
			return false;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void setEnabled(Object evaluationContext) {

		if(evaluationContext != null && evaluationContext instanceof IEvaluationContext){
			IEvaluationContext con = (IEvaluationContext)evaluationContext;
			Object lista = con.getDefaultVariable();

			if(lista instanceof List<?>){
				List<?> l = (List<?>)lista;
				if(l.size() == 1){
					Object o = l.get(0);
					if(o instanceof Config){
						conf = (Config)o;
					}else{
						conf = null;
					}
				}
			}
		}else{
			conf = null;
		}
	}

}
