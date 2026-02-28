package util;

import java.util.List;

public class ShowResult {

    public static void console(String message, List<?> list){
        System.out.println();
        System.out.println("============================================");
        System.out.println(message);
        System.out.println("--------------------------------------------");
        list.forEach(x -> System.out.println(x));
        System.out.println("============================================");
        System.out.println();
    }

    public static void console(String message, Object obj){
        System.out.println();
        System.out.println("============================================");
        System.out.println(message);
        System.out.println("--------------------------------------------");
        System.out.println(obj);
        System.out.println("============================================");
        System.out.println();

    }
    
}
