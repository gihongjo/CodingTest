package OptionalPractice;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class OptionalPractice {


    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4);
        numbers.stream()
                .filter(n->n%2 ==0)
                .map(n->n*2)
                .forEach(
                        System.out::println);


    }




}
