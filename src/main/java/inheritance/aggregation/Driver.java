package inheritance.aggregation;

public class Driver {
    public static void main(String[] args) {

        String amoutOfLettuce = "a lot";
        Salad salad = new Salad("a lot", "not much","tons","a few");
        System.out.println(salad);

        Salad anotherSalad = new Salad();
        System.out.println(anotherSalad);

        System.out.println(anotherSalad);}

    }

