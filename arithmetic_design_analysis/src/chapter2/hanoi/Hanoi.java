package chapter2.hanoi;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Qihao
 * Date: 2019/11/28  15:06
 * Content:
 * 求解汉诺塔问题:
 */
public class Hanoi {
    private int n = 1;

    public Hanoi() {
    }

    public Hanoi(int n) {
        this.n = n;
    }

    public void move(String X,int a,String Y){
        System.out.println("将编号为 " + a + " 的圆盘从 " + X + " 塔座 " + " 移到 " + Y + " 塔座.");



            FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\out.txt", true);
            fileWriter.write("将编号为 " + a + " 的圆盘从 " + X + " 塔座 " + " 移到 " + Y + " 塔座.");
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }


    }

    public void hanoi(int a,String X,String Y,String Z){
        if (a == 1){
            move(X,1,Z);
        }else{
            hanoi(a - 1,"X","Z","Y");
            move(X,a,Z);
            hanoi(a - 1,"Y","X","Z");
        }
    }
}
