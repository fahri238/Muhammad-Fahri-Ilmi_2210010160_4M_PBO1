# 🌱 FloraCare - Smart Plant Collection Manager

## Ujian Akhir Semester (UAS)

**Mata Kuliah:** Pemrograman Berorientasi Objek (Java)

---

## 👨‍🎓 Identitas Mahasiswa

| Keterangan | Data                |
| ---------- | ------------------- |
| **Nama**   | Muhammad Fahri Ilmi |
| **NPM**    | 2210010160          |

---

# 📖 Deskripsi Project

**FloraCare** merupakan aplikasi berbasis **Java Console** yang dibuat sebagai tugas **Ujian Akhir Semester (UAS)** mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

Aplikasi ini dirancang untuk membantu pengguna dalam mengelola koleksi tanaman hias melalui antarmuka berbasis teks (Console). Pengguna dapat menambahkan berbagai jenis tanaman, melihat seluruh data tanaman, mencari tanaman berdasarkan ID, memperbarui pertumbuhan tanaman, menyiram tanaman, menghapus data tanaman, serta melihat statistik koleksi tanaman.

Project ini dikembangkan dengan menerapkan konsep-konsep dasar **Object-Oriented Programming (OOP)** sesuai dengan materi yang dipelajari selama perkuliahan.

---

# ✨ Fitur Program

* Menambahkan data tanaman
* Menampilkan seluruh data tanaman
* Mencari tanaman berdasarkan ID
* Menyiram tanaman
* Memperbarui tinggi tanaman
* Menghapus data tanaman
* Menampilkan statistik koleksi tanaman
* Menghitung kebutuhan air berdasarkan jenis tanaman (Polymorphism)
* Validasi input menggunakan Exception Handling

---

# 🌿 Jenis Tanaman

Program mendukung tiga jenis tanaman dengan karakteristik yang berbeda.

### 🌹 Flower Plant

* Flower Color
* Fragrance Level
* Perhitungan kebutuhan air khusus

### 🌵 Cactus Plant

* Thorn Count
* Indoor / Outdoor
* Perhitungan kebutuhan air khusus

### 🍃 Tropical Plant

* Humidity Level
* Leaf Width
* Perhitungan kebutuhan air khusus

---

# 🏗️ Struktur Project

```text
FloraCare
│
├── Main.java
├── Plant.java
├── FlowerPlant.java
├── CactusPlant.java
├── TropicalPlant.java
├── PlantManager.java
├── Menu.java
├── InputHelper.java
└── README.md
```

---

# 📚 Konsep Pemrograman Berorientasi Objek yang Digunakan

| Materi         | Implementasi                                                                    |
| -------------- | ------------------------------------------------------------------------------- |
| Class          | Plant, FlowerPlant, CactusPlant, TropicalPlant, PlantManager, Menu, InputHelper |
| Object         | Pembuatan objek tanaman pada program                                            |
| Attribute      | Seluruh data tanaman menggunakan atribut private                                |
| Constructor    | Digunakan pada setiap class                                                     |
| Mutator        | Setter untuk mengubah data objek                                                |
| Accessor       | Getter untuk mengambil data objek                                               |
| Encapsulation  | Seluruh atribut menggunakan access modifier `private`                           |
| Inheritance    | FlowerPlant, CactusPlant, dan TropicalPlant mewarisi class Plant                |
| Polymorphism   | Override `displayInfo()` dan `calculateWaterNeed()` pada setiap subclass        |
| Seleksi        | Menggunakan `if`, `else`, dan `switch-case`                                     |
| Perulangan     | Menggunakan `for` dan `while`                                                   |
| IO Sederhana   | Menggunakan `Scanner` melalui class `InputHelper`                               |
| Array          | Penyimpanan data menggunakan array `Plant[]`                                    |
| Error Handling | Menggunakan `try-catch` untuk menangani kesalahan input                         |

---

# ▶️ Cara Menjalankan Program

1. Buka project menggunakan NetBeans atau IDE Java lainnya.
2. Jalankan file **Main.java**.
3. Pilih menu yang tersedia pada aplikasi.
4. Masukkan data sesuai petunjuk yang ditampilkan.
5. Program akan mengelola data tanaman sesuai menu yang dipilih.

---

