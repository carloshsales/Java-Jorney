import java.util.Scanner;

public class Tests{
    public static void start(){
        var scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        var message = switch (number) {
            case 1 -> "Hello";
            case 2 -> "World";
            default -> "Error";
        }

        
    }
}