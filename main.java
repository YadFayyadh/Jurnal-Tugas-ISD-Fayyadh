import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkeList<buku> linkList = new SinglyLinkeList<>();
        boolean lanjut = true;
        while(lanjut){
        System.out.println("1. Tambah data dari depan ");
        System.out.println("2. Tambah data dari belakang ");
        System.out.println("3. Hapus data dari belakang ");
        System.out.println("4. Cetak");
        System.out.println("5. Keluar");

        int pilih = sc.nextInt();
        String judulBuku = sc.nextLine();

        switch (pilih) {
            case 1:
                
                System.out.print("Masukkan Judul Buku ");
                judulBuku = sc.nextLine();
                System.out.print("Masukkan Penulis Buku ");
                String penulisBuku = sc.nextLine();
                System.out.print("Masukkan Tahun Terbit Buku ");
                String terbitBuku = sc.nextLine();
                linkList.insertAtFront(new buku(judulBuku, penulisBuku, terbitBuku));
                break;

            case 2:
                System.out.print("Masukkan Judul Buku ");
                String judulBukuBLKG = sc.nextLine();
                System.out.print("Masukkan Penulis Buku ");
                String penulisBukuBlkg = sc.nextLine();
                System.out.print("Masukkan Tahun Terbit Buku ");
                String terbitBukuBlkg = sc.nextLine();
                linkList.insertAtBack(new buku(judulBukuBLKG, penulisBukuBlkg, terbitBukuBlkg));
                break;

            case 3:
                linkList.removeFromBack();
                break;

            case 4 :
                linkList.print();
                break;

            case 5 :
                lanjut = false;
                break;
                
            default:
                System.out.println("yang bener klo milih angka !!!");
                break;
        }

        }
        

    }
}