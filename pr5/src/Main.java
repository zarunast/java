import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double circleLength(double r){
        return 2*Math.PI*r;
    }
    public static double circleArea(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        System.out.println(circleLength(r));
        System.out.println(circleArea(r));
    }
}