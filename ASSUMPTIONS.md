Untuk menerima input berupa array dengan panjang tidak terbatas, maka saya menggunakan BufferedReader yang akan menerima sebuah String yang saya langsung parse ke array of String dengan split(" ").
Untuk merubah dari array of String ke array of int saya menggunakan Stream.
Dalam pencarian nilai terbesar kedua, saya mengurutkan nilai pada array secara ascending. Setelah itu dari belakang saya mencari dan mengembalikan angka yang lebih kecil dari angka paling belakang (angka paling besar). Jika ternyata semua angka sama (tidak ada angka kedua yang paling kecil) maka saya mengembalikan nilai 0.
