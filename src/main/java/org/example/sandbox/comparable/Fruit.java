package org.example.sandbox.comparable;

public class Fruit implements Comparable<Fruit> {

    private String fruitName;
    private String fruitDescription;
    private int fruitQty;

    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDescription() {
        return fruitDescription;
    }

    public void setFruitDescription(String fruitDescription) {
        this.fruitDescription = fruitDescription;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit {");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDescription='").append(fruitDescription).append('\'');
        sb.append(", fruitQty=").append(fruitQty);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit that) {

        if (this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        } else {

            if (this.fruitQty < that.fruitQty) {
                return -1;
            } else if (this.fruitQty > that.fruitQty) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
