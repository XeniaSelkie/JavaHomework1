import java.util.Scanner;

public class TaskOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        sc.close();
        
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            count += i;
        }

        System.out.printf("Треугольное число числа %s", number);
        System.out.printf(" равно %s", count);
    }

}