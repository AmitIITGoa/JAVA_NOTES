

import java.util.Scanner;
import java.util.stream.Stream;
import  java.util.ArrayList;
import java.util.List; 
import java.util.Arrays ;
import java.util.*;


public class myClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer>nums =   Arrays.asList(2,3,4,5) ;

        Stream<Integer>s1 = nums.stream() ;

        s1.forEach(n->System.out.println(n));
        //  this is stream   which  will  not change the original  array  
        //  but problem  is that   we can  not use it more than ones  

        
        





    

    }
}
