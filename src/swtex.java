public class swtex {
    public static void main(String[] args) {
        int gun = 7;
        String gunAdi;
        switch (gun){
            case 1:
                gunAdi="Pazartesi";
                break;
            case 2:
                gunAdi="Salı";
                break;
            case 3:
                gunAdi="Çarşamba";
                break;
            case 4:
                gunAdi="Perşembe";
                break;
            case 5:
                gunAdi="Cuma";
                break;
            case 6:
                gunAdi="Cumartesi";
                break;
            case 7:
                gunAdi="Pazar";
                break;
            default:
                gunAdi="Geçersiz gün";
        }
        System.out.println("Bugün " + gunAdi);
    }
}
