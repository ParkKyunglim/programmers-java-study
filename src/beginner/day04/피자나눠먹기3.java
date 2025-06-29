package beginner.day04;

public class 피자나눠먹기3 {
    // 피자 조각 2 ~ 10조각, n명 최소 한 조각 이상, 몇 판을 시켜야 하는지 return
    public int solution(int slice, int n) {
        int answer = 0;

        if(n % slice == 0) {
            answer = n / slice;           // 나누어떨어지는 경우
        } else {
            answer = n / slice + 1;       // 나머지가 있는 경우
        }

        return answer;
        // 삼항 연산자 한 줄로 표현
        // return n % slice > 0 ? n/slice + 1 : n/slice;
    }
}
