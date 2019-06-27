package Homework;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee it = new Employee("Alina",22,'F',"Atos");
        Employee  hr =  new Employee("Ana",33 , 'f',"Conti");

        System.out.println("Employee " + it.getName() + " ," + it.getAge() +" ,"+ it.getSex() +" ,"+ it.getEmployer());
        System.out.println("Employee " + hr.getName() + " ," + hr.getAge() +", "+ hr.getSex() +", "+ hr.getEmployer());
    }
}
