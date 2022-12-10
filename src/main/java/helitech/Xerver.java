package helitech;

import helitech.jedis.JedisCache;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;


public class Xerver extends AbstractXerver {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        initConfig();
        JedisCache jedisCache = new JedisCache();




    }
}
