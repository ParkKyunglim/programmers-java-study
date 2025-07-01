package beginner.day05;

public class 아메리카노 {
        public int[] solution(int money) {
            int[] answer = new int[2];
            answer[0] = money / 5500;    // 마실 수 있는 잔 수
            answer[1] = money % 5500;    // 남는 돈
            return answer;
        }
    }
