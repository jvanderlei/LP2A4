package main;

public class Main{
	  public static void main(String[] args) {
		  runWithJoin();
		  runWithoutJoin();	  
	  }
	  
	  private static void runWithJoin() {
			System.out.println("Com Join " + Thread.currentThread().getName());
			ThreadTask f1 = new ThreadTask("Conexão DB");
			Thread t1 = new Thread(f1);
			ThreadTask f2 = new ThreadTask("Conexão API");
			Thread t2 = new Thread(f2);
			ThreadTask f3 = new ThreadTask("Query");
			Thread t3 = new Thread(f3);
			
			
			try {
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				t3.start();
				t3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }

	private static void runWithoutJoin() {
		System.out.println("\n\n Sem Join:" + Thread.currentThread().getName());
		ThreadTask f1 = new ThreadTask("Conexão DB");
		Thread t1 = new Thread(f1);
		ThreadTask f2 = new ThreadTask("Conexão API");
		Thread t2 = new Thread(f2);
		ThreadTask f3 = new ThreadTask("Query");
		Thread t3 = new Thread(f3);
		
		
		t1.start();		
		t2.start();
		t3.start();
	  }
	}

