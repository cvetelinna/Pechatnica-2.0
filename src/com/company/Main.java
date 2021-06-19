package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> ems = new ArrayList<>();

        ems.add(new Employee(EmployeeType.BOSS));
        ems.add(new Employee(EmployeeType.WORKER));
        ems.add(new Employee(EmployeeType.WORKER));
        ems.add(new Employee(EmployeeType.WORKER));
        ems.add(new Employee(EmployeeType.WORKER));
        ems.add(new Employee(EmployeeType.WORKER));
        ems.add(new Employee(EmployeeType.BOSS));

        Book Qnko = new Book(10, "Qnko", 3000, Format.А3, TypeOfPaper.MAGAZINE);
        Book HP = new Book(10, "Harry Potter", 3000, Format.А3 , TypeOfPaper.NEWSPAPER);
        List<Book> books = new ArrayList<>();

        books.add(HP);
        books.add(Qnko);

        BookIncomeOutcome ind = new BookIncomeOutcome(books, ems);
        System.out.println(ind.sumBookExpenses());
        System.out.println(ind.sumBookIncome());
        ind.SumSalary();

        List<Machine> mcs = new ArrayList<>();
        mcs.add(new Machine(Color.BLACKWHITE, 3000, 100));
        mcs.add(new Machine(Color.COLORFUL, 3000, 100));
        mcs.add(new Machine(Color.BLACKWHITE, 3000, 100));


        Fabrica ph = new Fabrica(ems, mcs);
        ph.startPrinting(HP);
        ph.startPrinting(Qnko);


    }
}
