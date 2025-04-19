import java.util.Scanner;

public class main {
    static penilaian[] daftarNilai = new penilaian[10];
    static mahasiswa[] daftarMahasiswa = new mahasiswa[3];
    static matakuliah[] daftarMatakuliah = new matakuliah[3];

    public static void main(String[] args) {
        isiData();
        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n === MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (mahasiswa m : daftarMahasiswa) {
                        m.tampil();
                    }
                    break;

                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (matakuliah mk : daftarMatakuliah) {
                        mk.tampilMk();
                    }
                    break;

                case 3:
                    System.out.println("Data Penilaian:");
                    for (penilaian p : daftarNilai) {
                        if (p != null)
                            p.tampilnilai();
                    }
                    break;

                case 4:
                    bubbleSortNilaiAkhir();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = sc.next();
                    cariMahasiswa(cariNIM);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
                    break;
            }
        } while (pilihan != 0);
    }

    static void isiData() {
        mahasiswa m1 = new mahasiswa("22001", "Ali Rahman", "SIB");
        mahasiswa m2 = new mahasiswa("22002", "Budi Santoso", "TI");
        mahasiswa m3 = new mahasiswa("22003", "Citra Dewi", "Mesin");

        daftarMahasiswa[0] = m1;
        daftarMahasiswa[1] = m2;
        daftarMahasiswa[2] = m3;

        matakuliah mk1 = new matakuliah("MK001", "Struktur Data", 3);
        matakuliah mk2 = new matakuliah("MK002", "Basis Data", 3);
        matakuliah mk3 = new matakuliah("MK003", "Desain Web", 2);

        daftarMatakuliah[0] = mk1;
        daftarMatakuliah[1] = mk2;
        daftarMatakuliah[2] = mk3;

        daftarNilai[0] = new penilaian(m1, mk1, 80, 85, 90);
        daftarNilai[1] = new penilaian(m1, mk2, 60, 75, 70);
        daftarNilai[2] = new penilaian(m2, mk1, 75, 70, 80);
        daftarNilai[3] = new penilaian(m3, mk2, 85, 90, 95);
        daftarNilai[4] = new penilaian(m3, mk3, 80, 90, 65);
    }

    static void bubbleSortNilaiAkhir() {
        for (int i = 0; i < daftarNilai.length - 1; i++) {
            for (int j = 0; j < daftarNilai.length - i - 1; j++) {
                if (daftarNilai[j] == null || daftarNilai[j + 1] == null)
                    continue;
                if (daftarNilai[j].hitungNilaiAkhir() < daftarNilai[j + 1].hitungNilaiAkhir()) {
                    penilaian temp = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = temp;
                }
            }
        }
        for (penilaian p : daftarNilai) {
            if (p != null)
                p.tampilnilai();
        }
    }

    static void cariMahasiswa(String nim) {
        boolean ditemukan = false;
        for (penilaian n : daftarNilai) {
            if (n != null && n.Mahasiswa.nim.equals(nim)) {
                n.tampilnilai();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
