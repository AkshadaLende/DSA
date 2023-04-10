package array;


public class Driver {
	
	int id;
	String name;
	public Driver(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id +" "+name;
		
	}
	public static class Drive{
		public static void main(String[] args) {
			Driver e1 = new Driver(10,"kajs");
			System.out.println(e1);
		}
	}
}
