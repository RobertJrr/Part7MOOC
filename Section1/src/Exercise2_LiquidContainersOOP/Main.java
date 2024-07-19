package Exercise2_LiquidContainersOOP;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while(true){
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if(command.equals("quit")){
                break;
            }
            int amount = Integer.valueOf(parts[1]);
             if(command.equals("add")){
                container1.add(amount);
            } else if(command.equals("remove")){
                container2.remove(amount);
            } else if(command.equals("move")){
                container1.move(container2,amount);
            }
        }
    }
}
