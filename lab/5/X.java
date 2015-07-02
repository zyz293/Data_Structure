public class X {
	public int[] xa;
	
	public X() {
	xa = null;
	}
	
	public static void main(String[] ints) {
		X x;
		Y y = new Y();
//		xa = ya; // compile successfully
//		ya = xa; // compile error

		ya = y;
		xa = ya;
	}
}






