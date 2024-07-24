/* If classB is subtype of classA, then we should be able to replace object of A with B without breaking the behaviour of the program 
 * Subclass should extend the capability of parent class not narrow it down.  
*/

interface Bike {
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    public void turnOnEngine() {
        isEngineOn = true;
    }   

    public void accelerate() {
        speed++;
    }
}

class BiCycle implements Bike {
    public void turnOnEngine() {
        throw new AssertionError("Bicycle cannot turn on engine");
    }

    public void accelerate() {
        // do something
    }
}
