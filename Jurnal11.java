import java.util.Scanner;

public class Jurnal11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree2 bt = new BinaryTree2();  // Membuat instance dari BinaryTree2.
        System.out.println("Binary Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");  // Pilihan untuk menyisipkan elemen.
            System.out.println("2. search");   // Pilihan untuk mencari elemen.
            System.out.println("3. count nodes");  // Pilihan untuk menghitung jumlah node.
            System.out.println("4. check empty");  // Pilihan untuk memeriksa apakah pohon kosong.
            int choice = scan.nextInt();  // Membaca pilihan pengguna.
            scan.nextLine();  // Bersihkan buffer input.
            switch (choice) {
                case 1:  // Pilihan untuk menyisipkan elemen.
                    System.out.println("Enter integer element to insert");
                    bt.insert(scan.nextLine());
                    break;
                case 2:  // Pilihan untuk mencari elemen.
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + bt.search(scan.nextLine()));
                    break;
                case 3:  // Pilihan untuk menghitung jumlah node.
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:  // Pilihan untuk memeriksa kekosongan pohon.
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // Menampilkan isi pohon dalam tiga urutan berbeda.
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);  // Membaca karakter untuk memutuskan kelanjutan.
        } while (ch == 'Y' || ch == 'y');  // Lanjutkan jika pengguna memasukkan 'y' atau 'Y'.
    }
}
