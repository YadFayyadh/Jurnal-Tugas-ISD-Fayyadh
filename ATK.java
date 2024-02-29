package Jurnal02;
public class ATK {
    private String kodebarang;
    private String jenisbarang;
    private String namabarang;
    private int stokbarang;

    public ATK(String kodebarang, String jenisbarang, String namabarang, int stokbarang) {
        this.kodebarang = kodebarang;
        this.jenisbarang = jenisbarang;
        this.namabarang = namabarang;
        this.stokbarang = stokbarang;
    }

    public String getKodebarang() {
        return this.kodebarang;
    }

    public String getJenisBarang() {
        return this.jenisbarang;
    }

    public String getNamaBarang() {
        return this.namabarang;
    }

    public int getStokbarang() {
        return this.stokbarang;
    }

    @Override
    public String toString() {
        return "ATK kode barang=" + kodebarang + ", jenis barang=" + jenisbarang + ",  =" + namabarang
                + ", stok barang=" + stokbarang + "";
    }
}
