import java.util.Scanner;
import java.util.HashMap;

public class Jurnal8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        HashMap<String, Mahasiswa1> mahasiswa = new HashMap<>();
        while (true) {
            System.out.println("1. Menambah Mahasiswa \n" +
                    "2. Menghapus Mahasiswa \n" + "3. Menginput Nilai Mahasiswa");
            System.out.println("4. Menampilkan nilai Mahasiswa ");
            System.out.println("5. Keluar \n");
            int masukan = x.nextInt();
            switch (masukan) {
                case 1:
                    System.out.println("Masukan Data Mahasiswa");
                    System.out.print("Masukan NIM Mahasiswa = ");
                    String nim = x.next();
                    if(mahasiswa.containsKey(nim)){
                        System.out.println("NIM sudah terdaftar");
                    }else{
                    System.out.print("Masukan Nama Mahasiswa = ");
                    String nama = x.next();
                    System.out.print("Masukan Kelas Mahasiswa = ");
                    String kelas = x.next();
                    Mahasiswa1 mhs = new Mahasiswa1(nim, nama, kelas);
                    mahasiswa.put(nim, mhs);
                    }
                    break;
                case 2:
                    System.out.print("Masukan NIM Mahasiswa yang akan dihapus = ");
                    String NIM = x.next();
                    if (mahasiswa.containsKey(NIM)) {
                        Mahasiswa1 mhsPrint = mahasiswa.get(NIM);
                        mahasiswa.remove(NIM);
                        System.out.println("NIM : "+mhsPrint.getNIM()); 
                        System.out.println("Nama : "+mhsPrint.getNama()); 
                        System.out.println("Kelas : "+mhsPrint.getKelas());
                        System.out.println("Mahasiswa dengan NIM " + NIM + " sudah dihapus");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + NIM + " tidak ditemukan");
                    }
                    break;
                case 3:
                    System.out.println("Masukan NIM Mahasiswa");
                    String nimInput = x.next();
                    if (mahasiswa.containsKey(nimInput)) {
                        Mahasiswa1 mhsPrint = mahasiswa.get(nimInput);
                        System.out.println("NIM : "+mhsPrint.getNIM()); 
                        System.out.println("Nama : "+mhsPrint.getNama()); 
                        System.out.println("Kelas : "+mhsPrint.getKelas());
                        System.out.print("Masukan berapa banyak nilai yang ingin dimasukan = ");
                        int jmlh = x.nextInt();
                        for (int a = 0; a < jmlh; a++) {
                            System.out.print("Masukan nilai Mahasiswa = ");
                            int nilaiInput = x.nextInt();
                            Mahasiswa1 mhsInput = mahasiswa.get(nimInput);
                            mhsInput.tambahNilai(nilaiInput);
                        }
                        System.out.println("Nilai mahasiswa dengan NIM " + nimInput + " telah ditambahkan");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.print("Masukan NIM mahasiswa yang ingin dilihat nilainya = ");
                    nimInput = x.next();
                    if (mahasiswa.containsKey(nimInput)) {
                        Mahasiswa1 mhsPrint = mahasiswa.get(nimInput);
                        if (mhsPrint.getJumlahNilai() > 0) {
                           System.out.println("Nama = "+mhsPrint.getNama()); 
                           System.out.println("Kelas = "+mhsPrint.getKelas()); 
                            System.out.println("Riwayat nilai = ");
                            mhsPrint.printRiwayatNilai();
                            System.out.println("Rata-rata nilai mahasiswa = "
                                    + mhsPrint.getRataRataNilai());
                        } else {
                            System.out.println("Nilainya belum dimasukkan untuk mahasiswa dengan NIM " + nimInput);
                        }
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak ditemukan");
                    }
                    break;
                case 5 :
                    x.close();
                    System.out.println("Keluar");
                    System.exit(0);
                    break;
            }
        }
    }
}
