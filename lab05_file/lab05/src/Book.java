public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title,String author, int numberOfPages){
        this.title= (title.isEmpty()) ? title : "";
        this.author= (author.isEmpty()) ? author : "";
        this.numberOfPages = (numberOfPages<0) ? numberOfPages : 1;

    }
    @Override
    public String toString(){
        return "Book: " + this.title + "by " + this.author + ", Pages: " + this.numberOfPages;
    }
    @Override
    public boolean equals(Object obj){
        if(this ==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return title.equals(otherBook.title) && author.equals(otherBook.author) && numberOfPages == otherBook.numberOfPages;

    }
}
