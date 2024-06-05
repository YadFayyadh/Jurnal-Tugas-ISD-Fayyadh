import java.util.*;

public class Laundry {
    List<LaundryCucian> daftarCucian;

    public Laundry() {
        this.daftarCucian = new ArrayList<>();
    }

    public void terimaCucian(int idCuci, String namaPelanggan, int tanggalMasuk, String tipeCucian, int beratCucian) {
        LaundryCucian cucianBaru = new LaundryCucian(idCuci, namaPelanggan, tanggalMasuk, tipeCucian, beratCucian);
        daftarCucian.add(cucianBaru);
    }

    public void tampilkanUrutanPengerjaan() {
        Collections.sort(daftarCucian, new Comparator<LaundryCucian>() {
            @Override
            public int compare(LaundryCucian c1, LaundryCucian c2) {
                // Menggunakan waktu total pengerjaan untuk membandingkan cucian

                int waktuPengerjaanC1 = c1.tanggalMasuk + waktuPengerjaan(c1.tipeCucian);
                int waktuPengerjaanC2 = c2.tanggalMasuk + waktuPengerjaan(c2.tipeCucian);
                 if (waktuPengerjaanC1 == waktuPengerjaanC2) {
                     return Integer.compare(c1.beratCucian, c2.beratCucian);
                 }
                return Integer.compare(waktuPengerjaanC1, waktuPengerjaanC2);
            }
        });

        System.out.println("Urutan cucian harus diselesaikan:");
        for (LaundryCucian cucian : daftarCucian) {
            System.out.println("idCuci = " + cucian.idCuci + ", namaPelanggan = " + cucian.namaPelanggan);
        }
    }

    public int waktuPengerjaan(String tipe) {
        // Mengembalikan waktu pengerjaan berdasarkan tipe cucian
        switch (tipe.toLowerCase()) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            default:
                return 0;
        }
    }
}
