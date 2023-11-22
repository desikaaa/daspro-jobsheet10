import java.util.Scanner;
public class ModifBioskopWithScanner072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String [][] penonton = new String[4][2];

        while (true){
            System.out.println("MENU: ");
            System.out.println("1. Inpu data penonton");
            System.out.println("2. Tampilkan daftar penonton ");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                while (true) {
                System.out.println("INPUT DATA PENONTON");
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris > penonton.length || kolom > penonton[0].length) {
                System.out.println("Nomor baris/kursi tidak tersedia.");
            }
            else
            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        break;
 
            case 2:
            System.out.println("#####################################################");
            System.out.println("DAFTAR PENONTON");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[0].length; j++) {
                    if (penonton[i][j] != null) {
            System.out.println("Baris " + (i + 1) + ", Kolom" + (j + 1) + ": " + penonton[i][j]);
                }
            }
        }
        break;
 
            case 3: 
            System.out.println("#####################################################");
            System.out.println("Terima kasih. Program berakhir.");
            return;
 
           default:
            System.out.println("#####################################################");
            System.out.println("Silahkan pilih menu yang valid");
        }
 
 
            System.out.println("#####################################################");
            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
 
            if (next.equalsIgnoreCase("n")) {
            break;
            }
        }
    }
}