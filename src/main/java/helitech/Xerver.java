package helitech;

import helitech.config.CfgLang;
import helitech.dao.mapping.Employee;
import helitech.jedis.JedisCache;
import helitech.util.HibernateUtil;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;


public class Xerver extends AbstractXerver {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        initConfig();
        JedisCache jedisCache = new JedisCache();
        initMyConfig();
        Xerver xerver = new Xerver();
        int a = xerver.addEmployee("david","bi",new Date(), 1000);




    }
    public int addEmployee(String fname, String lname, Date birthday, int salary) {
        Session session = HibernateUtil.sessionFactory.openSession();

        try {
            Transaction tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname,birthday, salary);
            int employeeID = (int) session.save(employee);
            tx.commit();
            return employeeID;
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 0;
    }
    public static void initMyConfig() {
        initGameConfig();
    }
    public static void initGameConfig(){
        CfgLang.LoadConfig();

    }
}
