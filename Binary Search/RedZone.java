import java.util.*;
public class RedZone {
    public static void main(String[] args) {

    }

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        ArrayList<pair> a = new ArrayList<>();
        for(int i =0; i<n; i++){
            a.add(new pair(1.0*A.get(i).get(0), 1.0*A.get(i).get(1)));
        }
        int ans =-1;
        int l =0;
        int h = Integer.MAX_VALUE;
        while(l<=h){
            int mid = l + (h-l)/2;
            if (ispos( a ,mid, B)){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    public static boolean ispos(ArrayList<pair> a, int mid, int need){
        int count =0;
        int n = a.size();
        for (int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                pair p = new pair(a.get(j).a-a.get(i).a, a.get(j).b-a.get(i).b);
                double dist = (double)Math.sqrt(p.a*p.a + p.b*p.b);
                if (dist> 2.0*(double)mid){
                    continue;
                }
                pair mids = new pair((a.get(i).a+a.get(j).a)/2.0 , (a.get(i).b + a.get(j).b)/2.0);
                double new_dis = (double)Math.sqrt(1.0*mid*mid - (dist*dist/4.0));
                pair new_pair = new pair(-1.0*(p.b)*new_dis/dist, (p.a)*new_dis/dist);
                pair tocheck1 = new pair(mids.a-new_pair.a , mids.b-new_pair.b);
                pair tocheck2= new pair(mids.a+new_pair.a , mids.b+new_pair.b);
                int fir =2; int sec =2;
                for (int k =0; k<n; k++){
                    if (k==i || k ==j){
                        continue;
                    }
                    pair lo = new pair(a.get(k).a ,a.get(k).b);
                    if (Math.sqrt((lo.a-tocheck1.a)*(lo.a-tocheck1.a)+(lo.b-tocheck1.b)*(lo.b-tocheck1.b)  )<=(double)mid){
                        fir++;
                    }
                    if (Math.sqrt((lo.a-tocheck2.a)*(lo.a-tocheck2.a) + (lo.b-tocheck2.b)*(lo.b-tocheck2.b))<=(double)mid){
                        sec++;
                    }
                }
                count = Math.max(Math.max(fir, sec), count);
            }
        }
        return count>=need;

    }
}


class pair{
    double a; double b;
    public pair(double a, double b){
        this.a =a;
        this.b =b;
    }
}

