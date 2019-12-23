package ua.com.pointer;

public class Robot {
    public String name;
    public String metal;
    public String color;
    public double age;

    public void speak() {
        System.out.println(name+":"+" I`ll be back.");
    }
    public void shooting() {
        int a = 0;
        while (a < 10){
            System.out.println(a + " Tra-ta-ta");
            a++;}
            System.out.println("Reload");

    }
}

