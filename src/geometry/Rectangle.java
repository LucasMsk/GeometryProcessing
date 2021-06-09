package geometry;

public class Rectangle extends Figure {
	private Point firstPoint, secondPoint;
	private int a,b;
	
	public Rectangle(int num, Point first, Point second) {
		this.num = num;
		this.firstPoint = first;
		this.secondPoint = second;
		this.a = Math.abs(this.firstPoint.getX() - this.secondPoint.getX());
		this.b = Math.abs(this.firstPoint.getY() - this.secondPoint.getY());
	}

	@Override
	public double lenght() {
		return (2*a) + (2*b);
	}

	@Override
	public double field() {
		return a*b;
	}

}
