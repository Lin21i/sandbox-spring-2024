package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        Landcraft grandCherokee = new GrandCherokee();
        Landcraft wrangler = new Wrangler();


        List<Landcraft> landcrafts = new ArrayList<>();
        landcrafts.add(grandCherokee);
        landcrafts.add(wrangler);

        for (Landcraft lc : landcrafts){
            System.out.println(lc.getClass().getSimpleName());
        }

        landcrafts.forEach(System.out::println);

    }
}
