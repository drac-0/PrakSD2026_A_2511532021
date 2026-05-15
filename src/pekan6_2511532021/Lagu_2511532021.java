package pekan6_2511532021;

public class Lagu_2511532021 {
	
    private String judul_2021;
    private String penyanyi_2021;
    private Lagu_2511532021 next_2021;
    private Lagu_2511532021 prev_2021;

    // konstruktor
    public Lagu_2511532021(String judul_2021, String penyanyi_2021) {
        this.judul_2021 = judul_2021;
        this.penyanyi_2021 = penyanyi_2021;
        this.next_2021 = null;
        this.prev_2021 = null;
    }

    // getter dan setter
    public String getJudul_2021() { return judul_2021; }
    public void setJudul_2021(String judul_2021) { this.judul_2021 = judul_2021; }
    
    public String getPenyanyi_2021() { return penyanyi_2021; }
    public void setPenyanyi_2021(String penyanyi_2021) { this.penyanyi_2021 = penyanyi_2021; }
    
    public Lagu_2511532021 getNext_2021() { return next_2021; }
    public void setNext_2021(Lagu_2511532021 next_2021) { this.next_2021 = next_2021; }
    
    public Lagu_2511532021 getPrev_2021() { return prev_2021; }
    public void setPrev_2021(Lagu_2511532021 prev_2021) { this.prev_2021 = prev_2021; }
}