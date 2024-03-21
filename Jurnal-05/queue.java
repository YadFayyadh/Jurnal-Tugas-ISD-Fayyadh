import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> antrian = new LinkedList<>();
        while (true) {
            System.out.println("1. Menambah tugas");
            System.out.println("2. Menampilan tugas yang harus diselesaikan");
            System.out.println("3. Menghapus tugas");
            System.out.println("4. Menampilkan Seluruh Tugas");
            System.out.println("5. Exit");

            String tugas = input.nextLine();

            switch (tugas) {
                case "1":
                    System.out.println("Tambahkan tugas");
                    String task = input.nextLine();
                    antrian.add(task);
                    break;
                case "2":
                    if (!antrian.isEmpty()) {
                        System.out.println("Tugas yang harus diselesaikan " + antrian.peek());
                    } else {
                        System.out.println("Tidak ada tugas yg harus diselesaikan");
                    }
                    break;
                case "3":
                    if (!antrian.isEmpty()) {
                        System.out.println("Tugas yang sudah diselesaikan " + antrian.remove());
                    } else {
                        System.out.println("Tidak ada tugas yang harus diselesaikan");
                    }
                    break;
                case "4":
                    for (String tampil : antrian) {
                        System.out.println(tampil);
                    }
                    break;
                case "5":
                    input.close();
                    System.out.println("Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input angka lain");
                    break;
            }

        }

    }

}