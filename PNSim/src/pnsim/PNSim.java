package pnsim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import pnsimInterfaces.IPNSim;
import pnsimInterfaces.NotSuchGeometryException;
import pnsimInterfaces.PNSimNotInitializedCorrectlyException;
import OurPNVis.Arc;
import OurPNVis.PNVis;
import OurPNVis.Place;
import OurPNVis.Transition;
import animations.Animation;
import engine3DInterfaces.IEngine3D;
import engine3DInterfaces.IItem;
/**
 * @brief This class implements a Petri Net Simulator following the IPNSim interface
 * @author Miguel Gordo & Diego Gonzalez
 * @date 17-X-13
 * @version 0.1
 */
public class PNSim implements IPNSim{

	private HashMap<IItem,Place> itemmarking=null;
	private HashMap<Place,ArrayList<IItem>> placemarking=null;
	private PetriNetDoc petrinet=null;
	private IEngine3D engine3d=null;
	private FlatAccess flat=null;

	@Override
	public String getShape(String geometry) throws NotSuchGeometryException{

		List<org.pnml.tools.epnk.pnmlcoremodel.Place> lugares = flat.getPlaces();

		for(org.pnml.tools.epnk.pnmlcoremodel.Place pl: lugares){
			if(pl instanceof Place){

				return ((Place) pl).getShape().getText();

			}

		}
		throw new NotSuchGeometryException();

	}

	@Override
	public void init(PetriNetDoc petrinet, IEngine3D engine)
			throws PNSimNotInitializedCorrectlyException {
		engine3d = engine;
		this.petrinet = petrinet;
		this.itemmarking = new HashMap<IItem,Place>();
		placemarking = new HashMap<Place,ArrayList<IItem>>();
		
		
		if(petrinet.getNet().get(0).getType() instanceof PNVis){
			flat = new FlatAccess(petrinet.getNet().get(0));

			List<org.pnml.tools.epnk.pnmlcoremodel.Place> lugares = flat.getPlaces();

			for(org.pnml.tools.epnk.pnmlcoremodel.Place pl: lugares){
				if(pl instanceof Place){
					ArrayList<IItem> list = new ArrayList<IItem>();


					if(((Place)pl).getTokens().isText()){
						IItem item = engine3d.createIItem(((Place)pl).getShape().getText(),
								((Place)pl).getGeo().getText(), 
								((Place)pl).getActivities().getStructure().getContains().get(0));
						item.setReady(false);
						itemmarking.put(item, (Place)pl);

						list.add(item);
					}
					placemarking.put((Place)pl, list);
				}

			}


		}
		
		
		/*if(petrinet.getNet().get(0).getType() instanceof PNVis){
			Iterator<Page> pagesiterator = petrinet.getNet().get(0).getPage().iterator();

			while(pagesiterator.hasNext()){
				Page page = pagesiterator.next();


				Iterator<Object> it = page.getObject().iterator();
				while(it.hasNext()){

					Object temp = it.next();

					if( temp instanceof Place){
						ArrayList<IItem> list = new ArrayList<IItem>();


						for(int i=0 ; i<((Place)temp).getTokens().getText().intValue() ; i++){
							IItem item = engine3d.createIItem(((Place)temp).getShape().getText(),
									((Place)temp).getGeo().getText(), 
									((Place)temp).getActivities().getStructure().getContains().get(0));
							item.setReady(false);
							itemmarking.put(item, (Place)temp);

							list.add(item);
						}
						placemarking.put((Place)temp, list);
					}

				}
			}
		}*/


	}

