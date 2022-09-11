public class digitcount {
    public static void main(String[] args) {
        int[] nums ={3564,63,3,22,3,23,2,322322,323,2332};

        int ans= digits( nums);


    }


    static int digits(int[] nums){
        int digitcount = 0;
        for(int num :nums) {
            while (num> 0) {
                digitcount++;
                num = num / 10;
            }

        }
        int count= 0;
        if(digitcount%2==0){
            count++;
        }
        if(count>0){
            System.out.println("There are "+count+"  numbers containing even of digits");
        }
        else{
            System.out.println("There are no numbers containing even number of digits");
        }
        return count;


    }
}
