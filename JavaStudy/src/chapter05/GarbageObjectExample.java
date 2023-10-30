package chapter05;

public class GarbageObjectExample {
    
    public static void main(String[] args) {
        
        String hobby = "여행"; // 여행 값을 참조하는 변수가 없으므로 쓰레기 값
        hobby = null;

        String kind1 = "자동차"; 
        String kind2 = kind1; // 자동차 값을 참조하는 kind2 가 있으므로 쓰레기 아님
        kind1 = null;

        System.out.println("kind2: "+ kind2);
    }
}
