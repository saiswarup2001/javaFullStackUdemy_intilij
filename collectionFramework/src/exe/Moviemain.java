package exe;

import java.util.ArrayList;
import java.util.Collections;

public class Moviemain {
    public static void main(String[] args) {

        ArrayList<Movie> List = new ArrayList<>();
        List.add(new Movie(5,"Avenger", 2001));
        List.add(new Movie(2,"Marvel", 2011));
        List.add(new Movie(3,"hum apke hai kon", 2010));
        List.add(new Movie(4,"DC", 1991));
        List.add(new Movie(4,"Batman", 1981));

        System.out.println("sorted Rating");
        ratingComparator rc = new ratingComparator();
        Collections.sort(List, rc);
        for(Movie M:  List){
            System.out.println(M.getYear()+" "+M.getName()+" "+M.getRating());
        }
        System.out.println();
        System.out.println("sorted Year");
        yearComparator yc = new yearComparator();
        Collections.sort(List, yc);
        for(Movie M:  List){
            System.out.println(M.getYear()+" "+M.getName()+" "+M.getRating());
        }

        System.out.println();
        System.out.println("sorted Name");
        nameComparator nc = new nameComparator();
        Collections.sort(List, nc);
        for(Movie M: List){
            System.out.println(M.getYear()+" "+M.getName()+" "+M.getRating());
        }
    }
}
