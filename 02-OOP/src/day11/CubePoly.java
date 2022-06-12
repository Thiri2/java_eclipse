package day11;

public class CubePoly implements ShapePoly{

	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public double Area(double area) {
		area = 6 * x * x;
		return 0;
	}

	@Override
	public double Volume(double vol) {
		vol = x * x * x;
		return 0;
	}
	
	
}
