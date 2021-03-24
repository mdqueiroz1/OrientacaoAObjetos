public class TemperatureException extends Exception {
    double temperatura;

    public TemperatureException(){}

    public TemperatureException( double temperatura){
        if(temperatura > -459.67){
            throw new FahrenheitException();
        }
    }

}
