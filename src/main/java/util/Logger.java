package util;

import org.slf4j.LoggerFactory;

public class Logger {

    private Logger() {
    }

    public static void error(Class<?> clazz, String mensaje) {

        LoggerFactory.getLogger(clazz.getName()).error(mensaje);
    }


    public static void info(Class<?> clazz, String mensaje) {

        LoggerFactory.getLogger(clazz.getName()).info(mensaje);
    }


}
