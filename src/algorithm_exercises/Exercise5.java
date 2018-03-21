package algorithm_exercises;

public class Exercise5 {
    public static void main(String[] args) {
        przestepny(3);
        przestepny(2000);
        przestepny(2005);
        przestepny(2009);
    }
    private static void przestepny(int year){
        if ((year % 4 == 0 && year% 100 !=0) || (year % 400 ==0)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");

        }

    }
}
