package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderXML {

    private static final String PROPERTIES_FILE_PATH = "src/main/resources/data.xml";

    public static String getProperty(String key) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE_PATH)) {
            properties.loadFromXML(fis);
            return properties.getProperty(key);
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getProperty("user1"));
    }
}