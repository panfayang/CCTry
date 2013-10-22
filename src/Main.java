
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = "你".charAt(0);
		Character d = new Character(c);
//		System.out.println(Character.getNumericValue(c));
		System.out.println(d.hashCode());
	}

}
