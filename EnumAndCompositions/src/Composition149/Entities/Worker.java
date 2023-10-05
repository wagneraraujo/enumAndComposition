package Composition149.Entities;

import Composition149.Enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private  String name;
    private WorkerLevel leve;
    private Double baseSalary;

    //lista tem que ser instanciada de imediato e não deve estar o construtor que e gerado
    private List<HourContract> contracts = new ArrayList<>();
    private WorkerLevel level;

    public Worker(){}

    //arrays (tipo listas) não  devem estar nesse constructor
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return leve;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    //add novos metodos
    public void addContract(HourContract contract){
        //add na lista de contrato
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        //add na lista de contrato
        contracts.remove(contract);
    }

    public double income(int year, int month){
        //salario base
        //quanto no mes - salario base e + contratos do
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);

            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
