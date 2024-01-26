package day01_basicJava;
import java.util.Scanner;
public class c02_variables {
    public static void main(String[] args) {

        Scanner unit = new Scanner(System.in);
        System.out.println("enter your name");
        String name = unit.nextLine();
        System.out.println("enter your surname");
        String surname = unit.nextLine();
        System.out.println("enter your age");
        Byte age = unit.nextByte();
        System.out.println(name + " " + surname + " " + age );
    }
}