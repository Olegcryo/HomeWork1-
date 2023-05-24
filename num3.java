import java.util.Scanner;

//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

public class num3 {
    public static void main(String[] args) { 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: "); 
            int num1 = scanner.nextInt(); 
            System.out.print("Введите второе число: "); 
            int num2 = scanner.nextInt(); 
            System.out.print("Введите операцию ( , -, *, /): "); 
            char operator = scanner.next().charAt(0);
            int result = 0; 
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break; 
                case '-': 
                    result = num1 - num2; 
                    break; 
                case '*': 
                    result = num1 * num2;
                    break; 
                case '/': 
                    result = num1 / num2;
                    break; 
                default: 
                    System.out.println("Некорректная операция!"); 
                    return; 
            } 
            System.out.println("Результат: " + result);
        } 
    } 
}
    







       
