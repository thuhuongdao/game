package helitech.config;

public class CfgLang {

    public static Lang[] language = new Lang[7];
    public static void LoadConfig() {
        language[0] = new Lang();
        language[0].loadConfig("language/vi");

    }
}
