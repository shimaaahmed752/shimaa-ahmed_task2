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
public class Empioyee extends Person {
    private String office;
    private double salary ;
    private String dataHired;
    
    public void setOffice(String office)
    {
        this.office=office;
    }
    public String getOffice()
    {
        return office;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSaraly()
    {
        return salary;
    }
    public void setData_hired(String dataHired)
    {
        this.dataHired=dataHired;
    }
    public String getData_hired()
    {
        return dataHired;
    }
    @Override
     public String Tostring()
    {
         return " the name of person"+ getName()+ " >>>>>>>"+"the name of calss "+ this.getClass();
    }
}

