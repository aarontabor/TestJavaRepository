package awt;

public class Driver {

	public static void main(String[] args) {
		Iterator it = new Iterator();
		
		for (int i=0; i<10; i++) {
			System.out.println(it.getNext());
		}

	}

}
