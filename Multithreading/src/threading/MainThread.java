package threading;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();
		System.out.println(t.getId());
		t.setName("Eclipse");
		System.out.println(t.getName());
		t.setPriority(9);
		System.out.println(t.getPriority());
		System.out.println(t.getClass());
	}

}
