package KunalKush;

public class MainCl {
	public static void main(String[] args) {
		CLL dlist = new CLL();
		
		dlist.insert(8);
		dlist.insert(50);
		dlist.insert(9);
		dlist.insert(5);
		dlist.insert(8);
		dlist.delete(50);
		dlist.display();
	}

}
