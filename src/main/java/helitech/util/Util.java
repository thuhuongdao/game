package helitech.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Util {
    public static String exToString(Exception ex) {
        StringWriter errors = new StringWriter();
        ex.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }
}
