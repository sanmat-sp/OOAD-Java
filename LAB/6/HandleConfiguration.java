import java.io.*;
import java.util.*;

public class HandleConfiguration{
    void serialize(int isNew, HashMap<String, String> hm){
        try{
            if (isNew==1){
                HashMap<String, String> conf = new HashMap<>();
                conf.put("path", null);
                conf.put("version", null);
                conf.put("sysName", null);
                FileOutputStream file = new FileOutputStream("config.cfg");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(conf);
                out.close();
                file.close();
            }
            else{
                FileOutputStream file = new FileOutputStream("config.cfg");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(hm);
                out.close();
                file.close();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void readConfig(){
        try{
            HashMap<String, String> hmconf = null;
            FileInputStream file = new FileInputStream("config.cfg");
            ObjectInputStream in = new ObjectInputStream(file);
            hmconf = (HashMap<String, String>)in.readObject();
            System.out.println(hmconf);
            in.close();
            file.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    void update(String key, String value){
        try{
            HashMap<String, String> hmconf = null;
            FileInputStream file = new FileInputStream("config.cfg");
            ObjectInputStream in = new ObjectInputStream(file);
            hmconf = (HashMap<String, String>)in.readObject();
            if(hmconf.containsKey("Jim")){
                hmconf.remove(key);
                hmconf.put(key, value);
            }
            else{
                hmconf.put(key, value);
            }
            serialize(0, hmconf);
            in.close();
            file.close();
            System.out.println("Updated");

        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // Check if configuration file exists
        File file = new File("config.cfg");
        Scanner sc = new Scanner(System.in);
        HandleConfiguration hc = new HandleConfiguration();
        while(true){
                if (file.exists()) {
                    System.out.println("Configuration file exists");                    
                        hc.readConfig();
                        System.out.print("Enter key: ");
                        String key = sc.next();
                        if(key.equals("exit"))
                            break;
                        System.out.print("Enter value: ");
                        String value = sc.next();
                        hc.update(key, value);
                        hc.readConfig();
                    }

                 else {
                    System.out.println("Configuration file does not exist");
                    hc.serialize(1, null);
                    System.out.println("Configuration file created\n");
                }
            }
        sc.close();
    }
}





