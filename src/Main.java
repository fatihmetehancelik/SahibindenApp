public class Main {
    public static void main(String[] args) {


        String info = "1060714005";

        Vericek wc = new Vericek();

        wc.ilancek(info);

        System.out.println("ilanın başlığı : " + wc.ilan.getBaslik());
        System.out.println("ilanın lokasyonu : " + wc.ilan.getLokasyon());
        System.out.println("ilanın fiyatı : " + wc.ilan.getFiyat());
        System.out.println("ilanın bilgisi : " + wc.ilan.getBilgi());



    }


}
