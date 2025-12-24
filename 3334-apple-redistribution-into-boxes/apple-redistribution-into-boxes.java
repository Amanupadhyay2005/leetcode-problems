import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        // Step 1: calculate total apples
        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }

        // Step 2: sort capacity in ascending order
        Arrays.sort(capacity);

        int boxesUsed = 0;

        // Step 3: take largest boxes first
        for (int i = capacity.length - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            boxesUsed++;

            if (totalApples <= 0) {
                return boxesUsed;
            }
        }

        return boxesUsed; // guaranteed solution exists
    }
}
