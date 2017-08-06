package polymorphism;

public class ModernLandCalculator extends LandCalculator {

	@Override		
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d - 2;
		return total;
	}
	public int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		return total;
	}
}