	@Override
	public void addItem(String geometry) {


		if(petrinet.getNet().get(0).getType() instanceof PNVis){
			

			List<org.pnml.tools.epnk.pnmlcoremodel.Place> temporal = flat.getPlaces();
			
			for(org.pnml.tools.epnk.pnmlcoremodel.Place p:temporal){
				if(p instanceof Place){
					if(((Place) p).getGeo().getText().equals(geometry)){
						IItem item = engine3d.createIItem(((Place)p).getShape().getText(), 
								((Place)p).getGeo().getText(), 
								((Place)p).getActivities().getStructure().getContains().get(0));
						item.setReady(false);
						itemmarking.put(item, (Place)p);
						ArrayList<IItem> list = placemarking.get((Place)p);
						list.add(item);

					}
				}
			}
			

			/*Iterator<Page> pagesiterator = petrinet.getNet().get(0).getPage().iterator();

			while(pagesiterator.hasNext()){
				Page page = pagesiterator.next();

				while(page.getObject().iterator().hasNext()){
					Object temp = page.getObject().iterator().next();

					if( temp instanceof Place){
						if(((Place) temp).getGeo().getText().equals(geometry)){
							IItem item = engine3d.createIItem(((Place)temp).getShape().getText(), 
									((Place)temp).getGeo().getText(), 
									((Place)temp).getActivities().getStructure().getContains().get(0));
							item.setReady(false);
							itemmarking.put(item, (Place)temp);
							ArrayList<IItem> list = placemarking.get((Place)temp);
							list.add(item);

						}
					}
				}
			}*/
		}
	}

	@Override
	public void update(IItem it) {

		Place pl = itemmarking.get(it);
		boolean fire=true;
		if(pl.getActivities().getStructure().getContains().size()!=1){/*If there is more than one animation in the place the item is*/
			boolean moreactivities=false;
			int index=0;
			while(!moreactivities ){
				Animation act = pl.getActivities().getStructure().getContains().get(index);//
				index++;/*This points to the next activity in the place*/

				/*If it's not the last animation of the place the item is in*/
				if(act.equals(it.getActivity()) && index!=pl.getActivities().getStructure().getContains().size()){
					fire=false;
					moreactivities=true;
					it.setGeometry(it.getGeometry());/*/TODO We should be able to comment this line in the future*/
					it.setActivity(pl.getActivities().getStructure().getContains().get(index));
					it.setReady(false);
				}
				if(index==pl.getActivities().getStructure().getContains().size()){/*if there are no more, fire and exit while*/
					fire=true;
					moreactivities=true;
				}
			}

		}


		if(fire){

			List<org.pnml.tools.epnk.pnmlcoremodel.Arc> arclist = flat.getOut(pl);

			

			/*Finding out if it can be fired*/
			for(org.pnml.tools.epnk.pnmlcoremodel.Arc a : arclist){
				org.pnml.tools.epnk.pnmlcoremodel.Transition trans = flat.resolve((TransitionNode)a.getTarget());/*We know it has to be a Transition*/


				if(canfire((Transition)trans)){
					fire((Transition)trans);
				}	
			}
		}

		return;
	}

	/**
	 * @brief This method determines whether or not a given transition is enabled to fire
	 * @param trans Transition to check
	 * @return true if can fire, else false
	 */
	private boolean canfire(Transition trans){

		boolean canfire=true;
		//Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator = trans.getIn().iterator();
		List<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator2 = flat.getIn(trans);
		Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator = iterator2.iterator();
		while(canfire && iterator.hasNext()){
			Arc next = (Arc) iterator.next();
			if(!next.getFinished().isText()){//Unsure if this generated method actually returns the boolean I expect
				/*If the arc has its Finished value set to false*/
				if(placemarking.containsKey(flat.resolve((PlaceNode)next.getSource()))){//TODO change
					if(placemarking.get(flat.resolve((PlaceNode)next.getSource())).isEmpty()){//TODO change
						canfire=false;
					}
				}
			}else{

				Place tempplace = (Place) flat.resolve((PlaceNode)next.getSource());//TODO change
				ArrayList<IItem> itlist = placemarking.get(tempplace);
				boolean areAvailable = false;

				for(IItem item : itlist){
					if(item.getReady()){
						areAvailable=true;
					}
				}
				if(!areAvailable)
					canfire=false;
			}

		}
		return canfire;
	}

