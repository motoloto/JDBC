public class NewThread_Test {

    public static void main(String args[]) {

        // 以不同的建構者函數來產生執行緒陣列
        NewThread nt[] =
            new NewThread[] {
                new NewThread(),
                new NewThread("NT2", 2),
                new NewThread("NT3", 3),
                new NewThread("NT6", 6, true),
                new NewThread("NT9", 9, true)};

        for (int i = 0; i < nt.length; i++)
            nt[i].start();

        //將執行緒物件中的ready變數設為true時，
        //才會離開永久迴圈而執行下去
        NewThread.ready = true;
    }
}