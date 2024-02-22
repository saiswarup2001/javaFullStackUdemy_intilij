package Constructor;

class BookDetails{
    String title;
    int price;

    BookDetails(String NameBook, int cost){
       title = NameBook;
       price = cost;
    }
}
public class Book {
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails("Jack and Son's",120);
        System.out.println("Title is: "+b1.title +" & price is: "+ b1.price);
    }
}
