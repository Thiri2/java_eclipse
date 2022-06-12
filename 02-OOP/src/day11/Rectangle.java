package day11;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle(int length, int width, String color) {
		this.length = length;
		this.width = width;
		setColor(color);
	}

	@Override
	public double Area() {
		double area = length * width;
		return area;
	}
	
	public void displayArea() {
		System.out.println("Area of the rectangle : " + Area());
	}
	

}
