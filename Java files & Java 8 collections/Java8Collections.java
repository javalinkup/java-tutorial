import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Collections {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(2);
         // lambda experssion   ()->{} ,   (param1,param2)-> experssion   ()->
       int  b=10;
        Function<Integer, Integer> add = a->a+5;
        int number = add.apply(10);
       // System.out.println(number);
        FunctionalInterface functionalInterface = (a,c)-> {
            return a+c;
        };
        var d= functionalInterface.add(10,12);
        //System.out.println(d);
        //integerList.stream().forEach(System.out::println);// Method refrence
                  // Intemrediate oprration   .filter              termial operation .collect
        //var list = integerList.stream().filter(e->e%2!=0).collect(Collectors.toList());//print even numbers
        //integerList.stream().filter(e->e%2!=0).forEach(System.out::println);
        integerList.stream().map(n->n%2 !=0 ? n+1:n).forEach(System.out::println);
        integerList.stream().map(e->e*e).forEach(System.out::println);
        var maxNumber = integerList.stream().max(Integer::compareTo).get();
       //count
       var value = integerList.stream().count();
       integerList.stream().filter(e-> e%5==0).forEach(System.out::println);
       var count = integerList.stream().filter(e-> e%5==0).count();

       var sum = integerList.stream().mapToInt(Integer::intValue).sum();
       var sum2 = integerList.stream().reduce(0,Integer::sum);

       System.out.println(sum2);
    }
}
