package awt;

public class Iterator {
	private int i;
	
	public Iterator() {
		i = 0;
	}
	
	public int getNext() {
		return i++;
	}

}
