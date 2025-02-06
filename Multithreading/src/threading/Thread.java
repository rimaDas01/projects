package threading;

class FirstThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			/*try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());			}
		}*/
		
	}
}}
class SecondThread implements Runnable{
	
	//1st process
	/*public void run() {
		for(char i='A';i<='E';i++)
			System.out.println(i);
	}*/
	
	//2nd process
	public void run() {
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);

//		Thread.yield();

	}
}
}

public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new FirstThread());
//		t1.start(); //provides seperate copy of run method
//		t1.run();
		
//		Thread t2= new Thread(new SecondThread());
//		t2.setPriority(Thread.NORM_PRIORITY+2);
//		t2.start();
		/*try {
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}*/
		
//		t1.suspend();
//		t1.resume();

	}

}
