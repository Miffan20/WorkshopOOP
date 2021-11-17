public class Aktuator {


    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Aktuator(double value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Aktuator{" +
                "value=" + value +
                '}';
    }


}
