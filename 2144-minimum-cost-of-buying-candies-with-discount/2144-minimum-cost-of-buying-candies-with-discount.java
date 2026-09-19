import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        // Arrays.sort(cost);
        // int res = 0;
        // for (int i = cost.length - 1; i >= 0; i--) {
        //     if ((cost.length - 1 - i) % 3 != 2) {
        //         total += cost[i];
        //     }
        // }
            int res=0;
            int temp;
            for(int i=0;i<cost.length;i++){
                for(int j=i+1;j<cost.length;j++){
                    if(cost[i]<cost[j]){
                        temp =cost[i];
                        cost[i]=cost[j];
                        cost[j]=temp;
                    }
                }
                
            }
            for(int i=1;i<cost.length+1;i++){
               if(i%3==0) continue;
                else{res+=cost[i-1];}
                }
            return res;
    }
}