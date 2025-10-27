
public class Thermostat extends Appliance {

    private boolean on = false;

    @Override
    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("The thermostat has been turned on, the room will warm up.");
        } else {
            System.out.println("The thermostat is already on.");
        }
    }

    @Override
    public void turnOff() {
        if (!on) {
            on = true;
            System.out.println("The thermostat has been turned off, the room will cool down.");
        } else {
            System.out.println("The thermostat is already off.");
        }
    }

    @Override
    public boolean isOn() {
        return on;
    }

    public String getStatus(){
    String status = "Thermostat: " + (on ? "On" : "Off");
    return status;
    }
}
