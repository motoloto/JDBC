public class NewThread_Test {

    public static void main(String args[]) {

        // �H���P���غc�̨�ƨӲ��Ͱ�����}�C
        NewThread nt[] =
            new NewThread[] {
                new NewThread(),
                new NewThread("NT2", 2),
                new NewThread("NT3", 3),
                new NewThread("NT6", 6, true),
                new NewThread("NT9", 9, true)};

        for (int i = 0; i < nt.length; i++)
            nt[i].start();

        //�N��������󤤪�ready�ܼƳ]��true�ɡA
        //�~�|���}�ä[�j��Ӱ���U�h
        NewThread.ready = true;
    }
}