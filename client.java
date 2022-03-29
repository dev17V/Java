import java.util.Scanner; // import the Scanner class 
import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] args) throws IOException {
          Socket s = new Socket("localhost", 1771); //1771 is the port
          Runtime.getRuntime().exec("clear");
          login();   
    }
    
    public static void login() {
        Scanner myuser = new Scanner(System.in);  // Create a Scanner object
        System.out.println("â•”â•username \nâ–¼");
        String userName = myuser.nextLine();  // Reads username
        
        //if statement needs to be here to check username
        if (userName.contains("root")) {
            System.out.flush();
            System.out.println("\r\n");
            System.out.println("\r\n");
            System.out.println("\r\r\r\r\r\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\r\r\r\r\r");
            System.out.flush();
        } else {
            System.out.println(userName+" | NOT IN DATABASE");
        }
        
        Scanner mypass = new Scanner(System.in);  // Create a Scanner object        
        System.out.println("â•”â•password \nâ–¼");
        String passWord = mypass.nextLine();  // Reads password
        
        //if statement needs to be here to check password
        if (passWord.contains("root")) {
            System.out.flush();
            System.out.println("\r\n");
            System.out.println("\r\r\r\r\r\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\r\r\r\r\r");
            System.out.flush();
        } else {
            System.out.println(userName+" | INVALID USER OR PASS");
        }
        
        menu();
    }
    
    public static void menu() {
        String ban1 = "â•¦ â•¦â•¦â•¦  â•¦â•”â•â•—â•”â•—â•”â•”â•â•—â•”â•¦â•—";
        String ban2 = "â• â•â•£â•‘â•šâ•—â•”â•â•‘â•£ â•‘â•‘â•‘â•‘â•£  â•‘";
        String ban3 = "â•© â•©â•© â•šâ• â•šâ•â•â•â•šâ•â•šâ•â• â•©";
        System.out.println(ban1);
        System.out.println(ban2);
        System.out.println(ban3);
        
        String helpMenu = (
              "\nattack  |  shows how to attack \nmethods |  shows ddos method\n"        
        );
        
        String myMethods =   "\n udpflood"; //finna add udpflood function
        
        while (true) {
            Scanner hiveInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("â•”â•HIVENETâ•‘\nâ–¼");
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
            
            String attackbanA = " â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•— â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•— â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—  â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ•—  â–ˆâ–ˆâ•—";
            String attackbanB = "â–ˆâ–ˆâ•”â•â•â–ˆâ–ˆâ•—â•šâ•â•â–ˆâ–ˆâ•”â•â•â•â•šâ•â•â–ˆâ–ˆâ•”â•â•â•â–ˆâ–ˆâ•”â•â•â–ˆâ–ˆâ•—â–ˆâ–ˆâ•”â•â•â•â•â•â–ˆâ–ˆâ•‘ â–ˆâ–ˆâ•”â•";
            String attackbanC = "â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘      â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•‘â–ˆâ–ˆâ•‘     â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•”â• ";
            String attackbanD = "â–ˆâ–ˆâ•”â•â•â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘      â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•”â•â•â–ˆâ–ˆâ•‘â–ˆâ–ˆâ•‘     â–ˆâ–ˆâ•”â•â–ˆâ–ˆâ•— ";
            String attackbanE = "â–ˆâ–ˆâ•‘  â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘      â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘  â–ˆâ–ˆâ•‘â•šâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ•‘  â–ˆâ–ˆâ•—";
            String attackbanF = "â•šâ•â•  â•šâ•â•   â•šâ•â•      â•šâ•â•   â•šâ•â•  â•šâ•â• â•šâ•â•â•â•â•â•â•šâ•â•  â•šâ•â•";
            String attackbanG = "â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ–ˆâ•—   â–ˆâ–ˆâ•—â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—";
            String attackbanH = "â–ˆâ–ˆâ•”â•â•â•â•â•â–ˆâ–ˆâ•”â•â•â•â•â•â–ˆâ–ˆâ–ˆâ–ˆâ•—  â–ˆâ–ˆâ•‘â•šâ•â•â–ˆâ–ˆâ•”â•â•â•";
            String attackbanI = "â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—  â–ˆâ–ˆâ•”â–ˆâ–ˆâ•— â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘   ";
            String attackbanJ = "â•šâ•â•â•â•â–ˆâ–ˆâ•‘â–ˆâ–ˆâ•”â•â•â•  â–ˆâ–ˆâ•‘â•šâ–ˆâ–ˆâ•—â–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘";
            String attackbanK = "â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•‘â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ•—â–ˆâ–ˆâ•‘ â•šâ–ˆâ–ˆâ–ˆâ–ˆâ•‘   â–ˆâ–ˆâ•‘";
            String attackbanL = "â•šâ•â•â•â•â•â•â•â•šâ•â•â•â•â•â•â•â•šâ•â•  â•šâ•â•â•â•   â•šâ•â•";
            
            if (myInput.contains("!")) {
                System.out.println("Loading...\n");
                Scanner attackMethod = new Scanner(System.in);  // Create a Scanner object
                System.out.println("â•”â•METHODâ•‘\nâ–¼");
                String myMethodInput = attackMethod.nextLine();  //Reads input
                Scanner target = new Scanner(System.in);  // Create a Scanner object
                System.out.println("â•”â•IPâ•‘\nâ–¼");
                String ipInput = target.nextLine();  //Reads input
                Scanner targetport = new Scanner(System.in);  // Create a Scanner object
                System.out.println("â•”â•PORTâ•‘\nâ–¼");
                String portInput = targetport.nextLine();  //Reads input
                Scanner attackTime = new Scanner(System.in);  // Create a Scanner object
                System.out.println("â•”â•TIMEâ•‘\nâ–¼");
                String timeInput = attackTime.nextLine();  //Reads input
                System.out.println(attackbanA);
                System.out.println(attackbanB);
                System.out.println(attackbanC);
                System.out.println(attackbanD);
                System.out.println(attackbanE);
                System.out.println(attackbanF);
                System.out.println(attackbanG);
                System.out.println(attackbanH);
                System.out.println(attackbanI);
                System.out.println(attackbanJ);
                System.out.println(attackbanK);
                System.out.println(attackbanL);
            }

            if (myInput.contains("clear")) {
                System.out.println("\033[H\033[2J");  
                System.out.flush();
                //System.out.println("\r\r\r\r\r\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
                System.out.flush();
                System.out.println(ban1);
                System.out.println(ban2);
                System.out.println(ban3); 
            }
            
        }   
    }
  }