# 🎯 Tujuan Project

Project ini dibuat sebagai implementasi konsep-konsep **Pemrograman Berorientasi Objek (Object-Oriented Programming/OOP)** dalam bahasa pemrograman Java. Selain memenuhi seluruh materi yang dipelajari selama perkuliahan, project ini juga bertujuan untuk melatih kemampuan dalam merancang struktur program yang modular, mudah dipahami, dan mudah dikembangkan.

---

# 📌 Kesimpulan

FloraCare merupakan aplikasi sederhana berbasis Java Console yang menerapkan berbagai konsep utama Pemrograman Berorientasi Objek, seperti encapsulation, inheritance, polymorphism, constructor, accessor, mutator, array, perulangan, seleksi, serta penanganan kesalahan (error handling). Dengan studi kasus pengelolaan koleksi tanaman, aplikasi ini menunjukkan bagaimana konsep OOP dapat digunakan untuk membangun program yang terstruktur, efisien, dan mudah dipelihara.

---

# 📊 Penilaian Mandiri UAS

Berikut merupakan penilaian mandiri berdasarkan kriteria yang diberikan pada tugas Ujian Akhir Semester.

|  No | Materi         | Nilai Maksimal |  Nilai  | Implementasi                                                                                                                                  |
| :-: | -------------- | :------------: | :-----: | --------------------------------------------------------------------------------------------------------------------------------------------- |
|  1  | Class          |        5       |  **5**  | Menggunakan beberapa class seperti `Plant`, `FlowerPlant`, `CactusPlant`, `TropicalPlant`, `PlantManager`, `Menu`, `InputHelper`, dan `Main`. |
|  2  | Object         |        5       |  **5**  | Pembuatan objek tanaman dan objek pendukung seperti `PlantManager` serta `InputHelper`.                                                       |
|  3  | Attribute      |        5       |  **5**  | Seluruh class memiliki atribut sesuai kebutuhan program.                                                                                      |
|  4  | Constructor    |        5       |  **5**  | Setiap class menggunakan constructor untuk inisialisasi objek.                                                                                |
|  5  | Mutator        |        5       |  **5**  | Menggunakan method setter untuk mengubah data objek dengan validasi.                                                                          |
|  6  | Accessor       |        5       |  **5**  | Menggunakan method getter untuk mengambil data objek.                                                                                         |
|  7  | Encapsulation  |        5       |  **5**  | Semua atribut dibuat `private` dan diakses melalui getter dan setter.                                                                         |
|  8  | Inheritance    |        5       |  **5**  | `FlowerPlant`, `CactusPlant`, dan `TropicalPlant` mewarisi class `Plant`.                                                                     |
|  9  | Polymorphism   |       10       |  **10** | Override method `displayInfo()` dan `calculateWaterNeed()`, serta penggunaan array bertipe `Plant[]`.                                         |
|  10 | Seleksi        |        5       |  **5**  | Menggunakan `if-else` dan `switch-case` pada validasi dan menu program.                                                                       |
|  11 | Perulangan     |        5       |  **5**  | Menggunakan `for` dan `while` pada pengelolaan data dan menu utama.                                                                           |
|  12 | IO Sederhana   |       10       |  **10** | Input pengguna menggunakan `Scanner` melalui class `InputHelper` dan output menggunakan `System.out.println()`.                               |
|  13 | Array          |       15       |  **15** | Data tanaman disimpan dalam array bertipe `Plant[]` dan dikelola melalui `PlantManager`.                                                      |
|  14 | Error Handling |       15       |  **15** | Menggunakan `try-catch` (`InputMismatchException`) untuk menangani kesalahan input pengguna.                                                  |
|     | **TOTAL**      |     **100**    | **100** | Seluruh kriteria pada tugas UAS telah diimplementasikan dalam project FloraCare.                                                              |

> **Catatan:** Penilaian di atas merupakan penilaian mandiri berdasarkan implementasi fitur dan konsep Pemrograman Berorientasi Objek pada project **FloraCare – Smart Plant Collection Manager**. Penilaian akhir tetap mengikuti hasil evaluasi dosen terhadap implementasi program yang dikumpulkan.

---

**Disusun oleh:**

**Muhammad Fahri Ilmi**
**NPM: 2210010160**
