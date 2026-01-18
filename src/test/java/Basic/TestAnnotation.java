package Basic;

import org.testng.annotations.Test;

public class TestAnnotation {
	@Test
	public void main1() {
		System.out.println("I am main1 method");
		main2();
	}
	@Test
	public void main2() {
		System.out.println("I am main2 method");
		main3();
	}
	@Test
	public void main3() {
		System.out.println("I am main3 method");
	}
}
