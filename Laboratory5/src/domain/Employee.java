
package domain;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import util.Utility;

public class Employee {
    private int id;
    private String lastname;
    private String firstname;
    private String title; //profesion
    private Date birthday; //fecha de nac.

    public Employee(int id, String lastname, String firstname, String title, Date birthday) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.birthday = birthday;
    }

    public Employee(Employee employee) {
        this.id=employee.id;
        this.lastname =employee.lastname;
        this.firstname =employee.firstname;
        this.title = employee.title;
        this.birthday = employee.birthday;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
     public int getAge(){
        return Utility.getAge(birthday);
       
    }

    @Override
    public String toString() {
        return "(ID)"+id +"/(Name)"+lastname+", "+firstname
            + "/(Birthday)"+util.Utility.dateFormat(birthday)+ "/(Title)"+title
            +"/(Age)"+ Utility.getAge(birthday);
    }
    
    
}
