package helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriterXML {
    private static String filePath;
    Properties properties = new Properties();
    public PropertiesWriterXML(String filePath) {
        this.filePath = filePath;
    }

    public void setProperty(String key, String value, boolean clearFile) {
        if (!clearFile) {

            try (FileInputStream inputStream = new FileInputStream(filePath)) {
                properties.loadFromXML(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        properties.setProperty(key, value);


        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            properties.storeToXML(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args) {

        filePath = "src/main/resources/data.xml";
        PropertiesWriterXML settingsManager = new PropertiesWriterXML(filePath);
        settingsManager.setProperty("user1", "jpasscom", false);
        String res = PropertiesReaderXML.getProperty("user1");
        System.out.println("Result : "+ res);
        // settingsManager.setProperty("key465", "valf:g!bdf4ue2", false);
    }
}