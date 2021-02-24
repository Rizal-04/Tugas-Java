import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int umur;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        nama = scan.nextLine();
        System.out.print("Masukan Umur: ");
        umur = scan.nextInt();

        if( umur >= 20) {
            System.out.println( nama + " sudah tua lohh yaa, punya pasangan gak");
        }else {
            System.out.println( nama + " Masih kecil gak boleh pacaran lo yaa");
        }


    }
}
