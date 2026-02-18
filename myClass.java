

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.*;


public class myClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer>nums =   Arrays.asList(2,3,4,5,6) ;

        Stream<Integer>s1 = nums.stream() ;
        


        // s1.forEach(n->System.out.println(n));
        //  this is stream   which  will  not change the original  array  
        //  but problem  is that   we can  not use it more than ones  
        // s1.forEach(n->System.out.println(n)); //  if  u  write it then  it  give error 


        // filter 
        // Stream<Integer>s2 = s1.filter(n-> n%2 == 0) ;
        // Stream<Integer>s3 = s2.map(n-> n*2) ;
        // int s4 =  s3.reduce(0 , (c , e) ->c + e) ; // reduces  is  the  terminal  operation  it clear  the  s3  , so  if you  try  to  print s3  then it not work  


        // s3.forEach(n->System.out.println(n)); //  you  can not  use the strame more  than one  even  it   define with  the  different  name  


        Predicate<Integer> p1 =   new  Predicate<Integer>(){
            public  boolean test(Integer n){
                if(n%2 == 0){
                    return  true ;
                }
                else{
                    return  false ;
                }
            }
        } ;

        Function<Integer ,  Integer> func = n -> n*2 ;
        

        int s4 = nums.stream()
            .filter(p1) 
            .map(func) 
            .reduce(0 , (c , e) ->  c +  e ) ;

            //  if you  stream  them and then sort  it then also it work    .sorted()  you have to write this 

        

        //  we can  also write a every  thing  in  one line or  one go  


        // System.out.println(s4) ;


        //  paraellel stream in  java  

        List<Integer>ary= new ArrayList<>(100) ; //  it just assign a  size that at  max  this much elemant  can  be place  inside it 
        
        Random ran = new  Random() ;

        ary.forEach(n->System.out.println(n));



        for(int i = 1 ; i <=  100 ;  i++){
            ary.add(ran.nextInt(100)) ;
        }

        ary.forEach(n->System.out.println(n));





    }
}
