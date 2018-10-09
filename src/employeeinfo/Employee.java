/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinfo;

/**
 *
 * @author Clera
 */
public class Employee {
    private int id;
    private String name;
    public String address;
    
    
    public Employee(int e_id, String e_name){
    
        this.id = e_id;
        this.name = e_name;
    
    }
    
    public Employee(int e_id, String e_name, String e_address){
    
        this.id = e_id;
        this.name = e_name;
        this.address = e_address;
        
    }
    
    @Override
    public String toString(){
    
    
        return (this.getId() + ":" + this.getName());
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        
        if(id<=0)
            this.id = 1;
        else
            this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
