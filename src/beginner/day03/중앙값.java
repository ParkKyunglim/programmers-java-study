package beginner.day03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 중앙값 {
    //어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값 구하기
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 정렬 (오름차순)
        return array[array.length / 2];
    }
}
