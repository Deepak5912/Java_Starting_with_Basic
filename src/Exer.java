public class Exer{
    public static void main(String[] args) {
        int [] marks = {90,60,70,35,60};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("total: "+total);
        int avg = total/marks.length;
        System.out.println("average: "+avg);
        if(avg >= 75 && avg <= 100){
            System.out.println("Distinction");
        }
        else if(avg >= 60 && avg < 75){
            System.out.println("First Class");
        }else if(avg >= 40 && avg < 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("fail");
        }
    }
}
