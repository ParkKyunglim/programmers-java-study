package beginner.day02;

public class 배열두배 {
    public int[] solution(int[] numbers) {
        // numbers의 각 원소에 두배한 원소를 가진 배열을 return
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2; // 원본 배열 직접 수정
        }
        return numbers;
    }
}
