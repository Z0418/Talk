package main.java.maggie;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

    public static int findMax(List<Integer> inputs) {

        Integer max = inputs.get(0);

        for (Integer e: inputs) {
            if (max < e) {
                max = e;
            }
        }

        return max;

    }

    // 主入口
    public static void main(String argv[]) {
        Random random = new Random();

        List<Integer> datas = new LinkedList<>();
        int i = 10;
        while (i > 0) {
            datas.add(random.nextInt());
            i --;
        }

        int max = Test.findMax(datas);

        System.out.println("max = " + max);
    }
}
