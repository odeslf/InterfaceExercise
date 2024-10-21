import java.util.ArrayList;

public class Tablet implements SmartDevice{

    private String tabletName;
    private int batteryLevel;
    private ArrayList<String> messageHistory;

    public Tablet(String tabletName, int batteryLevel) {
        this.tabletName = tabletName;
        this.batteryLevel = batteryLevel;
        this.messageHistory = new ArrayList<>();
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Este dispositivo não faz ligações");

    }

    @Override
    public void sendMessage(String number, String message) {
        messageHistory.add("Mensagem para: " + number + " | Texto: " + message);
    }

    public void printMessageHistory() {
        for (String msg : messageHistory) {
            System.out.println(msg);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet is turning on, loading...");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet is turning off...");

    }

    @Override
    public String getDeviceName() {

        return this.tabletName;
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
