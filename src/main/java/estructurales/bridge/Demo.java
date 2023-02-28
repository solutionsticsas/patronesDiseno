package estructurales.bridge;

import estructurales.bridge.devices.Tv;
import estructurales.bridge.devices.Device;
import estructurales.bridge.devices.Radio;
import estructurales.bridge.devices.Tv;
import estructurales.bridge.remote.AdvancedRemote;
import estructurales.bridge.remote.BasicRemote;


public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}