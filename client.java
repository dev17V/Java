import java.util.Scanner;
import java.net.*;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1771);
        clearConsole();
        login();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        // Check username
        if (username.contains("root")) {
            clearConsole();
        } else {
            System.out.println(username + " | NOT IN DATABASE");
        }

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Check password
        if (password.contains("root")) {
            clearConsole();
        } else {
            System.out.println(username + " | INVALID USER OR PASS");
        }

        menu();
    }

    public static void menu() {
        // Print menu banner
        System.out.println("=== HIVENET MENU ===\n");

        String helpMenu = (
            "attack  |  shows how to attack \n" +
            "methods |  shows ddos method\n"
        );

        String myMethods = "\n udpflood"; //finna add udpflood function

        while (true) {
            Scanner hiveInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("=== COMMAND ===\n");
            String myInput = hiveInput.nextLine();  //Reads input

            if (myInput.contains("?")) {
                System.out.println(helpMenu);
            }

            if (myInput.contains("methods")) {
                System.out.println(myMethods);
            }

            if (myInput.contains("attack")) {
                System.out.println("Type ! First");
                System.out.println("USAGE: <METHOD> <ip> <port> <time>");
            }

            if (myInput.contains("!")) {
                System.out.println("Loading...\n");
                Scanner attackMethod = new Scanner(System.in);  // Create a Scanner object
                System.out.println("=== METHOD ===\n");
                String myMethodInput = attackMethod.nextLine();  //Reads input
                Scanner target = new Scanner(System.in);  // Create a Scanner object
                System.out.println("=== IP ===\n");
                String ipInput = target.nextLine();  //Reads input
                Scanner targetport = new Scanner(System.in);  // Create a Scanner object
                System.out.println("=== PORT ===\n");
                String portInput = targetport.nextLine();  //Reads input
                Scanner attackTime = new Scanner(System.in);  // Create a Scanner object
                System.out.println("=== TIME ===\n");
                String timeInput = attackTime.nextLine();  //Reads input
                System.out.println("Loading Attack...");
            }

            if (myInput.contains("clear")) {
                clearConsole();
                System.out.println("=== HIVENET MENU ===\n");
            }
        }
    }
}
