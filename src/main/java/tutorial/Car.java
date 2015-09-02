package tutorial;

/**
 * Created by nick on 2/09/15.
 */
public class Car {
    private Engine engine;

    private String warningMessage;

    public Car(Engine engine ) {
        this.engine=engine;
    }


    public void accelerate(){
        engine.increaseRPM();
        if(engine.getRPM()>5000){
            warningMessage ="Slow Down!";
        }
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

}
