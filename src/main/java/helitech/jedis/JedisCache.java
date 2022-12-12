package helitech.jedis;

import helitech.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;



public class JedisCache {
    Logger logger = LoggerFactory.getLogger("BEM");
    public static String gameChannel = "GameChannel";
    public static String serviceChannel = "ServiceChannel";

    final Subscriber subscriber = new Subscriber();
    JedisPool pool;

    public JedisCache() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(200);
        config.setMaxIdle(5);
        pool = new JedisPool(config);
        new Thread(new Runnable() {

            boolean isRun = true;

            public void run() {
                while (isRun) {
                    try {

                        logger.info("Subscribing to \"" + gameChannel + "\"");
                        Jedis jedis = pool.getResource();
                        jedis.subscribe(subscriber, gameChannel);
                        pool.returnResource(jedis);
                        logger.info("Subscription ended.");
                        Thread.sleep(3000);
                    } catch (Exception ex) {
                        // getLogger().info("Subscribing failed." + ex.toString());
                        //ex.printStackTrace();
                        logger.error(Util.exToString(ex));
                    }
                }
            }
        }).start();
    }
}
