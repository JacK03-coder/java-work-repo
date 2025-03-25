
import java.util.ArrayList;

/*
 * Random Program -->> Creating a Library management system is capable of  issuing books to the student's...
 * Book should have info like::
 * 1. Book name...
 * 2. Book Author..
 * 3. Issued To...
 * 4. Issued On...
 * User should have able to add books , return Issued Book , issue Book....
 * Assume that all the user are ragistered with their name in the central database.....
 */


 class Book{
    public String name , author ; 
 }

 class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book ){
        this.books.add(book);
    }
    public void issueBook(Book book , String issed_to){
        System.out.println("this book has been issued"+issed_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book  has been returned");
        this.books.add(b);
    }
    
 }
public class LastCodeOfThisFolder {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Library l = new Library(bk);   
        //hold the code for few dayes , then i will complete it............ 
    }
}
