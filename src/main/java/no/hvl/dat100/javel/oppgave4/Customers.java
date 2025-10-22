package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        // Initialiserer arrayen med ønsket størrelse
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;
        for (Customer c : customers) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {
        for (Customer c : customers) {
            if (c != null && c.getid() == customer_id) { // forutsetter at Customer har getId()
                return c;
            }
        }
        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }
        return false; // ingen ledig plass
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getId() == customer_id) {
                Customer removed = customers[i];
                customers[i] = null; // fjerner referansen
                return removed;
            }
        }
        return null; // finnes ikke
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {
        return customers;
    }
}