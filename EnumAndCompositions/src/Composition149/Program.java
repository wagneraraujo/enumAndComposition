package Composition149;

import Composition149.Entities.Departament;
import Composition149.Entities.HourContract;
import Composition149.Entities.Worker;
import Composition149.Enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Entre com o nome do departamento");
        String departamentName = sc.nextLine();
        System.out.println();
        System.out.print("Entre com a data do trabalho");
        System.out.println();
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
        System.out.print("Quantos contratos esse trabalhodor fez? ");

        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Entre com o numero do contrato " + i + "data ");
            System.out.print("entre com a data dd/mm/yyyy ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao hora: ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Entre  com mes e ano para calcular");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: "+ worker.getName());
        System.out.println("Departamento: " + departamentName);
        System.out.println("Incomoe for" + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));


        sc.close();
    }
}
