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
public class Staff extends Empioyee{
  private String title;
  public  void setTitle(String title)
  {
      this.title=title;
  }
  public String getTitle()
  {
      return title ;
  }
   public String Tostring()
    {
        return " the name of person"+"------>"+ getName()+ " ##########"+"the name of calss "+ this.getClass();
    }

}
