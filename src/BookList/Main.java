package BookList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

            ArrayList<Book> books = new ArrayList<>();
            Book book1 = new Book("Gece Yarisi Kutuphenesi",282,"Matt Haig",2020);
            Book book2 = new Book("Kizil Veba",72,"Jack London",1912);
            Book book3 = new Book("Kamelyali Kadin",234,"Alexandre Dumas",1850);
            Book book4 = new Book("Aylak Adam",192,"Yusuf Atilgan",1959);
            Book book5 = new Book("Benden Sonra Mutluluk",280,"Ozdemir Asaf",1983);
            Book book6 = new Book("Pervane",76,"Sukru Erbas",2015);
            Book book7 = new Book("Butun Siirleri",161,"Sabahattin Ali",2019);//Basım Tarihi
            Book book8 = new Book("Aska Dair Nesirler",277,"Umit Yasar Oguzcan",2004);
            Book book9 = new Book("Bu Ulke",339,"Cemil Meric",1975);
            Book book10 = new Book("Sevdadir",256,"Arkadas Zekai OZger",2000);

            books.add(book1); books.add(book2);books.add(book3);
            books.add(book4);books.add(book5);  books.add(book6);
            books.add(book7);  books.add(book8);books.add(book9);  books.add(book10);

        Map<String,String> bookmap = new HashMap<>();
        books.forEach(book -> bookmap.put(book.getBookName(),book.getAuthor()));
        System.out.println();
        System.out.println("*********List of Books********");
        System.out.println();
        for(String b : bookmap.keySet()){
            System.out.println("Book Name: "+b+" ||"+"\t Author: "+bookmap.get(b));
        }
        System.out.println("======================================================");
        System.out.println();

        System.out.println("List of Books Which has more  Than 100 Pages : ");

        System.out.println();

        List<Book> booklist = books.stream().filter(book -> book.getPage()>100).toList();
        booklist.forEach(a-> System.out.println("Book Name: "+a.getBookName()+
                "\nPage NUmber: "+a.getPage()+
                "\nAuthor: "+a.getAuthor()+
                "\nPublish Year: "+a.getPublishYear()+
                "\t\t" + "\n------------" ));


        System.out.println();





    }
}