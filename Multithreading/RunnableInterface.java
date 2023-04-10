package multithreading;


	class Hii implements Runnable{
		public void run() {
			for (int i = 1; i < 5; i++) {
				System.out.println("hi");
				try {	Thread.sleep(1000);	} catch (InterruptedException e) {}
			}
		}	
	}
	class Helllo implements Runnable{
		public  void run() {
			for (int i = 1; i < 5; i++) {
				System.out.println("hello");
				try {	Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		}
	}


	public class RunnableInterface {
		public static void main(String[] args) {

		Runnable ref1= new Hii();
		Runnable ref2= new Helllo();
		Thread t1 =new Thread(ref1);
		Thread t2 =new Thread(ref2);
		t1.start();
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		t2.start();
		
		}
	}


