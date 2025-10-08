import java.util.Scanner;

public class App {

    private final static String WELCOME_MESSAGE = "Hello World!";

    public static void main(String[] args) throws Exception {
        //One line comment
        /**
         * Many lines comment
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome:");
        String name = scanner.next();
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();

        //normal format
        System.out.println("Olá " + name + " sua idade é " + age);
        //template string
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}
