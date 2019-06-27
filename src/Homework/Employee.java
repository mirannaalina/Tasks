package Homework;
/*
Create a class that holds information about an employee
        name: text
        age: integer
        sex: character
        employer: text
        salary: double
        level: text (JUNIOR / SENIOR)
        Create constructor from all fields but salary and level.

        Create getters for all fields.

        Create setter for salary, one for level, and a method that can increase the age with a known amount.

        Overwrite the appropriate method so that

        Employee itEmployee = new Employee("John", 30, 'M', "IBM");
        Employee hrEmployee = new Employee("Carmen", 25, 'F', "Visma");
        System.out.println(itEmployer);
        System.out.println(hrEmployer);
        will print

        Employee: John, 30 years, male, works at IBM
        Employee: Carmen, 25 years, female, works at Visma
        Create a method that returns if an Employee is JUNIOR.

        Create a test in a separate class for all the requirements from above.

*/

public class Employee {
//1
    String name ;
    int age;
    char sex;
    String employer;
    double salary;
    String level ;
//2
    public Employee(String name, int age, char sex, String employer){
        this.name =  name;
        this.age = age;
        this.sex = sex;
        this.employer = employer;

    }
//3
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getSex(){
        return sex;
    }
    public String getEmployer(){
        return employer;
    }
    public double getSalary(){
        return salary;
    }
    public String getLevel(){
        return level;
    }
//4
    public void setSalary(double salary){
        this.salary =  salary;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public void IncreaseAge(){
        age++;
    }

//5




}
