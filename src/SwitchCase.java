import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String hp;
        Scanner scan = new Scanner(System.in);

        System.out.print("apakah merek HP kamu: ");
        hp = scan.nextLine();

        switch(hp){
            case "xiaomi":
                System.out.println("xiaomi, mayannn mayannn");
                break;
            case "samsung":
                System.out.println("samsung, mantab ahhh");
                break;
            case "iphone":
                System.out.println("iphone, Anjay sultan");
                break;  
            default:
                System.out.println("maaf merek hp mu tidak ada");     
        }
    }
}
