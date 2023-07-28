package employeeApp.model;

import java.util.Arrays;

public class Employee {

    private long id;
    private String fullname;
    private String  email;
    private int password;
    String[] healthplans;

    public Employee(long id,String fullname,String email,int password,String[] healthplans){
        this.id=id;
        this.email=email;
        this.password=password;
        this.fullname=fullname;
        this.healthplans=healthplans;
    }

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name){
        try {
            if(healthplans[index]==null){
                healthplans[index]=name;
            }else{
                System.out.println("Value of that index is full!");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizide ki eleman sayısı aşıldı.");
        }
    }

    @Override
    public String toString() {
        return "Healthplan: "+ "id: "+id+" fullname: "+fullname+" email: "+email+" Company:"+ Arrays.toString(healthplans);
    }
}
