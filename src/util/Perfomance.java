package util;

import java.util.function.Supplier;

public class Perfomance {

     public static <T> void mensureTimeExecution(Supplier<T> method, int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Test :"+ i);
            mensureTimeExecution(method);
            
        }
     }

    public static <T> void mensureTimeExecution(Runnable method, int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Test :"+ i);
            mensureTimeExecution(method);
            
        }
     }

    public static <T> T mensureTimeExecution(Supplier<T> method){
        long init = System.nanoTime();
        T result = method.get();
        long end = System.nanoTime();
        long duracao = end - init;
        System.out.println("Tempo em milissegundos: " + (duracao / 1_000_000.0));
        return result;
    }

    public static void mensureTimeExecution(Runnable method){
        long init = System.nanoTime();
        method.run();
        long end = System.nanoTime();
        long duracao = end - init;
        System.out.println("Tempo em milissegundos: " + (duracao / 1_000_000.0));
    }
    
}
