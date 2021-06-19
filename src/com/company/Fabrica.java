package com.company;

import java.util.List;

public class Fabrica {
    private List<Employee> employees;
    private List<Machine> machines;

    public Fabrica( List<Employee> employees, List<Machine> machines) {
        this.employees = employees;
        this.machines = machines;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Machine> getMachines(){
        return machines;
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                ", employees=" + employees +
                ", machines=" + machines +
                '}';
    }

    public void startPrinting(Book bk){
        this.machines
                .forEach(machine -> new Thread(() -> machine.print(bk)).start());
    }
}
