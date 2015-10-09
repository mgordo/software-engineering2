package pnvisfeatures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import OurPNVis.OurPNVisPackage;

public class PNVisGraphicalExtension extends GraphicalExtension {

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(OurPNVisPackage.eINSTANCE.getPNVis());
		return list;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(OurPNVisPackage.eINSTANCE.getPNVis())) {
			list.add(OurPNVisPackage.eINSTANCE.getArc());
			list.add(OurPNVisPackage.eINSTANCE.getPlace());
		}
		return list;
	}

	@Override
	public ArcFigure createArcFigure(Arc arc) {
		if (arc instanceof OurPNVis.Arc) {
			return new PNVisArcFigure(
					(OurPNVis.Arc) arc);
		}
		return null;
	}
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof
				OurPNVis.Place) {
			return new PNVisPlaceFigure(
					(OurPNVis.Place) place);
		}
		return null;
	}

}
