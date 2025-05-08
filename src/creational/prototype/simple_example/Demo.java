package creational.prototype.simple_example;

import java.util.List;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees firstEmployees = (Employees) employees.clone();
        Employees secondEmployees = (Employees) employees.clone();
        List<String> list = firstEmployees.getEmpList();
        list.add("John");
        List<String> list1 = secondEmployees.getEmpList();
        list1.remove("Volodymyr");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("firstEmployees List: " + list);
        System.out.println("secondEmployees List: " + list1);
    }
}
