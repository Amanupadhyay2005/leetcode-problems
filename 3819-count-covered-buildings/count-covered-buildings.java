class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        int[] rowMin = new int[n + 1];
        int[] rowMax = new int[n + 1];
        int[] colMin = new int[n + 1];
        int[] colMax = new int[n + 1];

        // Initialize
        for (int i = 0; i <= n; i++) {
            rowMin[i] = Integer.MAX_VALUE;
            colMin[i] = Integer.MAX_VALUE;
            rowMax[i] = Integer.MIN_VALUE;
            colMax[i] = Integer.MIN_VALUE;
        }

        // First pass: determine extremes
        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            rowMin[x] = Math.min(rowMin[x], y);
            rowMax[x] = Math.max(rowMax[x], y);

            colMin[y] = Math.min(colMin[y], x);
            colMax[y] = Math.max(colMax[y], x);
        }

        // Second pass: count covered buildings
        int count = 0;
        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            boolean hasLeft = rowMin[x] < y;
            boolean hasRight = y < rowMax[x];
            boolean hasDown = colMin[y] < x;
            boolean hasUp = x < colMax[y];

            if (hasLeft && hasRight && hasDown && hasUp) {
                count++;
            }
        }

        return count;
    }
}
