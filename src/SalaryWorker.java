public class SalaryWorker extends Worker{

    private double annualSalary;


    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, (annualSalary/52.0)/40.0);
        this.annualSalary = annualSalary;

    }
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annualSalary / 52);
    }
    @Override
    public String displayWeeklyPay(double hoursWorked) {

        return "Weekly pay (fraction of annual salary): $" + (annualSalary / 52);

    }

}
