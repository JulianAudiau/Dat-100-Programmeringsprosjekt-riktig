package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(5);

        Customer c1 = new Customer(1, "Ola Nordmann", PowerAgreementType.STANDARD);
        Customer c2 = new Customer(2, "Kari Nordmann", PowerAgreementType.GREEN);
        Customer c3 = new Customer(3, "Per Hansen", PowerAgreementType.STANDARD);

        // d)
        System.out.println("Legger til c1: " + customers.addCustomer(c1)); // true
        System.out.println("Legger til c2: " + customers.addCustomer(c2)); // true
        System.out.println("Legger til c3: " + customers.addCustomer(c3)); // true

        // b)
        System.out.println("Antall kunder: " + customers.countNonNull()); // 3

        // c)
        Customer hentet = customers.getCustomer(2);
        System.out.println("Hentet kunde med id 2: " + (hentet != null ? hentet.getName() : "Ikke funnet"));

        // e)
        Customer fjernet = customers.removeCustomer(1);
        System.out.println("Fjernet kunde: " + (fjernet != null ? fjernet.getName() : "Ikke funnet"));

        System.out.println("Antall kunder etter fjerning: " + customers.countNonNull());

        // f)
        System.out.println("Alle kunder i tabellen:");
        for (Customer c : customers.getCustomers()) {
            if (c != null) {
                System.out.println(c.getId() + ": " + c.getName() + " (" + c.getAgreement() + ")");
            } else {
                System.out.println("null");
            }
        }

        // teste antall kunder
        Customer c4 = new Customer(4, "Anne Olsen", PowerAgreementType.GREEN);
        Customer c5 = new Customer(5, "Jonas Berg", PowerAgreementType.STANDARD);
        Customer c6 = new Customer(6, "Lise Nilsen", PowerAgreementType.STANDARD);

        System.out.println("Legger til c4: " + customers.addCustomer(c4)); // true
        System.out.println("Legger til c5: " + customers.addCustomer(c5)); // true
        System.out.println("Legger til c6 (for mye): " + customers.addCustomer(c6)); // false

        System.out.println("Antall kunder til slutt: " + customers.countNonNull());
    }
}