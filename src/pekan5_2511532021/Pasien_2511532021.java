package pekan5_2511532021;

public class Pasien_2511532021 {

    private String nama_2021;
    private String keluhan_2021;
    private int noAntrian_2021;
    private Pasien_2511532021 next_2021;

    public Pasien_2511532021(String nama_2021, String keluhan_2021, int noAntrian_2021) {
        this.nama_2021 = nama_2021;
        this.keluhan_2021 = keluhan_2021;
        this.noAntrian_2021 = noAntrian_2021;
        this.next_2021 = null;
    }

    public String getNama_2021() { return nama_2021; }
    public void setNama_2021(String nama_2021) { this.nama_2021 = nama_2021; }

    public String getKeluhan_2021() { return keluhan_2021; }
    public void setKeluhan_2021(String keluhan_2021) { this.keluhan_2021 = keluhan_2021; }

    public int getNoAntrian_2021() { return noAntrian_2021; }
    public void setNoAntrian_2021(int noAntrian_2021) { this.noAntrian_2021 = noAntrian_2021; }

    public Pasien_2511532021 getNext_2021() { return next_2021; }
    public void setNext_2021(Pasien_2511532021 next_2021) { this.next_2021 = next_2021; }
}