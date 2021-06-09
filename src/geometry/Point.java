package geometry;

public class Point {
	private int x,y;
	
	public static Point verifyPoint(String[] cords) {
		if(cords.length != 2) {
			return null;
		}
		try {
			int x = Integer.parseInt(cords[0]);
			int y = Integer.parseInt(cords[1]);
			if(x > 0 && x < 10000 && y > 0 && y < 10000) {
				return new Point(x,y);
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
