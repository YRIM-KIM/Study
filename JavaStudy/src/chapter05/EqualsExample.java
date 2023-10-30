package chapter05;

public class EqualsExample {
    public static void main(String[] args) {
        
        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        if(strVal1 == strVal2){

            System.out.println("strVal1과 strVal2는 참조가 같음");

        } else {

            System.out.println("strVal1과 strVal2는 참조가 다름");
        }

        if(strVal1.equals(strVal2)){
            System.out.println("strVal1과 strVal2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3 과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3 과 strVar4는 문자열이 같음");
        }
    }
}
