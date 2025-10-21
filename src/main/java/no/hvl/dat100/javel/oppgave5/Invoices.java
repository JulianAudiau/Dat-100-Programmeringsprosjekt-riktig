package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {
        Invoice [] nyeInvoices = new Invoice[3];
        Customer customer1 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);
        Customer customer2 = new Customer("Julian Audiau", "julian@example.com", 3112, PowerAgreementType.POWERSUPPORT);
        Customer customer3 = new Customer("Katharina Busntes", "katharina@example", 5015,PowerAgreementType.POWERSUPPORT);

        nyeInvoices[0] = new Invoice(customer1, "January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        nyeInvoices[1] = new Invoice(customer2, "January", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        nyeInvoices[2] = new Invoice(customer3, "January", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        for(Invoice invoice : nyeInvoices){
        invoice.computeAmount();
        invoice.printInvoice();
        }
    }







     


    }

