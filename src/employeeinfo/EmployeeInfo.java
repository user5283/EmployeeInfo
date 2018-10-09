/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinfo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *This module provides employee information.
 * @author Clera
 */
public class EmployeeInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(-9, "Clera");
        Employee emp2 = new Employee(345,"Chris");
        
        Employee emp3 = new Employee(45,"Tom", "Chch");
        
        ArrayList<Employee> listEmp = new ArrayList();
        
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        
        Iterator itEmp = listEmp.iterator();
        
        while(itEmp.hasNext()){
        
            System.out.println(itEmp.next());
        
        }
//        emp1.setId(-123);
//        emp1.setName("Clera");
//        
//        emp2.setId(0);
//        emp2.setName("Chris");
//        
//        System.out.println(emp1.getId() + ":" +emp1.getName());
//        System.out.println(emp2.getId() + ":" +emp2.getName());
//        System.out.println(emp3.getId() + ":" +emp3.getName() + ":"+ emp3.address);

//        System.out.println(emp1.toString());
//        System.out.println(emp2.toString());
        
    }
    
}
