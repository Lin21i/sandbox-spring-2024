package inheritance;

public class Wrangler extends Jeep{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wrangler{");
        sb.append("gasMileage=").append(gasMileage);
        sb.append('}');
        return sb.toString();
    }
}
