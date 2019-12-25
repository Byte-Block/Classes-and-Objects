package paketDomaci16;

public class Tacka {
	private double x;
	private double y;

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String ispisTacke() {
		String ispisTacke = "";
		ispisTacke = "(" + x + "," + y + ")";
		return ispisTacke;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
