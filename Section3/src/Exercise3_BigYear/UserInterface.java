package Exercise3_BigYear;

import java.util.Scanner;

class UserInterface {
    private Scanner scanner;
    private DataBase database;

    public UserInterface(DataBase db){
        this.scanner = new Scanner(System.in);
        this.database = db;
    }

    public void start(){
        while(true){
            displayCommands();
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("quit")){
                break;
            } else if(command.equalsIgnoreCase("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                if(checkIsDigit(name) || checkIsDigit(latinName)){
                    System.out.println("No digits please.. Try Again");
                    continue;
                }
                database.addBirdToDataBase(new Bird(name,latinName));
            } else if(command.equalsIgnoreCase("All")){
                database.printAllBirds();
            } else if(command.equalsIgnoreCase("Observation")){
                System.out.print("Bird: ");
                String observation = scanner.nextLine();
                database.addObservation(observation);
            }else if(command.equalsIgnoreCase("One")){
                System.out.print("Bird Name: ");
                String name = scanner.nextLine();
                database.printOne(name);
            } else{
                System.out.println("NOT A VALID COMMAND, TRY AGAIN..... ");
            }
        }
    }


    public boolean checkIsDigit(String input){
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
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
