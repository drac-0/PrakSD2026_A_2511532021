public class Mobil {
    String nama,merk;
    int tahun,cc,harga;
    public Mobil(String nama,int tahun, int cc, int harga, String merk){
        this.nama=nama;
        this.tahun=tahun;
        this.cc=cc;
        this.harga=harga;
        this.merk=merk;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public int getCc() {
        return cc;
    }

    public int getHarga() {
        return harga;
    }

    public int getTahun() {
        return tahun;
    }

    public String getMerk() {
        return merk;
    }

    //Setter
    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    private static int length = 0;
    private static Mobil[] garasi = new Mobil[0];
    public static void tambahMobil(Mobil mobil){
        length++;
        Mobil[] tempGarasi = new Mobil[length];
        tempGarasi[length-1] = mobil;
        for (int i = 0;i<length - 1;i++){
            tempGarasi[i] = garasi[i];
        }
        garasi = tempGarasi;
    }

    public static void showAll(){
        for(Mobil m : garasi){
            System.out.println(m.getNama());
        }
    }

    // [1] [2] [3] [4] [5] [6]
    public static void hapusMobil(int index){
        Mobil[] temp = new Mobil[length-1];
        for (int i = index;i<length - 1;i++){
            garasi[index] = garasi[index+1];
        }
        length--;
        for (int i = 0;i<length;i++){
            temp[i]=garasi[i];
        }
        garasi=temp;
    }
}