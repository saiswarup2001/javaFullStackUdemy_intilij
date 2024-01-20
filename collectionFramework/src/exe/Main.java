package exe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<phoneDictory> pd = new ArrayList<>();
        pd.add(new phoneDictory("Sai", "75896"));
        pd.add(new phoneDictory("Dibyansu", "89655"));
        pd.add(new phoneDictory("Monik", "645415"));
        pd.add(new phoneDictory("Apple", "1901252"));
        pd.add(new phoneDictory("Arpita", "856588"));
        pd.add(new phoneDictory("Sonalika", "66868"));
        pd.add(new phoneDictory("Isha", "78658"));


        Collections.sort(pd);
        for(phoneDictory p: pd){
            System.out.println(p.getContactName()+" "+p.getContactNumber());
        }

    }
}
