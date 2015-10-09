package pnvisfeatures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;

import OurPNVis.Place;


public class PNVisPlaceFigure extends PlaceFigure {

	public PNVisPlaceFigure(OurPNVis.Place place) {
		super(place);
	}


	public void update() {
		this.repaint();
	}

	protected void fillShape(Graphics graphics) {
		super.fillShape((org.eclipse.draw2d.Graphics) graphics);
		Rectangle rectangle = this.getClientArea();
		int m = 0;
		if (place!=null && place instanceof Place){
			if(((Place) place).getTokens() != null){
				if(((Place) place).getTokens().isText()){
					m = 1;
				}else{
					m = 0;
				}

				int cx = rectangle.x + rectangle.width/2;
				int cy = rectangle.y + rectangle.height/2;
				if (m == 0) {
					return;
				} else if (m == 1) {
					graphics.setBackgroundColor(getForegroundColor());
					graphics.fillOval(cx-6, cy-6, 12, 12);
				} else {
					graphics.drawString(""+m, cx-5, cy-7);
				} 
			}
		}

	}
}
