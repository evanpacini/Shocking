package works.moes.shocking.shocking;

import com.fazecast.jSerialComm.SerialPort;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Shocking implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("Shocking");
    public static SerialPort serialPort;
    @Override
    public void onInitialize() {
        LOGGER.info("Loading Shocking...");
        open();
    }

    public static void send(byte[] data) {
        if (serialPort == null || !serialPort.isOpen()) open();
        try {
            serialPort.writeBytes(data, data.length);
        } catch (Exception e) {
            LOGGER.error("Error writing to serial port: " + e.getMessage());
        }
    }

    public static void open() {
        try {
            LOGGER.info("Initialising serial port...");
            serialPort = SerialPort.getCommPort("/dev/ttyACM0");
            serialPort.setComPortParameters(9600, 8, 1, 0);
            serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
            serialPort.openPort();
        } catch (Exception e) {
            LOGGER.error("Error opening serial port: " + e.getMessage());
        }
    }
}
