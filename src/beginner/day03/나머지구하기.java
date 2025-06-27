package beginner.day03;

public class 나머지구하기 {
    public int solution(int num1, int num2) {
        // 정수 num1를 num2로 나눈 나머지를 return
        int answer = 0;
        if (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) { // 제한 사항 조건 검사
            answer = num1 % num2;
        }
        return answer;
    }
}
