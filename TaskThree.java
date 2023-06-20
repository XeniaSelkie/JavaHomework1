import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите желаемое действие (+,-,*, или /): ");
        String action = sc.next();
           switch (action) {
        case "+":
            System.out.print("Введите первое слагаемое: ");
            int summand1 = sc.nextInt();
            System.out.print("Введите второе слагаемое: ");
            int summand2 = sc.nextInt();
            int sum = summand1 + summand2;
            System.out.printf("Сумма равна %s", sum);
                  
            break;

        case "-":
            System.out.print("Введите первое слагаемое: ");
            int deductible = sc.nextInt();
            System.out.print("Введите второе слагаемое: ");
            int reduced = sc.nextInt();
            int difference = deductible - reduced;
            System.out.printf("Разность равна %s", difference);
                  
            break;

        case "*":
            System.out.print("Введите первый множитель: ");
            int multiplier1 = sc.nextInt();
            System.out.print("Введите второй множитель: ");
            int multiplier2 = sc.nextInt();
            int composition = multiplier1 * multiplier2;
            System.out.printf("Произведение равно %s", composition);  
            
            break;
        
        case "/":
            System.out.print("Введите делимое: ");
            int divisible = sc.nextInt();
            System.out.print("Введите делитель: ");
            int divider = sc.nextInt();
            int quotient = divisible / divider;
            System.out.printf("Частное равно %s", quotient);
                  
            break;

        default:
            System.out.print("Ошибка! Операция завершена");

            break;
        }
    }
}
