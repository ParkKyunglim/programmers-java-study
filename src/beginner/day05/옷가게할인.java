package beginner.day05;

public class 옷가게할인 {
    public int solution(int price) {
        if(price >= 500000) return (int)(price * 0.8);   // 20% 할인
        if(price >= 300000) return (int)(price * 0.9);   // 10% 할인
        if(price >= 100000) return (int)(price * 0.95);  // 5% 할인

        return price;  // 할인 없음
    }
}