	/**
	 * @brief This method fires the given transition. It assumes the transition is enabled to fire. It will then propagate the consequences
	 * of the firing, checking if subsequent transitions have become enabled to fire and firing them if such is the case
	 * @param trans Transition to fire
	 */
	private void fire(Transition trans){
		/*We assume it is enabled to fire!*/
		ArrayList<IItem> modifieditems = new ArrayList<IItem>();
		List<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator2 = flat.getIn(trans);
		Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator = iterator2.iterator();
		//Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iterator = trans.getIn().iterator();
		while(iterator.hasNext()){
			Arc a = (Arc) iterator.next();


			Place pl = (Place)flat.resolve((PlaceNode) a.getSource());//TODO change
			ArrayList<IItem> itemlist = placemarking.get(pl);
			int index=0;
			boolean found=false;
			IItem actualitem = itemlist.get(index);
			if(!a.getFinished().isText()){/*If the tag finished in the arc is false*/
				move(actualitem,a);
				modifieditems.add(actualitem);
			}
			else{/*If finished is set to true*/
				while(!found){
					actualitem = itemlist.get(index);
					if(actualitem.getReady()){
						move(actualitem,a);
						modifieditems.add(actualitem);
						found=true;
					}
					index++;
				}
			}


		}
		/*Now we need to propagate the effects of the firing*/
		for(IItem itpropagate : modifieditems){
			Place newplace = itemmarking.get(itpropagate);
			Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iteratorprop = flat.getOut(newplace).iterator();
			//Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> iteratorprop = newplace.getOut().iterator();
			while(iteratorprop.hasNext()){
				Node node = flat.resolve((TransitionNode)iteratorprop.next().getTarget());
				if(node instanceof Transition){
					if(canfire((Transition)node)){
						fire((Transition)node);
					}
				}
			}
		}

	}

	/**
	 * @brief This function moves an item "through" a transition firing
	 * @param actualitem Item to be moved
	 * @param a Arc whose source is the Place in which the item is
	 */
	private void move(IItem actualitem, Arc a) {

		Arc outgoing=null;
		boolean change=true;
		Transition t=(Transition)flat.resolve((TransitionNode)a.getTarget());
		flat.getOut(t).iterator();
		Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> it = flat.getOut(t).iterator();
		while(it.hasNext() && outgoing==null){
			Arc temp =(Arc) it.next();
			if(temp.getIdnt().getText().equals(a.getIdnt().getText())){
				outgoing =temp;
				if(a.getKeepanm().isText() == true){/*If the arc has the keepanimation tag*/
					change = false;
				}
			}
			/*
			if(temp.getId().equals(a.getId())){
				outgoing =temp;
			}*/

		}
		if(change){
		
			updatemarkings(actualitem,(Place)flat.resolve((PlaceNode)outgoing.getTarget()),change);
		}

	}

	/**
	 * @brief This function updates the private markings of the class. Should only be called when an existing object is being moved.
	 *  Will also change the attributes of the IItem
	 *  
	 * @param actualitem Item to be moved
	 * @param changeAnimation determines if the item shall change its animation
	 * @param target Place to which the item is moving
	 */

	private void updatemarkings(IItem actualitem, Place target, boolean changeAnimation) {

		
		
			Place source = itemmarking.get(actualitem);

			itemmarking.put(actualitem, target);//Will overwrite the entry in the HashMap


			placemarking.get(source).remove(actualitem);
			placemarking.get(target).add(actualitem);
			actualitem.setGeometry(target.getGeo().getText());
			/*Change the item attributes*/
			if(changeAnimation){
				actualitem.setReady(false);
				actualitem.setActivity(target.getActivities().getStructure().getContains().get(0));
			}
			if(target.getCanchange().isText()){
				actualitem.setShape(target.getShape().getText());/*If canchange==true then the shape is changed*/
			}

		
		return;

	}

	//TODO to be deleted after the test
	public HashMap<IItem,Place> getItemMarking(){
		return itemmarking;
	}

	//TODO to be deleted after the test
	public HashMap<Place,ArrayList<IItem>> getPlaceMarking(){
		return placemarking;

	}

}
