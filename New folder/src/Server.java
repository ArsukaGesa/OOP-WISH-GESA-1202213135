package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu = new Menu();
        menu.setName(name"Bakso");
        menu.setCategory(category"Makanan");
        menu.setPrice(price 9000);
        
        Menu menu2 = new Menu();
        menu2.setName(name"Brown Sugar Milk");
        menu2.setCategory(category"Minuman");
        menu2.setPrice(price 15000);

        Menu menu3 = new Menu();
        menu3.setName(name"Sate Telor Puyuh");
        menu3.setCategory(category"Side Dish");
        menu3.setPrice(price 4000);

        // TODO Insert Menu to Database
        db.insertMenu();

        // TODO Display Main Menu
        System.out.println("======Initiating======");
        System.out.println("Welcome to The Restaurant");
        System.out.println("Please register your userName...");
        System.out.println("================================");
        // TODO Create User
        User user = new User();

        // Display Menu

    }
}