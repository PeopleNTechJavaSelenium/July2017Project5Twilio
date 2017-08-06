package polymorphism;

public class LandCalculator {
	
	public int areaOfLand(int a, int b) {
		int total = a + b;
		return total;
	}
	public int areaOfLand(int a, String name) {
		int total = a ;
		return total;
	}
	public final int areaOfLand(int a, int b, int c) {
		int total = a + b + c;
		return total;
	}
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}

}
