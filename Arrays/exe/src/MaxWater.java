public class MaxWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        int a = 3;
        int b = 2;
        int ans = (int)Math.log(Math.pow(10, a) * Math.pow(10, b));
        System.out.println(ans);

    }

    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(area, max);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;
    }
}
