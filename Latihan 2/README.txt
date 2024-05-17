Program ini mengimplementasikan pohon biner dalam bahasa Java dengan metode penyisipan otomatis berdasarkan nilai. Program juga mendemonstrasikan tiga jenis traversal pohon: PreOrder, InOrder, dan PostOrder.

# Struktur Program
Program terdiri dari dua kelas utama: Node dan BinaryTree.

# Kelas Node
Kelas Node mewakili simpul dalam pohon biner. Setiap simpul berisi:

- data: Menyimpan nilai integer dari simpul tersebut.
- left: Referensi ke simpul anak kiri.
- right: Referensi ke simpul anak kanan.

# Kelas BinaryTree
Kelas BinaryTree digunakan untuk membangun dan mengelola pohon biner. Kelas ini mencakup beberapa metode penting:

- NewNode(int data): Menambahkan simpul baru ke pohon. Jika pohon masih kosong, simpul baru menjadi akar. Jika tidak, simpul baru ditempatkan di posisi yang sesuai berdasarkan nilai datanya.
- NewNode(Node root, Node newData): Metode rekursif yang menemukan posisi yang tepat untuk simpul baru dalam pohon.
- inOrder(Node node): Melakukan traversal InOrder (mengunjungi simpul kiri, akar, kemudian simpul kanan).
- preOrder(Node node): Melakukan traversal PreOrder (mengunjungi akar terlebih dahulu, kemudian simpul kiri, dan terakhir simpul kanan).
- postOrder(Node node): Melakukan traversal PostOrder (mengunjungi simpul kiri terlebih dahulu, kemudian simpul kanan, dan terakhir akar).

# Metode Traversal
1. PreOrder: Traversal ini mengunjungi simpul dalam urutan berikut: akar, kiri, kanan.
2. InOrder: Traversal ini mengunjungi simpul dalam urutan berikut: kiri, akar, kanan.
3. PostOrder: Traversal ini mengunjungi simpul dalam urutan berikut: kiri, kanan, akar.

# Contoh Program
Program ini mendemonstrasikan cara menambahkan simpul ke dalam pohon dan melakukan traversal untuk menampilkan urutan simpul.

# Hasil
Program akan menampilkan simpul-simpul dari pohon biner dalam urutan berikut:

- PreOrder: Menampilkan simpul akar terlebih dahulu, diikuti oleh simpul kiri, dan terakhir simpul kanan.
- InOrder: Menampilkan simpul kiri terlebih dahulu, diikuti oleh simpul akar, dan terakhir simpul kanan. Urutan ini menghasilkan simpul dalam urutan yang terurut.
- PostOrder: Menampilkan simpul kiri terlebih dahulu, diikuti oleh simpul kanan, dan terakhir simpul akar.

# Output Program
- Pre Order: 
20 2 16 25 37 

- In Order: 
2 16 20 25 37 

- Post Order: 
16 2 37 25 20 