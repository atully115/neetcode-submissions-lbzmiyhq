class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // brute for two pointer two for loops
        // take i and iterate form right to left with j until 
        // i + j == target
        int[] answer = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--){
                if(numbers[i] + numbers[j] == target) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
