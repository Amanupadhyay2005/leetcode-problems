class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            
            for (int j = 0; j < n; j++) {
                // Check row i
                rowSet.add(matrix[i][j]);
                
                // Check column i
                colSet.add(matrix[j][i]);
            }
            
            // If the set size isn't n after the inner loop, it's invalid
            if (rowSet.size() != n || colSet.size() != n) return false;
        }
        
        return true;
    }
}