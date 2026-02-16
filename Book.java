/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Tyler Ferdinand
 * @version 2/14
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     * Answer to 2.86: This book class of object is not immutable. Their 
     * field's can be edited and changed as needed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }
    // Add the methods here ...
    /**
     * Return the author's name.
     */
    public String printAuthor()
    {
        return author;
    }
    
    /**
     * Return the book's title.
     */
    public String printTitle()
    {
        return title;
    }
    
    /**
     * Return the book's length in pages.
     */
    public int printPages()
    {
        return pages;
    }

    /**
     * Returns ref number.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Returns number of times borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Returns whether book is course text.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Prints book details to terminal.
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Times borrowed from library: " + borrowed);
        
        if (refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
            System.out.println("Reference Number: ZZZ");
        }
    }
    
    /**
     * Sets ref number.
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error: Please input a valid refrence number.");
        }
    }
    
    /**
     * Increments the tally of times borrowed by 1.
     */
    public void borrow()
    {
        borrowed++;
    }
}
