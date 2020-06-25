package henau.qihao.memory_data;

/**
 * Author: Qihao
 * Date: 2020/6/24  9:17
 * Content:
 */
public class Mem_Free {
    public double Mem_Free(int t_now,double mem){
        int t_before = t_now - 2;
        int req4 = t_before % 2;
        int req8 = t_before % 4;
        if (req4 == 0){
            mem -= 20 * 0.01 * 2;
        }else {
            mem -= 20 * 0.01 * 3;
        }

        if (req8 == 0){
            if (t_before > 60){
            mem -= 30 * 1 * 2;
            }
            if (t_before > 360){
            mem -= 30 * 10 * 2;
            }
        }else {
            if (t_before > 60){
            mem -= 30 * 1;
            }
            if (t_before > 360){
            mem -= 30 * 10;
            }
        }

        return mem;
    }
}
