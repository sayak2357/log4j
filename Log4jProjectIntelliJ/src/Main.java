import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    static {
        try {
            SimpleLayout layout = new SimpleLayout();
            ConsoleAppender appender = new ConsoleAppender(layout);
            //appender.setLayout(layout);
            logger.addAppender(appender);

            // Default Logging Level of Log4J

            logger.setLevel(Level.DEBUG);
           // logger.setLevel(Level.OFF);
            // logger.setLevel(Level.ALL);
            // ################################


            logger.info("Log4j Setup is ready.");
        }
        catch(Exception e){
            e.printStackTrace();
            logger.fatal("Problem while setting up Log4j.");
        }
    }

    public static void main(String[] args) {

        logger.debug("Start of main(-) method.");
        logger.debug("Sample debug level statement");
        System.out.println("s.o.p output");
    }
}
