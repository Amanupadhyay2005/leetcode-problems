class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>Order = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int fr = 0,lr = matrix.length-1,fc = 0,lc = matrix[0].length-1;
        while(fr<=lr&&fc<=lc){
            for(int i = fc;i<=lc;i++){
               Order.add(matrix[fr][i]);
                
            }
            fr++;
               if (fr>lr||fc>lc)break;
            for(int i =fr;i<=lr;i++){
                Order.add(matrix[i][lc]);
            }
            lc--;
            if (fr>lr||fc>lc)break;
            for(int i = lc;i>=fc;i--){
               Order.add(matrix[lr][i]);
        }
        lr--;
        
               if (fr>lr||fc>lc)break;
            for(int i =lr;i>=fr;i--){
               Order.add(matrix[i][fc]);
            }
            fc++;
        }
           return Order;
        
    }
}