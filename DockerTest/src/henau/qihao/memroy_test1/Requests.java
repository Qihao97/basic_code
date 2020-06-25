package henau.qihao.memroy_test1;

/**
 * Author: Qihao
 * Date: 2020/6/25  8:56
 * Content:
 */
public class Requests {
    public double request1(int t,double mem,int thread_group1){
        int req8 = (t + 1) % 4;
        if ((t >= 0) && (t < 60)){
            if (req8 == 0){
                mem += thread_group1 * 0.01 * 2;
                mem += thread_group1 * 1.0 * 2;
            }else{
                mem += thread_group1 * 0.01 * 1;
                mem += thread_group1 * 1.0 * 1;
            }
        }
        return mem;
    }

    public double request2(int t,double mem,int thread_group2){
        int req4 = t % 2;
        if ((t >= 60) && (t < 180)){
            if (req4 == 0){
                mem += thread_group2 * 10 * 2;
            }else{
                mem += thread_group2 * 10 *3;
            }
        }

        return mem;
    }

    public double request3(int t, double mem, int thread_group3){
        int req4 = t % 2;
        if ((t >= 360) && (t < 480)){
            if (req4 == 0){
                mem += thread_group3 * 10 * 2;
            }else{
                mem += thread_group3 * 10 * 3;
            }
        }
        return mem;
    }
}
