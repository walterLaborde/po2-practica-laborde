package ar.edu.unq.po2.tp3;

public class Point {

	private int x = 0;
	private int y = 0;
	
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	
	public void movePointTo(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point addToPoint(Point p) {
		return new Point(this.getX() + p.getX(), this.getY() + p.getY());
	}
}
