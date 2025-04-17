public class matakuliah {
    String kodeMK;
    String namaMK;
    int sks; 


public matakuliah (String kodeMK, String namaMk, int sks){
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
    }
    public void tampil() {
        System.out.println("kodeMK: " + kodeMK + ", NamaMK: " + namaMK + "Jumlah SKS"+ sks);
    }
}
