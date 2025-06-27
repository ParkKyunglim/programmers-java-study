package beginner.day02;

public class 두수의나눗셈 {
    // num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        double value = (double)num1  / num2 * 1000;
//        answer = (int)value;
//        return answer;
//    }
    public int solution(int num1, int num2) {
        return num1 * 1000 / num2; // 먼저 1000을 곱해서 정밀도를 높임
    }
}
