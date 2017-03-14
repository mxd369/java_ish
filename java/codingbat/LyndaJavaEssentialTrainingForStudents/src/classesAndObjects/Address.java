package classesAndObjects;
/**
 * 
 * @author MXD
 */
// implemented comparable in the address class.
public class Address implements Comparable
{
    // instance data
    // private enforces data integrity
    // has instance data
    private String houseNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    
    // constructor 1
    // set up in case there is no address
    public Address(String houseNum, String address1, String address2,
            String city, String state, String zip)
    {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    // constructor 2
    public Address(String houseNum, String address1,             
            String city, String state, String zip)
    {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    // toString method
    // will format the address.
    public String toString()
    {
        if(address2.equals(""))
        {
            return (houseNumber + " " + address1 + "\n" + city
                    + ", " + state + " " + zipcode);
        }
        else
        {
            return(houseNumber + " " + address1 + "\n" + address2
                    + city + ", " + state + " " + zipcode);
        }
    }
    // compareTo
    /*
    when I compare one address to the other,
    So in this case I'm going to compare zip codes
    But if you remember, my zip code field is a string.
    So first I have to create an integer variable,
    I have int zip1 equals Integer.parseInt this.zipcode.
    */
    /*
     That way I can compare this zip code to the zip code of the address
     that came in from the calling program and use their numeric versions
     to figure out which one comes first. 
     */
    @Override
    public int compareTo(Object a)
    {
        // this compareTo method allows the programmer to sort
        // address by zipcode
        Address addr = (Address)a;
        int zip1 = Integer.parseInt(this.zipcode);
        int zip2 = Integer.parseInt(addr.zipcode);
        if(zip1 < zip2)
            return -1;
        else if (zip1 > zip2)
            return 1;
        else
            return 0;
    }
    
}