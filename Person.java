
package person;


public class Person {
    private String name;
    public String Address;
    private String Phone_Number;
    private String Email_address;
    
public void setName(String name)
{
    this.name=name;
}
public String getName()
{
    return name;
}
public void setPhone_Number(String phone_Number)
{
    this.Phone_Number=Phone_Number;
}
public String getPhone_Number()
{
    return Phone_Number;
}
public void setEmail_address(String Email_address )
{
    this.Email_address=Email_address;
}
public String getEmail_address()
{
    return Email_address;
}
    public String Tostring()
    {
        return " the name of person"+"------>"+ getName()+ " ##########"+"the name of calss "+ this.getClass();
    }
    
    public static void main(String[] args) {
        Person b=new Person();
        b.setName("shimaa");
        b.setEmail_address("minia");
        b.setPhone_Number("011111111");
      System.out.println(  b.Tostring());
      Student s=new Student();
      s.setName("sara");
      System.out.println(s.Tostring());
        
    }
    
}
