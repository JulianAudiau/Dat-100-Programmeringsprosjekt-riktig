package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer s1 = new Customer("Alice Smith","alice@example.com",1001,PowerAgreementType.SPOTPRICE);
        System.out.println(s1);

        Customer s2 = new Customer();
        s2.setName("Julian Audiau");
        s2.setCustomer_id(3112);
        s2.setAgreement(PowerAgreementType.POWERSUPPORT);
        s2.setEmail("julian@example.com");
        s2.skrivUt();




    }
}
