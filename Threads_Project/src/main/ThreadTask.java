package main;

public class ThreadTask implements Runnable {
	private String threadName;
	
	public ThreadTask(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Iniciando processo oneroso:" + this.threadName);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Processo finalizado:" + this.threadName);
		
	}

}
