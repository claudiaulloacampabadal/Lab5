/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class JobPosition {
    private int id; //identity o autogenerado
    private String description;
    private double hourlyWage;
    private static int autoId; //para el id autogenerado
    
    //Constructor
    public JobPosition(String description, double hourlyWage) {
        this.id = ++autoId; //autogeneramos el id +
        this.description = description;
        this.hourlyWage = hourlyWage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        JobPosition.autoId = autoId;
    }
    
    public double getSalary(double n){
        return n * hourlyWage;
    }

    @Override
    public String toString() {
        return "(ID)"+id+"/(Job Position)"+description +" /(Hourly Wage)"+ hourlyWage;
    }  
    
}
