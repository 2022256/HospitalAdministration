/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author 4istik
 */
public class Patient {
    
    private String birthDate;
    private String name;
    private String bloodType;
    private int ID;
    private static int currentID = 1;
    
    public Patient(String dob, String name, String bloodType) {
        this.birthDate = dob;
        this.name = name;
        this.bloodType = bloodType;
        this.ID = currentID;
        currentID++;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
