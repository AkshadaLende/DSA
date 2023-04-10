package multithreading;

class Hi extends Thread{
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("hi");
			try {	Thread.sleep(1000);	} catch (InterruptedException e) {}
		}
	}	
}
class Hello extends Thread{
	public  void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("hello");
			try {	Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
}


public class ThreadProgram {
	public static void main(String[] args) {

	Hi ref1= new Hi();
	Hello ref2= new Hello();
	ref1.start();
	try { Thread.sleep(10); } catch (InterruptedException e) {}
	ref2.start();
	
	}
}
