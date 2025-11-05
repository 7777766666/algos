package com.example.algos.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    public void start(){
        doMath(x -> String.valueOf(x * x));
    }

    public void checkMore0(){
        moreThenZero(x -> x > 0);
    }

    public Integer plusInt(){
        return stringInt((x, y) -> Integer.parseInt(x) + y);
    }
    private Integer stringInt(StringPlusInt<String, Integer> plusIntString){
        return plusIntString.plusInt("77", 33);
    }

    public Integer incr (String x, Integer y){
         Increment<Integer, String> increment = ( (a, v) -> Integer.parseInt(v) + a);
         return increment.inc(y, x);
    }

    public String lolReturn(){
        ReturnLol<String> func = ( () -> "Lol");
        return func.lol();
    }

    private Integer increment(Increment<Integer, Integer> lam, Integer x, Integer y ){
        return lam.inc(x, y);
    }

    public Boolean more100(Integer x){
        Predicate<Integer> number = (n -> n > 100);
        return number.test(x);
    }

    public ArrayList<Integer> onlyPositiv (List<Integer> list){
        Predicate<Integer> onlyPlus = (x -> x > 0);
        return list.stream()
                .filter(onlyPlus)
                .collect(Collectors.toCollection(ArrayList::new) );

    }

    public Integer sumArray(List<String> array){
        return array
                .stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }



    private void doMath(Convertable<Integer, String> convert) {
        System.out.println(convert.convert(9));
    }

    private void moreThenZero(Predicate<Integer> test){
        System.out.println(test.test(-97));

    }

}
