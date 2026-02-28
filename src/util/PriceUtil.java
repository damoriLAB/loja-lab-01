package util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class PriceUtil {

    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

    public static float generate(float value){
        
        BigDecimal bd = new BigDecimal(value);
        bd =  bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
       
    } 

     public static double generate(double value){
        BigDecimal bd = new BigDecimal(value);
        bd =  bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

     }

     public static String toString(double value){
        return CURRENCY_FORMAT.format(value);
     }
}
