package ss4_Opp.bai_tap.StopWatch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch =new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

        double[] arr1 = new double[500000];

        for(int i = 0; i < 500000; ++i) {
            arr1[i] = StrictMath.floor(StrictMath.random() * 100.0D) + 1.0D;
        }

        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}