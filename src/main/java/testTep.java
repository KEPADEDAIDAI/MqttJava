import org.eclipse.paho.client.mqttv3.MqttException;

public class testTep {
    public static void sent() throws MqttException {
        SentMqttTmp.pushMsg("aaa");
    }
}
