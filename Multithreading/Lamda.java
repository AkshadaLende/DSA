package multithreading;

public class Lamda {
		public static void main(String[] args) throws Exception{

		Runnable ref1= () ->
		{
			for (int i = 1; i < 5; i++) {
				System.out.println("hi");
				try {	Thread.sleep(1000);	} catch (InterruptedException e) {}
			
		}
		};
		Runnable ref2= () ->
		{
		for (int i = 1; i < 5; i++) {
			System.out.println("hello");
			try {	Thread.sleep(1000); } catch (InterruptedException e) {}
		}
		}
		;
		Thread t1 =new Thread(ref1);
		Thread t2 =new Thread(ref2);
		t1.start();
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("bye");
		
		}
	}

