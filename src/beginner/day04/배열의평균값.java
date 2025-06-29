package beginner.day04;

public class 배열의평균값 {
    //정수 배열 numbers 매개변수, 원소의 평균값을 return
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        // 향상된 for문으로 배열 원소 합계 계산
        for(int i : numbers){
            sum += i;
        }

        // 정수를 double로 형변환하여 실수 나눗셈 수행
        answer = sum / (double)numbers.length;
        return answer;
    }
}
