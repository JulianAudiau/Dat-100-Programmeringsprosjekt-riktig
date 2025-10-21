package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        // Tester oppgave a)
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // Tester oppgave b)
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // Tester oppgave c)
        double powerUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("Den totale strømforbruken for hele dagen er " + powerUsage + " kWh");
        System.out.println();

        //tester oppgave d)
        double totalpris = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("Den totale prisen for dagen er %.2f NOK %n", totalpris);
        System.out.println();



        // Tester oppgave e og f)
        double strømStøtte = DailyPower.computePowerSupport(powerusage_day,powerprices_day);
        System.out.printf("Den totale strømstøtten for dagen er %.2f NOK %n", strømStøtte);
        System.out.println();


        //Tester oppgave g
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("Med NorgePris betaler du " + norgesPris + " NOK");
        System.out.println();

        //Tester oppgave h
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("Det største strømforbruket i løpet av dagen var " + peakUsage + "kWh");
        System.out.println();

        // Tester oppgave i
        double avgPower = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("Det gjennomsnittlige strømforbruket var %.2f kWh",avgPower);




        /* Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
