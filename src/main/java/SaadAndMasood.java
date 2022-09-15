import java.util.Scanner;

public class SaadAndMasood {
    public static String personCheck(String name){
        if(name.equalsIgnoreCase("Saad")){
            return ("Hello, " + name);
        }
        if(name.equalsIgnoreCase("Masood")){
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

        System.out.println(personCheck(name));
    }







}
