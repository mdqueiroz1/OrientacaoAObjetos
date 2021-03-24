public class FahrenheitException extends TemperatureException{
    
    public FahrenheitException(){
    }
    
    public String toString(){
        return "Erro! valor menor que -459,67!";
    }
}
