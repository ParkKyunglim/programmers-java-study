package beginner.day04;

public class 피자나눠먹기1 {
    // 피자 7조각 나눔, n명 모두가 최소 한 조각 이상 먹기 위해 필요한 피자의 수
    public int solution(int n) {
        int answer = 0;
        // 나누어떨어지는 경우
        if(n % 7 == 0)
            answer = n / 7;
        // 나머지가 있는 경우
        else
            answer = (int)(n / 7) + 1;
        return answer;
        // 삼항 연산자로 한 줄 가능
        // return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}
