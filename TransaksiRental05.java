public class TransaksiRental05 {
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental05 head, tail;

    public TransaksiRental05(int k) {
        
    }
    public TransaksiRental05(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addBarang(String noTNBK, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        BarangRental05 newBarang = new BarangRental05(noTNBK, namaKendaraan, jenisKendaraan, tahun, biayaSewa);
        if (isEmpty()) {
            head = newBarang;
            tail = newBarang;
        } else {
            tail.setNext(newBarang);
            tail = newBarang;
        }
        System.out.println("Kendaraan berhasil ditambahkan.");
    }

    public void printTransaksi() {
        if (!isEmpty()) {
            BarangRental05 current = head;
            System.out.println("Daftar Kendaraan:");
            while (current != null) {
                System.out.println("No TNBK: " + current.getNoTNKB());
                System.out.println("Nama Kendaraan: " + current.getNamaKendaraan());
                System.out.println("Jenis Kendaraan: " + current.getJenisKendaraan());
                System.out.println("Tahun: " + current.getTahun());
                System.out.println("Biaya Sewa: " + current.getBiayaSewa());
                System.out.println("---------------------------");
                current = current.getNext();
            }
        } else {
            System.out.println("Belum ada kendaraan yang ditambahkan.");
        }
    }

    public void sortDescending() {

    }

    public void inputTransaksi(int kodeTransaksi, int lamaPinjam) {

    }

}
