package Exercise2_LiquidContainersOOP;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);


    }
}
