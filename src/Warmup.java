import java.util.Scanner;

public class Warmup
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first value" );
        int a = scanner.nextInt();
        System.out.println("Insert second value");
        int b = scanner.nextInt();
        System.out.println("Insert third value");
        int c = scanner.nextInt();

        if((a+b>c & a+c>b & b+c>a) && (a*a +b*b == c*c)) {
            double area = 0.5 * a * b;
            int circuit = a + b + c;
            double avd = circuit / 3;
            System.out.println(" Area =" + area);
            System.out.println(" Circuit =" + circuit);
            System.out.println("Avg = " + avd);
        }



    }
}
