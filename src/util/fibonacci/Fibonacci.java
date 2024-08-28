package util.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {

    public static List<Integer> fibonacciCalc(int size){
        List<Integer> list = new ArrayList<>(List.of(0,1));
        IntStream.range(0,size).forEach(i-> list.add(i+2,list.get(i) + list.getLast()));
        return list;
    }

}
