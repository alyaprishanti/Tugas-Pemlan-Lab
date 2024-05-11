package Interface;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices1 = {
            new Invoice("Mentos", 10, 5),
            new Invoice("Stabilo", 7, 20),
            new Invoice("Lanyard", 5, 30),
            new Invoice("Map", 15, 10)
        };
        Invoice[] invoices2 = {
            new Invoice("Buku", 7, 25),
            new Invoice("Pulpen", 10, 10),
            new Invoice("HVS", 50, 3),
            new Invoice("Paper Clip", 15, 3),
            new Invoice("Sticky Note", 5, 20)
        };

        Employee[] employees = {
            new Employee(1, "Abdi", 5000, invoices1),
            new Employee(2, "Budi", 6000, invoices2)
        };
        for(int i = 0; i < employees.length; i++){
            System.out.println("========= INFORMASI KARYAWAN " + (i+1) + " =========");
            System.out.println("Nomor Registrasi\t: " + employees[i].getRegistrationNumber() + "\nNama\t\t\t: " + employees[i].getName() + "\nGaji per Bulan\t\t: " + employees[i].getSalaryPerMonth());
            System.out.println("========= DETAIL BELANJA =========");
            Invoice[] invoices = employees[i].getInvoices();
            for (int j = 0; j < invoices.length; j++){
                System.out.println("Nama Produk\t: " + invoices[j].getProductName() + "\nJumlah\t\t: " + invoices[j].getQuantity() + "\nHarga per Item\t: " + invoices[j].getPricePerItem() + "\nTotal\t\t: " + invoices[j].getPayableAmount() + "\n--------------------------");
            }
            System.out.println("Total Invoice: "+ employees[i].getTotal() +"\nTotal Gaji setelah Dipotong Invoice: " + employees[i].getPayableAmount() + "\n");
        }
    }    
}
