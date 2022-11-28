/**
 * leson 1, task3
 * Реализовать простой калькулятор
 */
import java.util.Scanner;

public class les1task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
       
        System.out.println("Введите первое число");
        int fist_arg =  iScanner.nextInt();
        
        System.out.println("Введите второе число");
        int second_arg =  iScanner.nextInt();

        System.out.println("Введите номер операции, которую вы хотите произвести?");
        System.out.println("1: * - умножение");
        System.out.println("2: / - деление");
        System.out.println("3: + - сложение");
        System.out.println("4: - - вычитание");
        int operation =  iScanner.nextInt();
                     
        iScanner.close();

        System.out.println("Результат");
        
        if (operation == 1) {
            System.out.println(fist_arg * second_arg );
        }
        else if (operation == 2) {
            System.out.println(fist_arg / second_arg );
        }
        else if (operation == 3) {
            System.out.println(fist_arg + second_arg );
        }
        else if (operation == 4) {
            System.out.println(fist_arg - second_arg );
        }
        else {
            System.out.println("Данная операция не поддерживается!");
        }
    }
    
}