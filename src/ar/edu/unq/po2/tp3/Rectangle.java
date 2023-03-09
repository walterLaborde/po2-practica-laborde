package ar.edu.unq.po2.tp3;

public class Rectangle {

	private float width;
	private float height;
	private Point origin;
	
	public Rectangle(Point origin, float width, float height) {
		super();
		this.setOrigin(origin);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	private float getWidth() {
		return width;
	}
	private void setWidth(float width) {
		this.width = width;
	}
	private float getHeight() {
		return height;
	}
	private void setHeight(float height) {
		this.height = height;
	}
	private Point getOrigin() {
		return origin;
	}
	private void setOrigin(Point origin) {
		this.origin = origin;
	}
	
	public float rectanglePerimeter() {
		return 2 * (this.getWidth()+this.getHeight());
	}
	
	public float rectangleArea() {
		return this.getWidth() * this.getHeight();
	}
	
	public String largestSide() {
		if (this.getWidth() > this.getHeight()) {
			return "Horizontal";
		}
		else if (this.getWidth() < this.getHeight()) {
			return "Vertical";
		}
		else {
			return "It's not a Rectangle";
		}
	}
}
