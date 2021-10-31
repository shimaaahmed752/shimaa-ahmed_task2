
package student;

/**
 *
 * @author Shimaa Ahmed
 */
   public  class Student {
    public String studName;
    private int studId;
    public double studGpa;
    public Subject id;
    public Subject name;
    public Subject hours;
    public Address streetNo;
    public Address city;
    public Address country;
    
    
    public void setId(int id)
    {
        studId=id;
    }
    public int getId()
    {
        return studId;
    }
    
    public Student()
    {
        
    }
    public Student( String studName,double studGpa)
    {
        this.name=name;
        this.studName=studName;
        this.id=id;
        this.studGpa=studGpa;
        this.hours=hours;
        this.streetNo=streetNo;
        this.city=city;
        this.country=country;
        
        
    }
    public void show()
    {
        System.out.println("the name of student" +"---->"+studName + "      "+ "the Id of student " + "--->" + getId()+ " the gpa is  "+ "--->"+studGpa );
        System.out.println("the name of subject" +"---->"+name + "      "+ "the hours of subject " + "--->" + hours+ " the id of subject "+ "--->"+id );
        System.out.println("the number of street" +"---->"+streetNo + "      "+ "the city " + "--->" + city+ " the country  "+ "--->"+country );
    }
    
    public static void main(String[] args) {
        Student s=new Student();
        Subject ss=new Subject(12,"english" , 3);
        Address A=new Address(55,"egypt","minia");
        s.studName="shimaa";
        s.setId(33);
        s.studGpa=11;
      //  ss.subjName="math";
      //  ss.subjId=13;
       // ss.subjHours=3;
        //A.streetNo=55;
        //A.city="egypt";
        //A.country="minia";
       
       s.show();
       
    }
    
}
