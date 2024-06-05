class BinaryTree2<E> {
    private node2 root;

    public BinaryTree2() {
        root = null;  // Inisialisasi pohon tanpa simpul akar.
    }

    public boolean isEmpty() {
        return root == null;  // Periksa apakah pohon kosong.
    }

    public void insert(E data) {
        root = insert(root, data);  // Mulai proses sisipkan data.
    }
    private node2 insert(node2 node, E data) {
        if (node == null)
            node = new node2(data);  // Jika simpul kosong, buat simpul baru.
        else {
            if (node.getLeft() == null)
                node.left = insert(node.left, data);  // Sisipkan di anak kiri jika kosong.
            else
                node.right = insert(node.right, data);  // Jika tidak, sisipkan di anak kanan.
        }
        return node;  // Kembalikan simpul dengan perubahan.
    }

    public int countNodes() {
        return countNodes(root);  // Hitung jumlah simpul mulai dari akar.
    }

    private int countNodes(node2 r) {
        if (r == null)
            return 0;  // Jika simpul kosong, tidak ada yang dihitung.
        else {
            int l = 1;  // Mulai hitungan dengan simpul ini.
            l += countNodes(r.getLeft());  // Tambahkan jumlah dari anak kiri.
            l += countNodes(r.getRight());  // Tambahkan jumlah dari anak kanan.
            return l;  // Kembalikan total hitungan.
        }
    }

    public boolean search(E val) {
        return search(root, val);  // Mulai pencarian dari akar.
    }

    private boolean search(node2 r, E val) {
        if (r.getData() == val)
            return true;  // Jika data sesuai, kembalikan true.
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;  // Lanjutkan pencarian di anak kiri.
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;  // Lanjutkan pencarian di anak kanan.
        return false;  // Jika tidak ditemukan, kembalikan false.
    }

    public void inorder() {
        inorder(root);  // Lakukan traversal inorder dari akar.
    }

    private void inorder(node2 r) {
        if (r != null) {
            inorder(r.getLeft());  // Kunjungi anak kiri terlebih dahulu.
            System.out.print(r.getData() + " ");  // Cetak data simpul.
            inorder(r.getRight());  // Kunjungi anak kanan setelahnya.
        }
    }

    public void preorder() {
        preorder(root);  // Lakukan traversal preorder dari akar.
    }

    private void preorder(node2 r) {
        if (r != null) {
            System.out.print(r.getData() + " ");  // Cetak data simpul.
            preorder(r.getLeft());  // Kunjungi anak kiri.
            preorder(r.getRight());  // Kunjungi anak kanan.
        }
    }

    public void postorder() {
        postorder(root);  // Lakukan traversal postorder dari akar.
    }

    private void postorder(node2 r) {
        if (r != null) {
            postorder(r.getLeft());  // Kunjungi anak kiri.
            postorder(r.getRight());  // Kunjungi anak kanan.
            System.out.print(r.getData() + " ");  // Cetak data simpul.
        }
    }
}
