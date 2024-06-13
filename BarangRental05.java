public class BarangRental05 {
    String noTNKB, namaKendaraan, jenisKendaraan;
    int tahun, biayaSewa;
    BarangRental05 next;

    public BarangRental05(String noTNBK, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNBK;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.next = null;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public BarangRental05 getNext() {
        return next;
    }

    public void setNext(BarangRental05 next) {
        this.next = next;
    }
}
