class NewThread extends Thread {
    public static boolean ready = false; //�u�}�]�v�ܼ�

    //�H�|�ؤ��P���غc�̨�ƨӫإߪ��� (function overloading)
    public NewThread() {
        super("NT1");
    }

    public NewThread(String name) {
        super(name);
    }

    public NewThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public NewThread(String name, int priority, boolean isDaemon) {
        super(name);
        setPriority(priority);
        setDaemon(isDaemon);
    }

    public void run() {
        while (!ready) {
        } // �u�n�S�}�]�A�N������U�@��C

        System.out.println(
              "My name is " + getName() 
            + "..... My priority is " + getPriority() 
            + "..... Am I alive? " + isAlive()
            + "..... Am I daemon? " + isDaemon()
        );
        

//      String nameOfcurrentThread = Thread.currentThread().getName();
//      System.out.println("�ثe���b���檺��������W�r="+nameOfcurrentThread);
    }
}