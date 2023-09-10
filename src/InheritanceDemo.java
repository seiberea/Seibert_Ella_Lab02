import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<Worker>();
        Worker w1 = new Worker("000001", "Billy", "Bob", "Mr.", 2001, 31.50);
        Worker w2 = new Worker("000002", "Drew", "Gooden", "Mr.", 1993, 35.00);
        Worker w3 = new Worker("000003", "Danny", "Gonzalez", "Mr.", 1994, 30.00);
        SalaryWorker sw1 = new SalaryWorker("000004", "Ella", "Seibert", "Ms.", 2004, 55000);
        SalaryWorker sw2 = new SalaryWorker("000005", "Jarvis", "Johnson", "Mr.", 1992, 50000);
        SalaryWorker sw3 = new SalaryWorker("000006", "Nakey", "Jakey", "Mr.", 1994, 45000);

        workerList.add(w1);
        workerList.add(w2);
        workerList.add(w3);
        workerList.add(sw1);
        workerList.add(sw2);
        workerList.add(sw3);

        System.out.println("Weekly Pay Per Worker");
        System.out.println("\n======================================================================================");
        System.out.printf("\n%-25s%-25s%-25s%-6s", "Formal Name", "Week 1 Pay", "Week 2 Pay", "Week 3 Pay");
        System.out.println("\n======================================================================================");


        for (Worker w : workerList) {
            System.out.printf("\n%-25s%-25.2f%-25.2f%-6.2f", w.formalName(), w.calculateWeeklyPay(40.0),
                    w.calculateWeeklyPay(50.0), w.calculateWeeklyPay(40.0));
        }
    }
}