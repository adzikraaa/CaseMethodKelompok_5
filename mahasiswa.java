public class mahasiswa {
    String nim, nama, prodi;

    public mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: "+ prodi);
    }
}

