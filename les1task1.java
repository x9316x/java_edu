/**
 * leson 1, task1
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class les1task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите n:");
        int n =  iScanner.nextInt();
        iScanner.close();
        
        int sum = 0;
        int prod = 1;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("Сумма чисел:");
        System.out.println(sum);
        System.out.println("Произведение чисел:");
        System.out.println(prod);
    }
    
}