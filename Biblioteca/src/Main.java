import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menus menus = new Menus();
        menus.menuPrincipal(scanner);
        scanner.close();
    } 
}
