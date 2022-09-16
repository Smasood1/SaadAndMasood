import java.util.Scanner;

public class SaadAndMasood {
    public static String personCheck(String name){
        if(name.equalsIgnoreCase("Alice")){
            return ("Hello, " + name);
        }
        if(name.equalsIgnoreCase("Bob")){
            return ("Hello, " + name);
        } else{
            return ("Who tf are you ");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name;

        System.out.println("Insert Name Below: ");

        name = in.next();
        while(!(name.equalsIgnoreCase("Alice")) && !(name.equalsIgnoreCase("bob"))){
            System.out.println("What is your name?");
            name = in.next();

        }

        System.out.println("Hello, "+ name);
    }







}
