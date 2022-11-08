import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.Objects;

public class Vericek {
    Ilanlar ilan = new Ilanlar();

    public void ilancek(String ilanno) {

        try {
            Document doc = Jsoup.connect("https://sahibinden.com/" + ilanno).get();
            Element baslikElementi = doc.select("div.classifiedDetailTitle >h1").first();
            assert baslikElementi != null;
            String baslik = baslikElementi.text();

            String lokasyon = Objects.requireNonNull(doc.select("div.classifiedInfo >h2").first()).text();


            String ucret = Objects.requireNonNull(doc.select("div.classifiedInfo >h3").first()).text();


            String bilgi = Objects.requireNonNull(doc.select("div.classifiedDescription >p").first()).text();


            ilan.setBaslik(baslik);
            ilan.setBilgi(bilgi);
            ilan.setFiyat(ucret);
            ilan.setLokasyon(lokasyon);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
