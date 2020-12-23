import java.util.Scanner;

public class Junit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("შემოიტანე პირველი რიცხვი:");
        int a = input.nextInt();
        System.out.println("შემოიტანე მეორე რიცხვი:");
        int b = input.nextInt();
        CalculatorServiceImpl calc = new CalculatorServiceImpl(a,b);
        int sum = calc.sum();
        int prod = calc.prod();
        System.out.printf("შეკრება : "+ sum + " გამრავლება : " + prod);
    }
}
