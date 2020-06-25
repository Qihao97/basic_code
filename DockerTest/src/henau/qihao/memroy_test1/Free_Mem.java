package henau.qihao.memroy_test1;

/**
 * Author: Qihao
 * Date: 2020/6/25  8:57
 * Content:
 */
public class Free_Mem {
    public double free_req1(int t,double mem,int thread_group1){
        int t_before = t - 2;
        int req8 = (t_before + 1) % 4;
        if ((t >= 2) && (t_before < 62)){
            if (req8 == 0){
                mem -= thread_group1 * 0.01 * 2;
                mem -= thread_group1 * 1.0 * 2;
            }else {
                mem -= thread_group1 * 0.01 * 1;
                mem -= thread_group1 * 1.0 * 1;
            }
        }
        return mem;
    }

    public double free_req2(int t,double mem, int thread_group2){
        int t_before = t - 2;
        int req4 = t_before % 2;
        if ((t >= 62) && (t_before < 182)){
            if (req4 == 0){
                mem -= thread_group2 * 10.0 * 2;
            }else {
                mem -= thread_group2 * 10.0 *3;
            }
        }
        return mem;
    }

    public double free_req3(int t,double mem,int thread_group3){
        int t_before = t - 2;
        int req4 = t_before % 2;
        if ((t_before >= 362) && (t_before < 482)){
            if (req4 == 0){
                mem -= thread_group3 * 10.0 * 2;
            }else {
                mem -= thread_group3 * 10.0 * 3;
            }
        }
        return mem;
    }
}
