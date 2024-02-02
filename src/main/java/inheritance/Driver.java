package inheritance;

public class Driver {
    public static void main(String[] args) {

        Jeep jeep = new Jeep();
        Wrangler wrangler = new Wrangler();

        jeep.setGasMileage(12.0);
        wrangler.setGasMileage(13.0);

        System.out.println(jeep.getGasMileage());
        System.out.println(wrangler.getGasMileage());



    }
}
