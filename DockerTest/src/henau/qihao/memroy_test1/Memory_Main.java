package henau.qihao.memroy_test1;

/**
 * Author: Qihao
 * Date: 2020/6/25  8:56
 * Content:
 */
import java.io.*;
public class Memory_Main {
    public static void main(String[] args) throws FileNotFoundException {
        int t = 0;
//        int t_before;
        final int thread_group1 = 10;
        final int thread_group2 = 30;
        final int thread_group3 = 30;
        double mem = 0;
        Requests req = new Requests();
        Free_Mem freeMem = new Free_Mem();
        PrintStream ps = new PrintStream("C:\\Users\\lenovo\\Desktop\\12333\\outPut.txt");
        System.setOut(ps);
        for (int i = 0; i < 488; i ++){
//            t_before = t - 2;
            if ((t >= 0) && (t < 60)){
                mem = req.request1(t,mem,thread_group1);
            }
            if ((t >= 60) && (t < 180)){
                mem = req.request2(t,mem,thread_group2);
            }
            if ((t >= 360) && (t < 480)){
                mem = req.request3(t,mem,thread_group3);
            }

            if((t >= 2) & (t < 62)){
                mem = freeMem.free_req1(t,mem,thread_group1);
            }
            if ((t >= 62) & (t < 182)){
                mem = freeMem.free_req2(t,mem,thread_group2);
            }
            if ((t >= 362) & (t < 482)){
                mem = freeMem.free_req3(t,mem,thread_group3);
            }

            System.out.println(t + "," + mem +'\n');

            t ++;
        }
    }
}
