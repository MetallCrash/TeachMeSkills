package Unit10;

public class EngineStartFailureExceprion extends Exception{
    public EngineStartFailureExceprion() {
    }

    public EngineStartFailureExceprion(String error, String model){
        System.err.println("Двигатель "+model+" не завелся.");
    }
}
