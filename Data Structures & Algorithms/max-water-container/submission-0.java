class Solution {
    public int maxArea(int[] heights) {
        // two pointer
        // i = beginning
        // j = end
        // loop, store temp. if temp > answer, answer = temp
        // return hieghts[j] * (j - i);
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < heights.length; i++) {
            for(int j = heights.length - 1; j > i; j--) {
                if (heights[i] >= heights[j]) {
                    temp = heights[j] * (j - i);
                } else {
                    temp = heights[i] * (j -i);
                }
                if (temp > answer){
                    answer = temp;
                }
            }
        }
        return answer;
    }
}
