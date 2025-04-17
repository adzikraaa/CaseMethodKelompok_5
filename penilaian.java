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
        System.out.println("NIM: " + mahasiswa.nim +
                           ", Nama: " + mahasiswa.nama +
                           ", MK: " + mataKuliah.namaMK +
                           ", Tugas: " + tugas +
                           ", UTS: " + uts +
                           ", UAS: " + uas +
                           ", NA: " + hitungNilaiAkhir());
    }
}