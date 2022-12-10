package helitech.jedis;

import helitech.util.Util;
import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisPubSub;

import java.io.PrintWriter;
import java.io.StringWriter;


public class Subscriber extends JedisPubSub {
    static Logger  logger = LoggerFactory.getLogger("USER_API");
    @Override
    public void onMessage(String channel, String message) {
        int pos = message.indexOf("@");
        try {
            int service = Integer.parseInt(message.substring(0, pos));
            message = message.substring(pos + 1);

        }catch (Exception ex){
            logger.error(Util.exToString(ex));

        }


    }

    public static void main(String[] args) {



    }
}
