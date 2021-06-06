import java.util.Scanner;
public class SayHello {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Hi, what's your name? ");
        String name = input.next();
        System.out.println();
        System.out.printf("Hello, ");
        System.out.printf(name);
        System.out.println(", what a pleasure to meet you!");
    }
}
