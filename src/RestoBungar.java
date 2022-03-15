import java.util.Scanner;

public class RestoBungar {
    static Object[][] list_makanan = {
            {"Nasi Goreng Spesial", 9999.99},
            {"Ayam Bakar Spesial", 12345.67},
            {"Steak Sirloin Spesial", 21108.40},
            {"Kwetiaw Siram Spesial", 13579.13},
            {"Kambing Guling Spesial", 98765.43},
    };
    static String devider = "=====================";
    static double total_nasgor, total_ayam, total_steak, total_kwetiaw, total_kambing;

    public static void main(String[] args) {
        // Variable
        int jumlah_orang, jml_nasgor, jml_ayam, jml_steak, jml_kwetiaw, jml_kambing;
        String pemesan;

        // Init
        Scanner sc = new Scanner(System.in);

        // Catat pemesan
        print("Selamat Siang...");
        print("Pesan untuk berapa orang : ");
        jumlah_orang = sc.nextInt();
        print("Pesanan atas nama        : ");
        pemesan = sc.next();

        // Menampilkan menu
        print("Menu Spesial hari ini");
        print(devider);
        tampilMenu();

        // Isi pesanan
        print("Pesanan Anda [batas pesanan 0-10 porsi per menu]");
        print("1. Nasi Goreng Spesial    = ");
        jml_nasgor = sc.nextInt();
        print("2. Ayam Bakar Spesial     = ");
        jml_ayam = sc.nextInt();
        print("3. Steak Sirloin Spesial  = ");
        jml_steak = sc.nextInt();
        print("4. Kwetiaw Siram Spesial  = ");
        jml_kwetiaw = sc.nextInt();
        print("5. Kambing Guling Spesial  = ");
        jml_kambing = sc.nextInt();
        print("");
        print("");

        // Result
        print("Selamat menikmati makanan anda...");
        print("Pembelian : ");
        total_nasgor = hitungPesanan(jml_nasgor, 9999.99);
        total_ayam = hitungPesanan(jml_ayam, 12345.67);
        total_steak = hitungPesanan(jml_steak, 21108.40);
        total_kwetiaw = hitungPesanan(jml_kwetiaw, 13579.13);
        total_kambing = hitungPesanan(jml_kambing, 98765.43);
        print("1. Nasi Goreng Spesial        " + jml_nasgor + " porsi * Rp. 9999.99   = Rp. " + total_nasgor);
        print("2. Ayam Bakar Spesial         " + jml_ayam + " porsi * Rp. 12345.67    = Rp. " + total_ayam);
        print("3. Steak Sirloin Spesial      " + jml_steak + " porsi * Rp. 9999.99    = Rp. " + total_steak);
        print("4. Kwetiaw Siram Spesial      " + jml_kwetiaw + " porsi * Rp. 9999.99  = Rp. " + total_kwetiaw);
        print("5. Kambing Guling Spesial     " + jml_kambing + " porsi * Rp. 9999.99  = Rp. " + total_kambing + "  +");
        print(devider+devider+devider+devider);
        print("Total Pembelian :                                                      = Rp. " + hitungTotalPesanan());
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void tampilMenu() {
        int i = 1;
        for (Object[] makanan: list_makanan) {
            print(i + ". " + makanan[0] + "     @ Rp. " + makanan[1]);
            i++;
        }
    }

    public static double hitungPesanan(int jml_porsi, double harga) {
        return (double) jml_porsi * harga;
    }

    public static double hitungTotalPesanan() {
        return (double) total_nasgor + total_ayam + total_steak + total_kwetiaw + total_kambing;
    }
}
