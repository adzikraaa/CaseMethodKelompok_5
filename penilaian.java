public class penilaian {
    mahasiswa mahasiswa;
    matakuliah mataKuliah;
    double tugas, uts, uas;

    public penilaian (mahasiswa mahasiswa, matakuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void tampil() {
        System.out.printf("NIM: %s, Nama: %s, MK: %s, Tugas: %.1f, UTS: %.1f, UAS: %.1f, NA: %.2f\n",
                mahasiswa.nim, mahasiswa.nama, mataKuliah.namaMK, tugas, uts, uas, hitungNilaiAkhir());
    }
}