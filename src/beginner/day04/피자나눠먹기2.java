package beginner.day04;

public class 피자나눠먹기2 {
    // 피자 6조각 나눔, n명 매개변수
    // n명이 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판
    public int solution(int n) {
        int answer = 1;

        // 6 × answer가 n으로 나누어떨어질 때까지 반복
        while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }
            answer++;
        }
    }
}
