class Mahasiswa1 {
    private String nim;
    private String nama;
    private String kelas;
    private int[] riwayatNilai = new int[100]; 

    
    private int jumlahNilai = 0;

    public Mahasiswa1(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tambahNilai(int nilai) {
        riwayatNilai[jumlahNilai++] = nilai;
    }

    public double hitungRataRata() {
        if (jumlahNilai == 0) {
            return 0; 
        }
        int total = 0;
        for (int i = 0; i < jumlahNilai; i++) {
            total += riwayatNilai[i];
        }
        return (double) total / jumlahNilai;
    }

    public String getRataRataNilai() {
        return String.format("%.2f", hitungRataRata());
    }
    public void printRiwayatNilai() {
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print(riwayatNilai[i] + " ");
        }
        System.out.println();
    }
    public int getJumlahNilai() {
        return jumlahNilai;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas(){
        return kelas;
    }

    public String getNIM(){
        return nim;
    }
}