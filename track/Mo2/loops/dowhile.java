import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

        } while (!password.equals("bannu"));

        System.out.println("Login successful!");
    }
}

class MenuExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hello");
            System.out.println("2. Java");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Hello!");
            }
            else if (choice == 2) {
                System.out.println("You selected Java.");
            }
            else if (choice == 3) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid choice.");  
            }

        } while (choice != 3);
    }
}
class Onemore{
    public static void main(String[]args){
        int attempt = 1;
        do{
            System.out.println("attempt" + attempt);
            attempt++;
        }while(attempt <= 3);
    }
}
class Onemor2{
    public static void main(String[]args){
        String password;
        Scanner afn = new Scanner(System.in);
        do{
            System.out.println("enter the password");
            password = afn.nextLine();
            }while(!password.equals("bannu"));
            System.out.println("login successful"); 
    }
}
class Do_for{
    public static void main(String[] args) {
        int i = 1;
        do { 
            for(int j = 1;j<=5;j++){
                System.out.println(j);
            }
            i++;
            System.out.println();
        } while(i<=5);
    }
}
class do_while{
    public static void main(String[] args) {
        int i =1;
        do {
            int j =1;
            while(j<=5){
                System.out.println(j);
                j++;
            }
            i++;
            System.out.println();
        } while (i<=5);
    }
}
class Table{
    public static void main(String[]args){
        for(int i =1;i <=10;i++){
            System.out.println("4 x "+i+" = "+i*4);
        }
        System.out.println("");
         int j = 1;
            while(j<= 10){
                System.out.println("3 x " +j+" = "+j*3);
                j++;
            }
            System.out.println("");

            int o = 1;
            do {
                System.out.println("2 x" + " = " + o *2);
                o++;
            } while (o <=10);
    }
}
class One_m_dowhile{
    public static void main(String[]args){
        int i =1;
        do { 
            int j =1;
            do { 
                System.out.println(j);
                j++;
            } while (j<=5);
            System.out.println("");
            i++;
        } while (i<=5);
    }
}
class m_demo{
    public static void main(String[] args) {
        for (int i = 1;i<=5; i++){
            for(int j =1;j<=5;j++){
                System.out.print(j);//ln will remove to print like this 12345
            }
            System.out.println();
        }
    }
}

