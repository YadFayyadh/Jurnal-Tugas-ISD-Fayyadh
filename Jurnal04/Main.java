import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        LinkedList<Data> list = new LinkedList<>();
        System.out.println("1. Input tugas");
        System.out.println("2. Hapus tugas");
        System.out.println("3. Liat tugas");
        System.out.println("4. Exit");

        int pilih = x.nextInt();

        while (pilih != 4) {
            switch (pilih) {
                case 1:
                    System.out.println("Input Matkul");
                    String matkul = x.next();
                    System.out.println("Nama Tugas");
                    String tugas = x.next();
                    System.out.println("deadline");
                    String detlen = x.next();
                    list.addFirst(new Data(matkul, tugas, detlen));
                    break;

                case 2:
                    System.out.println("1.hapus depan\n" + "2.hapus tengah\n" + "3.hapus belakang\n");
                    int choice = x.nextInt();
                    if (choice == 1) {
                        list.removeFirst();
                    } else if (choice == 2) {
                        ListIterator<Data> iterator = list.listIterator();
                        System.out.println("pilih matkul atau tugas yang ingin di hapus");
                        String diHapus = x.next();
                        while (iterator.hasNext()) {
                            Data curennode = iterator.next();
                            if (curennode.getNamaTugas().equalsIgnoreCase(diHapus)
                                    || curennode.getMataKuliah().equalsIgnoreCase(diHapus)
                                    || curennode.getDeadline().equalsIgnoreCase(diHapus)) {
                                iterator.remove();
                                break;
                            }
                        }
                    } else {
                        list.removeLast();
                    }
                    break;

                case 3:
                    for (Data data : list) {
                        System.out.println(data.getMataKuliah() + " " + data.getNamaTugas() + " " + data.getDeadline());
                    }
                    break;
            }
            System.out.println("1. Infut tugas");
            System.out.println("2. hapus tugas");
            System.out.println("3. Liat tugas");
            System.out.println("4. Exit");

            pilih = x.nextInt();
        }
    }
}
