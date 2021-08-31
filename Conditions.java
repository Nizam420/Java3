import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
                
            case "Apple":
                System.out.println("Sweet fruit");
                break;
                
            default:
                    System.out.println("The end is here");
                in.close();
        }
    }
}
