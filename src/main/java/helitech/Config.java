package helitech;

import helitech.common.slib_Properties;

public class Config {
    /**
     * Internal variable to hold the properties
     */
    private static slib_Properties mProps;
    /**
     * This method loads properties from specify configuration file. It must be called before any getXXX() method is called.
     *
     * @param aSource
     *            full path of configuration file
     * @throws Exception
     */
    public static void load(Object aSource){
        String filename = (String) aSource;
        mProps = new slib_Properties(filename);
    }
}
