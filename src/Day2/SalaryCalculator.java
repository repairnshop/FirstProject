package Day2;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 10000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(stateTaxRate +"\n" + federalTaxRate +"\n"+ salary +"\n"+ stateTax +"\n"+ federalTax +"\n"+ totalTax +"\n"+ salaryAfterTax);

        }

    }

