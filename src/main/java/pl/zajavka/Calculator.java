package pl.zajavka;

import org.slf4j.Logger;

public class Calculator {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Calculator.class);
//    metoda na potrzeby łapania wyjatków w klasie testowej
//    public static int add(String left, String right){
//        return Integer.parseInt(left) + Integer.parseInt(right);
//    }

    public static int add(int left, int right) {
//        dane do sprawdzenia dziłania logback
//        log.debug("some debug message");
//        log.info("some info message");
//        log.warn("some warn message");
//        log.error("some error message");
        if (left < 0) {
            System.out.println("less then 0");
        }

        return left + right;
    }

    public static int subtract(int left, int right) {
        return left - right;
    }

    public static int multiple(int left, int right) {
        return left * right;
    }

    public static int divide(int left, int right) {
        return left / right;
    }
}
