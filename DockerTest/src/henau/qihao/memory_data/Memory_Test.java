package henau.qihao.memory_data;

/**
 * Author: Qihao
 * Date: 2020/6/23  19:35
 * Content:
 */

import java.io.*;

public class Memory_Test {
    public static void main(String[] args) throws FileNotFoundException {
        int t = 0;
        double mem = 0;
        Mem_Free mf = new Mem_Free();
        PrintStream ps = new PrintStream("C:\\Users\\lenovo\\Desktop\\12333\\out.txt");
        System.setOut(ps);
        for (int i = 0;i < 3600; i++){
            int request4 = i % 2;
            int request8 = (i+1) % 4;

            if ((request4 == 0)){
                mem += 20 * 0.01 * 2;
            }else {
                mem += 20 * 0.01 * 3;
            }

            if (request8 == 0){
                if (i > 60){
                mem += 30 * 1 * 2;
                }
                if (i > 360){
                mem += 30 * 10 * 2;
                }
            }else {
                if (i > 60){
                mem += 30 * 1;
                }
                if (i > 360){
                mem += 30 * 10;
                }
            }

            if (i > 2){
               mem = mf.Mem_Free(i,mem);
            }
            System.out.println(t + "," + mem +'\n');

            t += 1;
        }
    }

}


