class Solution {
    public long solution(String numbers) {
        String[] strs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strs.length; i++) {
            if (numbers.contains(strs[i])) numbers = numbers.replaceAll(strs[i], Integer.toString(i));
        }
        return Long.parseLong(numbers);
    }
}
// switch 문을 사용했던 풀이에서 contains와 replaceAll을 사용한 풀이로 변경함.