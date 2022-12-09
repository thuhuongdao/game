package helitech;


import org.apache.log4j.xml.DOMConfigurator;

public class AbstractXerver  {
    protected static void initConfig(){
        DOMConfigurator.configure("log4j.xml");

    }
}
