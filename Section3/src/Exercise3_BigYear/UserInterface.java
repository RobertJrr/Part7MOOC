package Exercise3_BigYear;

import java.util.Scanner;

class UserInterface {
    private Scanner scanner;

    public UserInterface(){
        this.scanner = new Scanner(System.in);

        while(true){
            displayCommands();
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("quit")){
                break;
            }
        }

    }

    public void start(){


    }


    public void displayCommands(){
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        System.out.print("Enter command: ");
    }
}
