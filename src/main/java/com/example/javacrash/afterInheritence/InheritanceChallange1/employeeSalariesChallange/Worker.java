package com.example.javacrash.afterInheritence.InheritanceChallange1.employeeSalariesChallange;

public class Worker {

    public static void main(String[] args) {
        Employee temur = new Employee("Temur", "1999","2000", 19354, "2019" );
        System.out.println(temur);

        SalariedEmployee temur1 = new SalariedEmployee("Temur", "1999","2000", 19354, "2019", 2.5, false);
        System.out.println("before\t\t\t" + temur1.isRetired());
        temur1.retire();
        System.out.println("after \t\t\t" + temur1.isRetired());

        System.out.println();
        HourlyEmployee temur2 = new HourlyEmployee("Temur", "1999","2000", 19354, "2019" , 16);
        System.out.println("before\t\t\t" + temur2.getHourlyPayRate());
        temur2.getDoublePay();
        System.out.println("after\t\t\t" + temur2.getHourlyPayRate());



    }

    private String name;
    private String birthDate;
    private  String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        return 23;
    }

    public double collectPay() {
        return  0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}



