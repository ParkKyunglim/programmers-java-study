package beginner.day02;

public class 분수의덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        // 두 분수를 통분하여 더함
        int denum = denum1 * num2 + denum2 * num1;  // 통분한 분자
        int num = num1 * num2;                     // 통분한 분모

        // 최대공약수(GCD)를 구해서 기약분수로 만들기
        int gcd = getGCD(denum, num);

        // 분자와 분모를 최대공약수로 나눈 기약분수 반환
        return new int[]{denum / gcd, num / gcd};
    }

    // 유클리드 호제법을 이용한 최대공약수 계산
    public int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;  // 나누어떨어지면 b가 최대공약수
        }

        return getGCD(b, a % b);  // 나머지를 이용해 재귀 호출
    }
}
