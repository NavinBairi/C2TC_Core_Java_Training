package thread;

public class Multi_Thread {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread obj = new Thread(t);
		obj.start();
		for (int i =0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}


class MyThread implements Runnable
{
	public void run()
	{
		for (int i =0;i<10;i++)
	{
		System.out.println("child thread");
	}}}