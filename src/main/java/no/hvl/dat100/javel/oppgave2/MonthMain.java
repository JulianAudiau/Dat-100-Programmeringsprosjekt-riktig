package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // --- a) Test print_PowerUsage ---
        System.out.println("=== Test a) print_PowerUsage ===");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        // --- b) Test print_PowerPrices ---
        System.out.println("=== Test b) print_PowerPrices ===");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        // --- c) Test computePowerUsage ---
        System.out.println("=== Test c) computePowerUsage ===");
        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("Total power usage for the month: %.2f kWh%n", totalUsage);
        System.out.println();

        // --- d) Test exceedThreshold ---
        System.out.println("=== Test d) exceedThreshold ===");
        double threshold = 120.0; // Juster etter realistisk nivå
        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, threshold);
        System.out.printf("Threshold of %.1f kWh exceeded: %b%n", threshold, exceeded);
        System.out.println();

        // --- e) Test computeSpotPrice ---
        System.out.println("=== Test e) computeSpotPrice ===");
        double totalSpotPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.printf("Total spot price for the month: %.2f NOK%n", totalSpotPrice);
        System.out.println();

        // --- f) Test computePowerSupport ---
        System.out.println("=== Test f) computePowerSupport ===");
        double support = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("Total power support for the month: %.2f NOK%n", support);
        System.out.println();

        // --- g) Test computeNorgesPrice ---
        System.out.println("=== Test g) computeNorgesPrice ===");
        double norgesPrice = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("Norgespris (average hourly consumption): %.3f kWh%n", norgesPrice);
        System.out.println();
    }
}