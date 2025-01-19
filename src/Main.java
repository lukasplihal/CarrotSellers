public class Main {

    public static void main(String[] args) {




        com.lukas.CarrotSeller seller1 = new com.lukas.CarrotSeller();
        com.lukas.CarrotSeller seller2 = new com.lukas.CarrotSeller();
        com.lukas.CarrotSeller seller3 = new com.lukas.CarrotSeller();


        seller1.setName("Jan Dvořák");
        System.out.println("Jméno prvního prodejce je " + seller1.getName());

        seller1.setDateOfBirth(1997,12,12);
        System.out.println("Datum narození prvního prodejce je " + seller1.getDateOfBirth());
        seller1.setNumberOfContracts(5);
        System.out.println("Počet smulv prvního prodejce je " + seller1.getNumberOfContracts());
        seller1.setCity("Pelhřimov");
        System.out.println("Město prvního prodejce je " + seller1.getCity());
        seller1.setTonsOfCarrot(5.1);
        System.out.println("Počet tun prvního prodejce je " + seller1.getTonsOfCarrot());
        seller1.setPlateNumber("1A1 2B2");
        System.out.println("Poznávací značka prvního prodejce je " + seller1.getPlateNumber());
        seller1.setFuelConsumption(5.2);
        System.out.println("Spotřeba vozu prvního prodejce je " + seller1.getFuelConsumption());














    }
}