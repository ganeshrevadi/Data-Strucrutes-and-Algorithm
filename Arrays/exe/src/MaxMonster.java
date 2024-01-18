import java.util.Arrays;

public class MaxMonster {
    public static void main(String[] args) {
        int[] dist = {1,3,4};
        int[] speed = {1,1,1};
        System.out.println(eliminateMaximum(dist, speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        double[] time = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = (double)dist[i] / (double)speed[i];
        }
        System.out.println(Arrays.toString(time));

        Arrays.sort(time);
        int res = 0;
        double stick = 0.0;

        for(int i = 0; i < time.length; i++) {
            if(stick < time[i]) {
                res++;
                stick++;
            } else {
                break;
            }
        }
        return res;
    }

}
