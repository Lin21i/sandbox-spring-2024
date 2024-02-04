package inheritance;

public class Driver {
    public static void main(String[] args) {

        Jeep jeep = new Jeep();
        Jeep wrangler = new Wrangler();

        jeep.setGasMileage(12.0);
        wrangler.setGasMileage(13.0);

        System.out.println(jeep.getGasMileage());
        System.out.println(wrangler.getGasMileage());

        jeep.numberofSeats = 55;
        wrangler.numberofSeats =55;

        System.out.println(jeep.getNumberOfSeats());
        System.out.println(wrangler.getNumberOfSeats());




    }
}
