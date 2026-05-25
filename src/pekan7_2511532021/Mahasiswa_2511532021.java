package pekan7_2511532021;

public class Mahasiswa_2511532021 {
    private String nama_2021;
    private String nim_2021;
    private String prodi_2021;

    public Mahasiswa_2511532021(String nama_2021, String nim_2021, String prodi_2021) {
        this.nama_2021 = nama_2021;
        this.nim_2021 = nim_2021;
        this.prodi_2021 = prodi_2021;
    }

    public String getNama_2021() { return nama_2021; }
    public void setNama_2021(String nama_2021) { this.nama_2021 = nama_2021; }

    public String getNim_2021() { return nim_2021; }
    public void setNim_2021(String nim_2021) { this.nim_2021 = nim_2021; }

    public String getProdi_2021() { return prodi_2021; }
    public void setProdi_2021(String prodi_2021) { this.prodi_2021 = prodi_2021; }

    @Override
    public String toString() {
        return nama_2021 + " (" + nim_2021 + " - " + prodi_2021 + ")";
    }
}