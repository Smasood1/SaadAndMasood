import java.util.Scanner;

public class SaadAndMasood {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("What is your Name? ");

        name = input.next();


        if(name.equalsIgnoreCase("Alice")){
            System.out.println("Hello, " + name);
        }
        else if(name.equalsIgnoreCase("Bob")){
            System.out.println("Hello, " + name);
        } else{
            System.out.println("who tf are you");
        }
    }


}








