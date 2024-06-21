import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Mahasiswa> dataMahasiswa = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Input Nilai Mahasiswa");
            System.out.println("4. Tampilkan Nilai Mahasiswa dan Rata-rata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline karakter

            switch (menu) {
                case 1:
                    tambahMahasiswa(dataMahasiswa, scanner);
                    break;
                case 2:
                    hapusMahasiswa(dataMahasiswa, scanner);
                    break;
                case 3:
                    inputNilai(dataMahasiswa, scanner);
                    break;
                case 4:
                    tampilkanNilaiDanRataRata(dataMahasiswa);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak valid");
            }
        }
    }

    private static void tambahMahasiswa(Map<String, Mahasiswa> dataMahasiswa, Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        
        // Membuat objek Mahasiswa dan menyimpannya ke dalam HashMap
        dataMahasiswa.put(nim + kelas + nama, new Mahasiswa(nim, kelas, nama));
        System.out.println("Mahasiswa berhasil ditambahkan");
    }

    private static void hapusMahasiswa(Map<String, Mahasiswa> dataMahasiswa, Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        // Menghapus mahasiswa berdasarkan key (NIM + kelas + nama)
        if (dataMahasiswa.remove(nim + kelas + nama) != null) {
            System.out.println("Mahasiswa berhasil dihapus");
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }
    }

    private static void inputNilai(Map<String, Mahasiswa> dataMahasiswa, Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline karakter
        
        // Mengambil objek Mahasiswa dari HashMap berdasarkan key
        Mahasiswa mahasiswa = dataMahasiswa.get(nim + kelas + nama);
        if (mahasiswa != null) {
            mahasiswa.setNilai(nilai);
            System.out.println("Nilai berhasil disimpan");
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }
    }

    private static void tampilkanNilaiDanRataRata(Map<String, Mahasiswa> dataMahasiswa) {
        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        // Menampilkan nilai masing-masing mahasiswa dan menghitung total nilai
        for (Mahasiswa mahasiswa : dataMahasiswa.values()) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Kelas: " + mahasiswa.getKelas());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Nilai: " + mahasiswa.getNilai());
            System.out.println();
            
            totalNilai += mahasiswa.getNilai();
            jumlahMahasiswa++;
        }

        // Menghitung dan menampilkan rata-rata nilai
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
        } else {
            System.out.println("Belum ada nilai yang dimasukkan");
        }
    }
}

class Mahasiswa {
    private String nim;
    private String kelas;
    private String nama;
    private double nilai;

    public Mahasiswa(String nim, String kelas, String nama) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
