package KunalKush;

public class Main {
public static void main(String[] args) {
	LL list =new LL();
	list.insertFirst(3);
	list.insertFirst(4);
	list.insertFirst(5);
	list.insertFirst(7);
	list.insertFirst(8);
	list.insertLast(99);
//	list.deleteFirst();
//	System.out.println(list.deleteFirst());
//	list.deleteLast();
	list.insert(100, 3);
//	list.delete(3);
	System.out.println(list.find(100));
	list.display();
	
}
}
