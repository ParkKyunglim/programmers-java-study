package beginner.day03;

import java.util.HashMap;
import java.util.Map;

public class 최빈값 {
    public int solution(int[] array) {
        //최빈값을 return 최빈값이 여러 개면 -1을 return
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1; //getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드

            if (count > maxCount) {
                maxCount = count;
                answer = number;
            }
             else if(count == maxCount) {
                    answer = -1;
                }

                map.put(number, count);
            }

            return answer;
        }
}