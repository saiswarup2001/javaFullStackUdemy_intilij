package exe;

import java.util.Comparator;

class yearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getYear() < o2.getYear()) return -1;
        if(o1.getYear() > o2.getYear()) return 1;
        else
            return 0;
    }
}
