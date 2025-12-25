class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
//           long sum = 0;
//           int j = happiness.length-1;
//           while(k>0){  
//             sum = sum + happiness[j];
//             for(int i = 0;i<j;i++){
//                 if(happiness[i]!=0){
                    
//                happiness[i] = happiness[i]-1;
//             }
//            }
//             k--;
//             j--;
//           }

//          return sum; 
          

        
//     }
// }
 long sum = 0;
        int n = happiness.length;

        for (int i = 0; i < k; i++) {
            int value = happiness[n - 1 - i] - i;
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }
}