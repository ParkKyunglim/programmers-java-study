package beginner.day05;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < num_list.length; i++){
            // i번째 위치에 뒤에서 (i+1)번째 원소를 배치
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}
