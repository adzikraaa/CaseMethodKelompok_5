public class matakuliah {
    String kodeMK;
    String namaMK;
    int sks; 


public matakuliah (String kodeMK, String namaMK, int sks){
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
    }
    
    public void tampilmk() {
        System.out.println("kodeMK: " + kodeMK + " | NamaMK: " + namaMK + " | Jumlah SKS"+ sks);
    }
}