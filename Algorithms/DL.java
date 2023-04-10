package KunalKush;

public class DL {
	private Node head;
	private Node tail;
	private int size;

	public DL() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		node.next = null;
		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}
		while (last.next != null) {

			last = last.next;
		}

		last.next = node;
		node.prev = last;

	}
	public void insert(int index, int val) {
		Node node =new Node(val);
		
		Node prev=get(index-1);
		node.next=prev.next;
		node.prev=prev;
		prev.next=node;
		if(node.next!=null) {
			node.next.prev=node;
		}
	}

	
	public Node get(int index) {
		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp=temp.next;
			
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		Node last = null;
		while (temp != null) {
			System.out.print(temp.value + " ->");
			last = temp;
			temp = temp.next;
		}
		System.out.println("End");
		System.out.println("Printing in reverse");
		while (last != null) {
			System.out.print(last.value + " ->");
			last = last.prev;
		}
		System.out.println("End");
	}

	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
}
