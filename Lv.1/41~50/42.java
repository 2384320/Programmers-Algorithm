class Solution {
    public String solution(int[] numbers, String hand) {
        // 왼손과 오른손의 위치를 나타낼 변수
        // 단 키패드는 0부터 시작해 11로 끝남.
        // 9 = *, 11 = #
        int leftSpot = 9, rightSpot = 11;
        // 각 엄지와 눌러야 할 버튼의 거리를 나타낼 변수 leftDistance, rightDistance와
        // 눌러야 할 버튼을 나타낼 num
        int leftDistance, rightDistance, num;
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            // 만약 0을 눌러야 하면 해당 키패드의 위치를 나타내도록 10으로 표기
            num = numbers[i] == 0 ? 10 : numbers[i] - 1;
            
            
            if (num + 1 == 1 || num + 1 == 4 || num + 1 == 7) {
                // 1 4 7를 누르게 되면 L 표기
                answer = answer.concat("L");
                leftSpot = num;
            } else if (num + 1 == 3 || num + 1 == 6 || num + 1 == 9) {
                // 3 6 9를 누르게 되면 R 표기
                answer = answer.concat("R");
                rightSpot = num;
            } else {
                // 2 5 8 0을 누르게 되면 각 엄지와 눌러야 할 키패드의 거리를 측정함.
                // 가상의 배열을 만들었다고 할 때, 인덱스를 사용하여 측정을 하게 될 텐데
                // 현재 내가 짠 변수들을 이용하여 만들어봤음. -> 키패드 위치를 0부터 표기한 이유
                leftDistance = Math.abs(num/3 - leftSpot/3) + Math.abs(num%3 - leftSpot%3);
                rightDistance = Math.abs(num/3 - rightSpot/3) + Math.abs(num%3 - rightSpot%3);
                
                // 만약 두 거리가 같다면 오른손잡이인지 왼손잡이인지 확인
                // 해당 손과의 거리를 하나 줄여주면 밑의 조건문에서 알맞게 잡아줌.
                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) rightDistance--;
                    else leftDistance--;
                }
                
                // 만약 왼쪽 거리가 더 길면 R, 그 반대의 경우는 L 표기
                if (leftDistance > rightDistance) {
                    answer = answer.concat("R");
                    rightSpot = num;
                } else if (leftDistance < rightDistance) {
                    answer = answer.concat("L");
                    leftSpot = num;
                }
            }
        }
        
        return answer;
    }
}