public class Book
{
    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    private int year;
    private int edition;

    public Book (String name , String author)
    {
      bookName = name;
      bookAuthor = author;
    }

    public Book (String name, String author, String genre)
    {
      bookName = name;
      bookAuthor = author;
      bookGenre = genre;
    }

    public Book (String name, String author, String genre, int annum, int publication)
    {
      bookName = name;
      bookAuthor = author;
      bookGenre = genre;
      year = annum;
      edition = publication;
    }

    public void LightDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + ". \n");
    }

    public void MiddleDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + " in " + bookGenre + " genre. \n" );
    }

    public void FullDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + " in " + bookGenre + " genre in " + year + " at " + edition + " edition. \n" );
    }

}
