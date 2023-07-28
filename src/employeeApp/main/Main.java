package employeeApp.main;

import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;
import employeeApp.enums.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        System.out.println("-------------");
        Healthplan healthplan1=new Healthplan(1,"COMPANY 1", Plan.FULLCHECKUP);
        Healthplan healthplan2=new Healthplan(2,"COMPANY 2", Plan.CHECKUP);
        System.out.println(healthplan1.getPlan().getPrice());

        String[] healthplans=new String[3];
        healthplans[0]=healthplan1.getName();
        healthplans[1]=healthplan2.getName();

        Employee employee= new Employee(1,"Ali","ihsannote3@gmail.com",1234,healthplans);
        employee.addHealthplan(4,"COMPANY 3");

        System.out.println(employee);
        System.out.println("-------------");
        String[] developsnames=new  String[3];
        developsnames[0]=employee.getFullname();
        Company company=new Company(1,"Amazon",300000000,developsnames);
        System.out.println(company);



    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
