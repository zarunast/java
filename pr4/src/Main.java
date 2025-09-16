import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int [] mas = new int [n];
        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i<n;i++){
            mas [i] =random.nextInt(201)-100;
        }
        for (int i = 0; i<n;i++){
            min=Math.min(min, mas[i]);
            max=Math.max(max,mas[i]);
        }
        int res=max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(res);

    }
}