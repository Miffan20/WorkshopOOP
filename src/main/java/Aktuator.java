public class Aktuator {


    private double value;
    private String name;

    //constructor
    public Aktuator(double value, String name){
        this.value=value;
        this.name=name;


    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {

        this.value = value;
    }

    @Override
    public String toString(){
        return name;
    }

}
