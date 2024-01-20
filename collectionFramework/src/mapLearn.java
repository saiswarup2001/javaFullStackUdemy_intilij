import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapLearn {
    public static void main(String[] args) {
//        Map<String, Integer> number = new HashMap<>();
        Map<String, Integer> number = new TreeMap<>();  //sort in dictionary ordering means alphabetical ordering
        System.out.println("------------put--------------");
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
        number.put("Five", 5);

//        if(!number.containsKey("Three")){
//            number.put("Three", 4);
//        }
//
//        number.putIfAbsent("Two", 4);

        System.out.println("Previous one : "+number); //{Five=5, One=1, Four=4, Two=2, Three=3}
        System.out.println("-------------------------");
        System.out.println(number.containsValue(3)); //true
        System.out.println("-------------------------");
        System.out.println(number.isEmpty()); //false
        System.out.println("-------------------------");
        number.remove("Three");
        System.out.println(number); //{Five=5, Four=4, One=1, Two=2}
//        System.out.println("-------------------------");
        for(Map.Entry<String, Integer> e: number.entrySet()){
            System.out.println("-------------------------");
            System.out.println("Map is : "+ e); //Map is : Five=5
            System.out.println("Map keys is : "+ e.getKey()); //Map keys is : Five
            System.out.println("Map value is : "+ e.getValue()); //Map value is : 5
        }
        System.out.println("-------------------------");
        for(String keys : number.keySet()){
            System.out.println(keys);
        }
        System.out.println("-------------------------");
        for(Integer value : number.values()){
            System.out.println(value);
        }
    }
}


/* NOTES-->
*  1. stores in key and value type*/