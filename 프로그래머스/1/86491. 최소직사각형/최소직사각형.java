class Solution {
    
    public int solution(int[][] sizes) {
        int maxGaro = 0;
        int maxSero = 0;

        for (int[] size : sizes) {
            if (size[0] > size[1] ) {
                if (size[0] > maxGaro) {
                    maxGaro = size[0];
                }
                if (size[1] > maxSero) {
                    maxSero = size[1];
                }
            } else if (size[0] < size[1]) {
                if (size[1] > maxGaro) {
                    maxGaro = size[1];
                }
                if (size[0] > maxSero) {
                    maxSero = size[0];
                }
            } else {
                if (size[0] > maxGaro) {
                    maxGaro = size[0];
                }
                if (size[1] > maxSero) {
                    maxSero = size[1];
                }
            }
        }
        
        return maxGaro * maxSero;
    }
}
