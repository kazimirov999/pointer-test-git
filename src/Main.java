import ua.com.pointer.Robot;

public class Main {

    public static void main(String[] args) {
        Robot myRobot1 = new Robot();
        myRobot1.name = "Bender";
        myRobot1.metal = "Iron";
        myRobot1.color = "Gold";
        myRobot1.age = 50;

        System.out.println("My name " + myRobot1.name + ", " + "i made of " + myRobot1.metal + ", " + "my color is " + myRobot1.color + ", " + "and my age " + myRobot1.age);
        
        myRobot1.shooting();
        myRobot1.speak();




    }
}

