class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
       char arr[][] = new char[boxGrid[0].length][boxGrid.length];
           
           // transpose of a matrix
        for(int i = 0;i < boxGrid.length;i++){
            for(int j = 0;j<boxGrid[0].length;j++){
                    arr[j][i] = boxGrid[i][j];
            }
        }

         // reverse all row of newly formed array
         for(int i = 0;i<arr.length;i++){
            int st = 0; int end = arr[0].length-1;
            while(st<end){
                char temp = arr[i][st];
                arr[i][st]= arr[i][end];
                arr[i][end]=temp;
                st++;
                end--;
            }
             
        } 
         for(int j =0 ;j<arr[0].length;j++){
            int space = arr.length-1;
            for(int i = arr.length-1;i>=0;i--){
                if(arr[i][j]=='*'){
                   space = i-1;
                   continue;
                }
                else if(arr[i][j]=='#'){
                    arr[i][j]='.';
                    arr[space][j]='#';
                    space--;
                }
            }
         }
             

            return arr;
    }
}