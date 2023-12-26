import java.io.*;
import java.util.*;

public class ConfigurationHandler {
    void saveConfig(int isNew, Map<String, String> config) {
        try {
            if (isNew == 1) {
                Map<String, String> defaultConfig = new HashMap<>();
                defaultConfig.put("path", null);
                defaultConfig.put("version", null);
                defaultConfig.put("sysName", null);
                FileOutputStream file = new FileOutputStream("config.cfg");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(defaultConfig);
                out.close();
                file.close();
            } else {
                FileOutputStream file = new FileOutputStream("config.cfg");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(config);
                out.close();
                file.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    void readConfig() {
        try {
            Map<String, String> config = null;
            FileInputStream file = new FileInputStream("config.cfg");
            ObjectInputStream in = new ObjectInputStream(file);
            config = (Map<String, String>) in.readObject();
            System.out.println(config);
            in.close();
            file.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    void updateConfig(String key, String value) {
        try {
            Map<String, String> config = null;
            FileInputStream file = new FileInputStream("config.cfg");
            ObjectInputStream in = new ObjectInputStream(file);
            config = (Map<String, String>) in.readObject();
            if (config.containsKey("Jim")) {
                config.remove(key);
                config.put(key, value);
            } else {
                config.put(key, value);
            }
            saveConfig(0, config);
            in.close();
            file.close();
            System.out.println("Updated.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // Check if configuration file exists
        File configFile = new File("config.cfg");
        Scanner scanner = new Scanner(System.in);
        ConfigurationHandler configHandler = new ConfigurationHandler();
        while (true) {
            if (configFile.exists()) {
                System.out.println("Configuration file exists.");
                configHandler.readConfig();
                System.out.print("Enter key: ");
                String key = scanner.next();
                if (key.equals("exit"))
                    break;
                System.out.print("Enter value: ");
                String value = scanner.next();
                configHandler.updateConfig(key, value);
                configHandler.readConfig();
            } else {
                System.out.println("Configuration file does not exist.");
                configHandler.saveConfig(1, null);
                System.out.println("Configuration file created.");
            }
        }
        scanner.close();
    }
}