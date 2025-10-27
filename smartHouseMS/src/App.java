import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Light light = new Light();
        Thermostat tst = new Thermostat();
        SecuritySystem sec = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("\n--- SMART HOUSE MANAGAMENT SYSTEM ---");
            System.out.println("\n--- Main Menu ---");
            System.out.println("1- Light Managament");
            System.out.println("2- Thermostat Management");
            System.out.println("3- Security System Management");            
            System.out.println("0- Exit");
            System.out.print("Please choice an action : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> lightMenu(light, scanner);
                case 2 -> thermostatMenu(tst, scanner);
                case 3 -> securitySystemMenu(sec, scanner);  
                case 0 -> {
                    running = false;
                    System.out.println("Exiting the program...");
                }
                default -> System.out.println("Unvalid action!");
            }
        }

        scanner.close(); 


    }

        // --- Light Menu ---
    private static void lightMenu(Light light, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Light Menu ---");
            System.out.println("1- Turn On");
            System.out.println("2- Turn Off");
            System.out.println("3- Question State");
            System.out.println("0- Back");
            System.out.print("Your action: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> light.turnOn();
                case 2 -> light.turnOff();
                case 3 -> System.out.println(light.getStatus());
                case 0 -> back = true;
                default -> System.out.println("Unvalid action!");
            }
        }
    }

    // --- Thermostat Menu ---
    private static void thermostatMenu(Thermostat tst, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Thermostat Menu ---");
            System.out.println("1- Turn On");
            System.out.println("2- Turn Off");
            System.out.println("3- Question State");
            System.out.println("0- Back");
            System.out.print("Your action: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> tst.turnOn();
                case 2 -> tst.turnOff();
                case 3 -> System.out.println(tst.getStatus());
                case 0 -> back = true;
                default -> System.out.println("Unvalid action!");
            }
        }
    }

    // --- Security System Menu ---
    private static void securitySystemMenu(SecuritySystem sec, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Security System Menu ---");
            System.out.println("1- Turn On Alarm & Cameras");
            System.out.println("2- Turn Off Alarm & Cameras");
            System.out.println("3- Question State");
            System.out.println("0- Back");
            System.out.print("Your action: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> sec.turnOn();
                case 2 -> sec.turnOff();
                case 3 -> System.out.println(sec.getStatus());
                case 0 -> back = true;
                default -> System.out.println("Unvalid action!");
            }
        }
    }
}
