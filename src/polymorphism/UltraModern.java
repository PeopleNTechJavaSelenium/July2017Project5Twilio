package polymorphism;

public class UltraModern extends ModernLandCalculator{
	
	@Override
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d + 5;
		return total;
	}
}
