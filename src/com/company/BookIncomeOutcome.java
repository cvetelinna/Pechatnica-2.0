package com.company;

import java.util.List;

public class BookIncomeOutcome{

    private List<Book> books;
    private List<Employee>employees;

    public BookIncomeOutcome(List<Book> books, List<Employee> employees) {

        this.books = books;
        this.employees = employees;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double sumBookExpenses(){
        double sum =0;
        for (var book : books) {
            sum += book.price() * book.getRequestedCount();
        }
        return sum;
    }

    public double sumBookIncome(){
        double win = 0;
        for ( var book :  books){

            win += book.calculateBookIncome();
        }
        return win;
    }

    public void SumSalary(){
        double bonus = 0;
        double managerBonus=0;

        for(var employee : employees){
            double brute = employee.getSalary();
            bonus += brute;
        }
        double tmp = sumBookIncome() - (sumBookExpenses() + bonus);
        if ( tmp > 0) {
            managerBonus += tmp;
            var printManagerBonus = String.format("Managers should divide %.2f between them", managerBonus);
            System.out.println(printManagerBonus);
        }
        var PrintRegular = String.format("Salary expenses are :  %.2f", bonus);
        System.out.println(PrintRegular);
    }


    @Override
    public String toString() {
        return "BookIncomeOutcome{" +
                "books=" + books +
                ", employees=" + employees +
                '}';
    }
}
