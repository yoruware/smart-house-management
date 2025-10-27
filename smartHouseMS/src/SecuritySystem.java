
public class SecuritySystem extends Appliance {

    private boolean cameraOn = false;
    private boolean alarmOn = false;

    @Override
    public void turnOn() {
        if (!alarmOn) {
            alarmOn = true;
            System.out.println("The alarm is active, be careful!");
        } else {
            System.out.println("The alarm is already active.");
        }

        if (!cameraOn) {
            cameraOn = true;
            System.out.println("The camera is active.");
        } else {
            System.out.println("The camera is already active.");
        }
    }

    @Override
    public void turnOff() {
        if (!alarmOn) {
            alarmOn = true;
            System.out.println("The alarm is off.");
        } else {
            System.out.println("The alarm is already off.");
        }

        if (!cameraOn) {
            cameraOn = true;
            System.out.println("The camera is off.");
        } else {
            System.out.println("The camera is already off.");
        }
    }

    public String getStatus(){
    String status = "Alarm: " + (alarmOn ? "On" : "Off") +
                    " Camera: " + (cameraOn ? "On" : "Off");
    return status;
    }

}
