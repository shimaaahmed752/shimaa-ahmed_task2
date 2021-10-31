/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Shimaa Ahmed
 */
public class Faculty extends Empioyee {
    public int officehours;
    public String rank;
    public Faculty( int officehours,String rank)
    {
        this.officehours=officehours;
        this.rank=rank;
    }
    public String Tostring()
    {
        return " the name of person"+"------>"+ getName()+ " ##########"+"the name of calss "+ this.getClass();
    }
    
}
