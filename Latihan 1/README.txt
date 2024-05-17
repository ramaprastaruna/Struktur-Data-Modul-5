Program ini ditulis dalam bahasa Java dan bertujuan untuk mengimplementasikan pohon biner sederhana serta mendemonstrasikan tiga jenis traversal pohon: PreOrder, InOrder, dan PostOrder. Struktur pohon dibuat secara manual dalam program, kemudian metode traversal diterapkan pada pohon tersebut untuk menampilkan urutan simpul yang berbeda.

# Struktur Program
Program ini terdiri dari dua kelas utama: Node dan BinaryTree.

# Kelas Node
Kelas Node mewakili simpul (node) dalam pohon biner. Setiap simpul berisi tiga atribut:

- data: Menyimpan nilai integer dari simpul tersebut.
- left: Referensi ke simpul anak kiri.
- right: Referensi ke simpul anak kanan.

# Kelas BinaryTree
Kelas BinaryTree digunakan untuk membangun dan mengelola pohon biner. Kelas ini mencakup beberapa metode penting:

- addRoot(int data): Menambahkan simpul akar ke pohon.
- inOrder(Node node): Melakukan traversal InOrder (mengunjungi simpul kiri, akar, kemudian simpul kanan).
- preOrder(Node node): Melakukan traversal PreOrder (mengunjungi akar terlebih dahulu, kemudian simpul kiri, dan terakhir simpul kanan).
- postOrder(Node node): Melakukan traversal PostOrder (mengunjungi simpul kiri terlebih dahulu, kemudian simpul kanan, dan terakhir akar).

# Metode Traversal
1. PreOrder: Traversal ini mengunjungi simpul dalam urutan berikut: akar, kiri, kanan. Dengan kata lain, simpul akar dikunjungi terlebih dahulu, kemudian traversal dilanjutkan ke subpohon kiri, dan akhirnya ke subpohon kanan.

2. InOrder: Traversal ini mengunjungi simpul dalam urutan berikut: kiri, akar, kanan. Ini berarti traversal dimulai dari simpul kiri terjauh, kemudian simpul akar, dan akhirnya simpul kanan. Traversal InOrder biasanya menghasilkan urutan yang terurut untuk pohon biner pencarian.

3. PostOrder: Traversal ini mengunjungi simpul dalam urutan berikut: kiri, kanan, akar. Traversal ini mengunjungi semua simpul anak terlebih dahulu (kiri dan kanan), kemudian simpul akar. Ini sering digunakan untuk operasi seperti menghapus pohon karena memastikan simpul anak diproses sebelum simpul induknya.

# Menjalankan Program
Untuk menjalankan program ini, Anda perlu mengompilasi dan menjalankan file Java yang berisi definisi kelas Node dan BinaryTree. Setelah program dijalankan, simpul-simpul dari pohon biner akan ditampilkan dalam urutan PreOrder, InOrder, dan PostOrder.

# Output Program
Contoh keluaran dari program ini akan menampilkan urutan simpul sebagai berikut:

- PreOrder: Menampilkan simpul akar terlebih dahulu, diikuti oleh simpul kiri, dan terakhir simpul kanan.
- InOrder: Menampilkan simpul kiri terlebih dahulu, diikuti oleh simpul akar, dan terakhir simpul kanan. Urutan ini menghasilkan simpul dalam urutan yang terurut.
- PostOrder: Menampilkan simpul kiri terlebih dahulu, diikuti oleh simpul kanan, dan terakhir simpul akar.

# Output Program
- Pre Order: 
20 2 37 12 25 16 

- In Order: 
37 2 12 20 25 16 

- Post Order: 
37 12 2 16 25 20 
