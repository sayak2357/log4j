import org.apache.log4j.*;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    static {
        try {
            PropertyConfigurator.configure("src/log4j.properties");
            //PropertyConfigurator.configureAndWatch("src/log4j.properties",  <delay in milliseconds>);
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
