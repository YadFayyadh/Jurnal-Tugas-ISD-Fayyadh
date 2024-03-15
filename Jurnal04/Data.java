public class Data {
    private String matkul;
    private String tugas;
    private String detlen;

    public Data(String matkul, String tugas, String detlen) {
        this.matkul = matkul;
        this.tugas = tugas;
        this.detlen = detlen;
    }

    @Override
    public String toString() {
        return "Data [matkul=" + matkul + ", tugas=" + tugas + ", detlen=" + detlen + "]";
    }

    public String getMataKuliah() {
        return matkul;
    }

    public String getNamaTugas() {
        return tugas;
    }

    public String getDeadline() {
        return detlen;
    }

    
     
}