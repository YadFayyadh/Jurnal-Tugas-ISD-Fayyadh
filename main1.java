package Jurnal02;
import java.util.ArrayList;
public class main1 {
    public static void main(String[] args) {
        GenArray<ATK> daftarATK = new GenArray<>(5);
        GenArray<BAG> daftarBAG = new GenArray<>(5);

        daftarATK.addData(new ATK("A001", "Pulpen" , "Faber Castle Pulpen", 100));
        daftarATK.addData(new ATK("A002", "Spidol" , "Faber Castle Spidol", 100));
        daftarATK.addData(new ATK("A003", "Pensil" , "Joyko Pencil ", 100));
        daftarATK.addData(new ATK("B004", "Buku Tulis" , "Buku Tulis Campus", 100));
        daftarATK.addData(new ATK("A005", "Pulpen" , "Standard Pulpen", 100));

        daftarBAG.addData(new BAG("C001", "Tas", "Tas Polo Air", 100));
        daftarBAG.addData(new BAG("C002", "Tas", "Tas Louis Viton", 100));
        daftarBAG.addData(new BAG("C003", "Kotak Pensil", "Kotak Pensil Joyko ", 100));
        daftarBAG.addData(new BAG("C004", "Straples", "Straples Joyko", 100));
        daftarBAG.addData(new BAG("C005", "Kotak Pensil", "Kotak Pensil Faber Castle", 100));

        daftarATK.display();
        daftarBAG.display();

        System.out.println("Setelah dihapus beberapa datanya \n");

        daftarATK.removeData(0);
        daftarATK.display();

        daftarBAG.removeData(0);
        daftarBAG.display();

        

    }
}
