public class Worker extends Person {

    private double hourlyPayRate;



    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;


    }

    //public String toCSV(){ return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;}

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        } else {
            return (hoursWorked - 40.0) * 1.5 + (hourlyPayRate * 40.0);
        }
    }

    public String displayWeeklyPay(double hoursWorked) {

        double regularHours;
        double regularPay;
        double overtimeHours = 0.0;
        double overtimePay = 0.0;

        if (hoursWorked > 40) {
            regularHours = 40.0;
            overtimeHours = hoursWorked - 40.0;
            regularPay = hourlyPayRate * 40.0;
            overtimePay = (overtimeHours * 40.0) * 1.5;



        } else {

            regularHours = hoursWorked;
            regularPay = hourlyPayRate * hoursWorked;

        }

    return "Worked " + regularHours + " hours and was payed $" + regularPay + ". \n " +
            "Worked " + overtimeHours + " overtime hours and was payed $" + overtimePay + "in overtime pay. \n " +
            "Worked " + (overtimeHours + regularHours) + "hours in total and was payed $" + (overtimePay + regularPay) + "total.";

    }


}
