package works.moes.shocking.shocking;

import com.fazecast.jSerialComm.SerialPort;
import net.fabricmc.api.ModInitializer;

public class Shocking implements ModInitializer {
    public static SerialPort serialPort;
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        System.out.println("[Shocking] Hello Fabric world!");
        serialPort = SerialPort.getCommPort("/dev/ttyACM0");
        serialPort.setComPortParameters(9600, 8, 1, 0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        serialPort.openPort();
    }
}
