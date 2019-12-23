import ua.com.pointer.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println(" Your  Ammunition  " + " " + str.nextInt());


        Robot vitya = new Robot();
        System.out.println("Height of Robot" + " " + vitya.height);
        System.out.println("HP" + " " + vitya.health);

    }
}
