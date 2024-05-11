package Interface;

public class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee (int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotal();
    }

    public double getTotal(){
        double total = 0;
        for (int i = 0; i < invoices.length; i++){
            total += invoices[i].getPayableAmount();
        }
        return total;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

}
