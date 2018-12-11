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

    public void SetLightInfo (String name, String author)
    {
      this.bookName = name;
      this.bookAuthor = author;
    }

    public void SetMiddInfo (String name, String author, String genre)
    {
      this.bookName = name;
      this.bookAuthor = author;
      this.bookGenre = genre;
    }

    public void SetFullInfo (String name, String author, String genre, int year, int edition)
    {
      this.bookName = name;
      this.bookAuthor = author;
      this.bookGenre = genre;
      this.year = year;
      this.edition = edition;
    }

    public void LightDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + ". ");
    }

    public void MiddleDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + " in " + bookGenre + " genre. " );
    }

    public void FullDisplay()
    {
      System.out.println (bookName + " was written by " + bookAuthor + " in " + bookGenre + " genre in " + year + " at " + edition + " edition. " );
    }

}
