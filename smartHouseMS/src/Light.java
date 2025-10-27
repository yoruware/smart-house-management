
public class Light extends Appliance {

    private boolean on = false; 

    @Override
    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("The light has been turned on.");
        } else {
            System.out.println("The light is already on.");
        }
    }

    @Override
    public void turnOff() {
        if (!on) {
            on = true;
            System.out.println("The light has been turned off.");
        } else {
            System.out.println("The light is already off.");
        }
    }

    @Override
    public boolean isOn() {
        return on;
    }

    public String getStatus(){
    String status = "Light: " + (on ? "On" : "Off");
    return status;
    }
}
