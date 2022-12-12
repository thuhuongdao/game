package helitech.config;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Lang {
    public Properties lang;
    public void loadConfig(String file) {
        try {
        System.out.println("file " + file );
        lang = new Properties();

            lang.load(new InputStreamReader(new FileInputStream(file),"UTF8"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
