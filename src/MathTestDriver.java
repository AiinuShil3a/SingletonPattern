
public class MathTestDriver {

	public static void main(String[] args) {
		MathSingleton m1 = MathSingleton.getInstance();
		m1.setVariable1(15);
		m1.setVariable2(3);
		m1 = MathSingleton.getInstance();
		MathSingleton m2 = MathSingleton.getInstance();
		m2.setVariable2(5);
		System.out.println(m1.add());
		System.out.println(m1.subtract());
		System.out.println(m1.multiply());
		System.out.println(m1.divide());
		System.out.println(m1.equals(m2));
		System.out.println(m1);
		System.out.println(m2);
	}

}