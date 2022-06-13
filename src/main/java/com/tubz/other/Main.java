package com.tubz.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Employee tubin = new Employee("Tubin Shaji", 31);
        Employee lincy = new Employee("Lincy Mathew", 25);
        Employee john = new Employee("John Doe", 45);
        Employee steve = new Employee("Steve Jobs", 34);
        Employee saniya = new Employee("Saniya Mirsa", 36);
        Employee mark = new Employee("Mark Nine", 24);
        Employee rose = new Employee("Rose Mike", 29);
        List<Employee> employees = new ArrayList<>();
        employees.add(tubin);
        employees.add(lincy);
        employees.add(john);
        employees.add(steve);
        employees.add(saniya);
        employees.add(mark);
        employees.add(rose);
        printEmployeeByAge(employees, "Employee over 30", employee -> employee.age > 30);
        printEmployeeByAge(employees, "Employee below 30", employee -> employee.age <= 30);

        Function<Employee, String> getLastName = (employee -> employee.getName().substring(employee.getName().indexOf(' ') + 1));
        System.out.println(getLastName.apply(employees.get(0)));

        Function<Employee, String> getFirstName = (employee -> employee.getName().substring(0, employee.getName().indexOf(' ')));

        Random random = new Random();
        for (Employee e : employees) {
            if (random.nextBoolean()) {
                System.out.println("First name " + getAName(getFirstName, e));
            } else {
                System.out.println("Last name " +getAName(getLastName, e));
            }
        }

    }

    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }

    private static void printEmployeeByAge(final List<Employee> employees, final String text, Predicate<Employee> ageCondition) {
        System.out.println(text);
        employees.forEach(employee -> {
            if (ageCondition.test(employee)) {
                System.out.println(employee.name);
            }
        });

    }
}
