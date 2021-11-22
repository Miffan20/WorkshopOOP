public class Sensor {

    String name;
   double sensorValue;


   public Sensor (double value, String name){
        this.sensorValue = value;
        this.name = name;

   }




    public double getValue(){

        return sensorValue;
    }
    @Override
    public String toString() {
        return this.name;
    }

}
