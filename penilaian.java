public class penilaian {
    mahasiswa Mahasiswa;
    matakuliah MataKuliah;
    double tugas, uts, uas;

    public penilaian (mahasiswa mahasiswa, matakuliah mataKuliah, double tugas, double uts, double uas) {
        this.Mahasiswa = mahasiswa;
        this.MataKuliah = mataKuliah;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void tampilnilai() {
        System.out.println("NIM: " + Mahasiswa.nim +
                           ", Nama: " + Mahasiswa.nama +
                           ", MK: " + MataKuliah.namaMK +
                           ", Tugas: " + tugas +
                           ", UTS: " + uts +
                           ", UAS: " + uas +
                           ", NA: " + hitungNilaiAkhir());
    }
}