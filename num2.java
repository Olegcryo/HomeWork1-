//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

public class num2 {
    public static void main(String[] args) {
        int i, j;
   boolean isprime;
         for(i=1; i < 1000; i++) {
        isprime = true;
            for (j=2; j <= i/j; j++)
                if((i%j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
}
}  
}
