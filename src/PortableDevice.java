public interface PortableDevice extends Device{

    @Override
    void turnOn();

    @Override
    void turnOff();

    @Override
    String getDeviceName();

    int getBatteryLevel();
    int chargeBattery();
}
