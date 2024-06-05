class node2<E> {
    node2 left, right;
    E data;

    public node2() {
        left = null;  // Inisialisasi simpul anak kiri dengan null.
        right = null;  // Inisialisasi simpul anak kanan dengan null.
        data = null;  // Inisialisasi data dengan null.
    }

    public node2(E item) {
        left = null;  // Inisialisasi simpul anak kiri dengan null.
        right = null;  // Inisialisasi simpul anak kanan dengan null.
        data = item;  // Tetapkan data simpul dengan item yang diberikan.
    }

    public void setLeft(node2 n) {
        left = n;  // Tetapkan simpul anak kiri dengan simpul baru n.
    }

    public void setRight(node2 n) {
        right = n;  // Tetapkan simpul anak kanan dengan simpul baru n.
    }

    public node2 getLeft() {
        return left;  // Dapatkan simpul anak kiri dari simpul ini.
    }

    public node2 getRight() {
        return right;  // Dapatkan simpul anak kanan dari simpul ini.
    }

    public void setData(E d) {
        data = d;  // Tetapkan data dari simpul ini dengan d.
    }

    public E getData() {
        return data;  // Dapatkan data yang disimpan dalam simpul ini.
    }
}
