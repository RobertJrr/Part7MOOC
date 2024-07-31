package Exercise3_BigYear;
class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        UserInterface ui = new UserInterface(dataBase);
        ui.start();
    }
}
