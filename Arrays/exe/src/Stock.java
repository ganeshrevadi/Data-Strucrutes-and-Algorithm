public class Stock {
    public static void main(String[] args) {
        int[] prices = new int[]{2,4,1};
        int diff = 0;
        int ans = 0;
        for (int i = 0; i < prices.length -1; i++) {
            for (int j = i; j < prices.length ; j++) {
                diff = prices[j] - prices[i];
                if(diff > ans){
                    ans = diff;
                }
            }
        }
        System.out.println(ans);

//        int low = 100000;
//        int high = 0;
//        int index = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if(low > prices[i]){
//                low = prices[i];
//                index = i;
//            }
//        }
//        for(int j = index ; j < prices.length ; j++){
//            if(high < prices[j]){
//                high = prices[j];
//            }
//        }
//        int ans = high - low;
//        System.out.println(ans);


    }
}
