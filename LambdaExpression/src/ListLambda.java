import java.util.*;

class student{
    private String NAME;

    public student(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "student{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}

public class ListLambda {
    public static void main(String[] args) {

        List<student> list = new ArrayList<>();
        list.add(new student("Sai"));
        list.add(new student("Jhon"));
        list.add(new student("Jack"));
        list.add(new student("Monik"));
        list.add(new student("Sonu"));

       /*
        Collections.sort(list, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getNAME().compareTo(o2.getNAME());
            }
        });
        */

        /* Collections.sort(list, (o1, o2) -> o1.getNAME().compareTo(o2.getNAME())); //using lambda */

        //Lambda Exp using multiple statements
        Collections.sort(list, (o1, o2) ->
        {
            if(o1.getNAME().length() < o2.getNAME().length()){
                return -1;
            }else if(o1.getNAME().length() > o2.getNAME().length()){
                return 1;
            }else{
                return 0;
            }
        });

        for(student s : list){
            System.out.println(s.getNAME());
        }
    }
}
