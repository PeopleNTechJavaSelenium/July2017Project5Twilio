package nestedclass;

public class OuterClass {

	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	
	public void outterMethod() {
		System.out.println("This is from Outter Method");
		innerA.innerAMethod();
		innerB.innerBMethod();
	}
	private class InnerA{
		private void innerAMethod() {
			System.out.println("This is from InnerA Method");
		}
	}
	
    private class InnerB{
      private void innerBMethod() {
    	  System.out.println("This is from InnerB Method");
		}
	}
}
