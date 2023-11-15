/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration;

import java.sql.SQLException;

/**
 *
 * @author 4istik
 */
public class HospitalAdministration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Patient IvanPopov = new Patient("15/11/1996","Ivan","Red"); 
        Patient Andrei = new Patient("02/06/2000","Andrey","Red");
        
        System.out.println(IvanPopov.getID() + IvanPopov.getDob() + IvanPopov.getName() + IvanPopov.getBloodType());
        System.out.println(Andrei.getID() +" | "+ Andrei.getDob() +" | "+ Andrei.getName() +" | "+ Andrei.getBloodType());
        
        if(DatabaseSetup.setupDB()){
            System.out.println("Table created");
        }else{
            System.out.println("Problem");
        }
    }
    
}
