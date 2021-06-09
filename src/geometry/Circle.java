package geometry;

public class Circle extends Figure {
	private int r;
	private Point center;
	
	public static Circle verifyCricle(int num, Point point, int r) {
		int x = point.getX();
		int y = point.getY();
		if(x+r > 0 && x+r < 10000 && y+r > 0 && y+r < 10000 &&
				x-r > 0 && x-r < 10000 && y-r > 0 && y-r < 10000
		) {
			return new Circle(num, point,r);
		} else {
			return null;
		}
	}
	
	public Circle(int num, Point center, int r) {
		this.num = num;
		this.center = center;
		this.r = r;
	}

	@Override
	public double lenght() {
		return Math.PI * 2 * r;
	}

	@Override
	public double field() {
		return Math.PI * Math.pow(r, 2);
	}

}
