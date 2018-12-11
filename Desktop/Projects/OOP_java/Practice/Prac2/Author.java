public class Author
{
  private String name ;
  private String email ;
  private char gender ;

  public Author(String authorName, String authorEmail, char authorGender)
  {
    this.name = authorName;
    this.email = authorEmail;
    this.gender = authorGender;
  }

  public String getName()
  {
    return authorName;
  }

  public String getEmail()
  {
    return authorEmail;
  }

  public void setEmail(String authorEmail)
  {
    this.email = email;
  }

  public char getGender ()
  {
    return authorGender;
  }

  public String toString()
  {
    return " "+this.name+" ("+this.gender+") "+this.email;
  }
}
