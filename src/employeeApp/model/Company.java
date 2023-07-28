package employeeApp.model;

import java.util.Arrays;

public class Company {

    private long id;
    private   String name;
    private  int giro;
    private String[] developerNames;

    private void giroConditions(int number){
        if(number<0){
            giro=0;
        }else {
            this.giro=number;
        }
    }

    public Company(long id,String name,int giro,String[] developerNames){
        giroConditions(giro);
        this.id=id;
        this.name=name;
        this.developerNames=developerNames;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(int giro) {
        giroConditions(giro);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){
        try {
            if(developerNames[index]==null){
                developerNames[index]=name;
            }else{
                System.out.println("Value of that index is full!");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizide ki eleman sayısı aşıldı.");
        }

    }

    @Override
    public String toString() {
         return "Companies: "+ "id: "+id+" name: "+name+" GIRO: "+giro+"$  "+" Developers that works:"+ Arrays.toString(developerNames);
    }
}
