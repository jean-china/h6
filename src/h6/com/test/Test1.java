package h6.com.test;

public class Test1 {

	public static void main(String[] args) {
		A001 a002 = new A001();
		for (int i = 0; i < 30; i++) {
			A001 a001 = new A001();
			a001.setBeanName("AA" + i);
			a001.call();
		}

	}
}
