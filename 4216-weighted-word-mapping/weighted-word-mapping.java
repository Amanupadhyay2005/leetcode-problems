class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result  = new StringBuilder();
        for(String w : words){
            int total = 0;
            for(int i = 0;i<w.length();i++){
                char c = w.charAt(i);
                total = total + weights[c - 'a'];
            }

                int remainder = total % 26;

                char mapped = (char) ('z'-remainder);
                 
                 result = result.append(mapped);

            
        }
        return result.toString();
    }
}