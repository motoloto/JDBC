
public class NoDeadLock_1 {
	public static void main(String args[]){
		T1 t1 = new T1(3, "T1");        //3 secs
		T2 t2 = new T2(0, "T2");        //0 secs

		t1.start();
		t2.start();
		try{
			Thread.sleep(5000);     //��1 sec ��  3 secs �p , �ϱot1���bsleep�ɳQ stop
		}catch(Exception e){}           //�]���L�k����T1.finished = true;
 		t1.stop();                      //�y��t2���j�� while(!T1.finished){yield();} ���u,�L�k���}
	}
}

class T1 extends Thread{
	private int sleepTime = 0;
	public static boolean finished = false;

	public T1(int second, String name){
		super(name);
		sleepTime = second;
	}

	public void run(){
		System.out.println("T1 running...");
 		try{
 			Thread.sleep(sleepTime*1000);      //3 secs
 		}catch(Exception e){}
		System.out.println("T1 finished.");
		T1.finished = true;
	}
}

class T2 extends Thread{
	private int sleepTime = 0;

	public T2(int second, String name){
		super(name);
		sleepTime = second;
	}

	public void run(){
		while(!T1.finished){yield();}
		System.out.println("T2 running...");
		System.out.println("T2 finished.");
	}
}
