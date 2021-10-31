/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Shimaa Ahmed
 */
public class Address {
    int streetNo;
    String city;
    String country;
    
    public Address()
    {
        
    }
    public Address(int streetNo,String city,String country)
    {
        this.streetNo=streetNo;
        this.city=city;
        this.country=country;
    }
}
