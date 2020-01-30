package shapes;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	
	public double perimeter() {
		double p = this.getLength() + this.getWidth();
		p *= 2;
		return p;
	}
	public double area() {
		double a = this.getLength() * this.getWidth();
		return a;
	}
	public Boolean isSquare() {
		if (this.length == this.width)
			return true;
		return false;
	}

}
