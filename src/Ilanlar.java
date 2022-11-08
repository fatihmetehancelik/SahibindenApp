public class Ilanlar {

    private String baslik;
    private String lokasyon;
    private String fiyat;
    private String bilgi;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(String lokasyon) {
        this.lokasyon = lokasyon;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }

    public Ilanlar(String baslik, String lokasyon, String fiyat, String bilgi) {
        this.baslik = baslik;
        this.lokasyon = lokasyon;
        this.fiyat = fiyat;
        this.bilgi = bilgi;
    }

    public Ilanlar() {
    }
}
