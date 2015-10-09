package pnvisfeatures;

import org.eclipse.swt.graphics.Color;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import OurPNVis.Arc;


public class PNVisArcFigure extends ArcFigure {

	Color c=null;
	Arc arco=null;

	public PNVisArcFigure(org.pnml.tools.epnk.pnmlcoremodel.Arc arc) {
		super(arc);
		if(arc instanceof Arc){
			arco = (Arc)arc;
		}
		setGraphics();
		
	}

	@Override
	public void update() {
		setGraphics();
		
	}

	private void setGraphics() {
		if(arco!=null && arco.getIdnt()!=null && arco.getIdnt().getText()!=null){
			
			if(arco.getIdnt().getText().equals("1")){
				if(c!=null) c.dispose();
				c = new Color(null,255,0,0);
			}else if(arco.getIdnt().getText().equals("2")){
				if(c!=null) c.dispose();
				c = new Color(null,0,255,0);
			}else if(arco.getIdnt().getText().equals("3")){
				if(c!=null) c.dispose();
				c = new Color(null,0,0,255);
			}else{
				if(c!=null) c.dispose();
				c = new Color(null,50,50,50);
			}
			this.setForegroundColor(c);

		}
	}
}
