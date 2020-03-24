package nestedclass;

public class Outer {

	public String outerVariableA;
	InnerClassA innerClassA = new InnerClassA();
	InnerClassB innerClassB = new InnerClassB();
	
	public void outerMethodA() {
		System.out.println("This is from Outer MethodA");
		innerClassA.innerClassAMethodA();
		innerClassB.innerClassBMethodA();
	}

public class InnerClassA{
	private String innerVariableA;
	
	private void innerClassAMethodA() {
		System.out.println("This is from InnerClassA MethodA");
	}
}
private class InnerClassB{
	private String innerVariableB;
	
	private void innerClassBMethodA() {
		System.out.println("This is from InnerClassB MethodA");
	}
 }
	
}
