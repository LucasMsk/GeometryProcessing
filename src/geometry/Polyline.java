package geometry;

import java.util.ArrayList;

public class Polyline extends Figure {
	private ArrayList<Point> points;
	
	public Polyline(int num, ArrayList<Point> points) {
		this.num = num;
		this.points = points;
	}

	@Override
	public double lenght() {
		double lenght = 0.0;
		if(points.size() > 0) {
			for(int i = 0; i < points.size()-1; i++) {
				int x1 = points.get(i).getX();
				int x2 = points.get(i+1).getX();
				int y1 = points.get(i).getY();
				int y2 = points.get(i+1).getY();
				
				lenght += Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	
			}
		}
		return lenght;
	}

	@Override
	public double field() {
		return 0;
	}

}
