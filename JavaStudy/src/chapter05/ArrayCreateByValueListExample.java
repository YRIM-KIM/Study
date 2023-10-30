package chapter05;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("seanson[0] : " + season[0]);
        System.out.println("seanson[1] : " + season[1]);
        System.out.println("seanson[2] : " + season[2]);
        System.out.println("seanson[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;

        for(int i = 0; i < 3; i++){
            sum += scores[i];
        }

        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);

    }
}
