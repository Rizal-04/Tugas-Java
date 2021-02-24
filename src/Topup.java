import java.util.Scanner;

public class Topup {
    public static void main(String[] args) {
        
        int diamond = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("mau beli diamond berapa : Rp ");
        diamond = scan.nextInt();

        if(diamond > 20000 ){
            System.out.println("Diamond Anda telah ter kirim dan dapat bonus 15 diamond");
        }

        System.out.println("Terima kasih sudah berlangganan di toko kami...");

    }
}