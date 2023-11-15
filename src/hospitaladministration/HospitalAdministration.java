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
        Patient IvanPopov = new Patient("1996-11-16","Ivan","A"); 
        Patient Andrei = new Patient("2000-06-02","Andrei","B");
        
        System.out.println(IvanPopov.getID() +" | "+ IvanPopov.getBirthDate() +" | "+ IvanPopov.getName() +" | "+ IvanPopov.getBloodType());
        System.out.println(Andrei.getID() +" | "+ Andrei.getBirthDate()+" | "+ Andrei.getName() +" | "+ Andrei.getBloodType());
        
        if(DatabaseSetup.setupDB()){
            System.out.println("Table created");
        }else{
            System.out.println("Problemos muchachos eblanos Samos Dolboebos");
        }
        DatabaseWriter dbw = new DatabaseWriter();
        if(dbw.addPatient(IvanPopov)){
            System.out.println("Ivan Added");
        }else{
            System.out.println("Error");
        }
        if(dbw.addPatient(Andrei)){
            System.out.println("Andrei Added");
        }else{
            System.out.println("Error");
        }
    }
    
}
