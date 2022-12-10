package helitech;


import org.apache.log4j.xml.DOMConfigurator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class AbstractXerver  {
    protected static void initConfig() throws ParserConfigurationException, IOException, SAXException {

        DOMConfigurator.configure("log4j.xml");
//        Config.load("config.xml");
    }
}
