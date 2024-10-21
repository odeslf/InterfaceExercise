import java.util.ArrayList;

public class SmartPhone implements SmartDevice{

    private String phoneName;
    private int batteryLevel;
    private ArrayList<String> callHistory;
    private ArrayList<String> messageHistory;

    public SmartPhone(String phoneName, int batteryLevel) {
        this.phoneName = phoneName;
        this.batteryLevel = batteryLevel;
        this.callHistory = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    @Override
    public void makeCall(String number) {
        callHistory.add("Chamada para: " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        messageHistory.add("Mensagem para: " + number + " | Texto: " + message);
    }

    public void printCallHistory() {
        for (String call : callHistory) {
            System.out.println(call);
        }
    }

    public void printMessageHistory() {
        for (String msg : messageHistory) {
            System.out.println(msg);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on, loading...");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off...");

    }

    @Override
    public String getDeviceName() {
        return this.phoneName;
    }

    @Override
    public int getBatteryLevel() {

        return this.batteryLevel;
    }

    @Override
    public int chargeBattery() {
         this.batteryLevel += 10;

         if (this.batteryLevel > 100) {
             this.batteryLevel = 100;
         }

         return this.batteryLevel;
    }
}
