import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransaksiRental05 transaksi = new TransaksiRental05(10);
        BarangRental05[] br = new BarangRental05[5];
        BarangRental05 br = new BarangRental05(null, null, null, 0, 0);
        int pilih;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Urut No TNBK");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1/2/3/4/5): ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    
                    break;
                
                case 2:

            
                case 3:
                    System.out.println("Menampilkan seluruh transaksi:");
                    transaksi.printTransaksi();
                    break;

                case 4:
                    System.out.println("Urutkan transaksi berdasarkan No TNBK:");
                    transaksi.sortDescending(); 
                    break;

                default:
                    break;
            }
        } while (pilih!= 5);
    }
}
