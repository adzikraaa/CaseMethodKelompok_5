public class penilaian {
<<<<<<< HEAD
    mahasiswa Mahasiswa;
    matakuliah MataKuliah;
    double tugas, uts, uas;

    public penilaian (mahasiswa mahasiswa, matakuliah mataKuliah, double tugas, double uts, double uas) {
        this.Mahasiswa = mahasiswa;
        this.MataKuliah = mataKuliah;
=======
    mahasiswa mahasiswa;
    matakuliah mataKuliah;
    double tugas, uts, uas;

    public penilaian (mahasiswa mahasiswa, matakuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
>>>>>>> 5657ce8b0ec59ba506e310e3d7d6586a0f648a15
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void tampil() {
<<<<<<< HEAD
        System.out.println("NIM: " + Mahasiswa.nim +
                           ", Nama: " + Mahasiswa.nama +
                           ", MK: " + MataKuliah.namaMK +
=======
        System.out.println("NIM: " + mahasiswa.nim +
                           ", Nama: " + mahasiswa.nama +
                           ", MK: " + mataKuliah.namaMK +
>>>>>>> 5657ce8b0ec59ba506e310e3d7d6586a0f648a15
                           ", Tugas: " + tugas +
                           ", UTS: " + uts +
                           ", UAS: " + uas +
                           ", NA: " + hitungNilaiAkhir());
    }
}