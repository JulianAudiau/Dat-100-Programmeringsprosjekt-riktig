package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {
//a
    public static void print_PowerUsage(double[][] usage) {
        for (int day = 0; day < usage.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            for (int hour = 0; hour < usage[day].length; hour++) {
                System.out.printf("%.2f kWh ", usage[day][hour]);
            }

            System.out.println();
        }
    }
//b
    public static void print_PowerPrices(double[][] prices) {
        for (int day = 0; day < prices.length; day++) {
            System.out.print("Day " + (day + 1) + ":");

            for (int hour = 0; hour < prices[day].length; hour++) {
                System.out.printf("%.2f NOK ", prices[day][hour]);
            }

            System.out.println();
        }
    }
    //c
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                sum += usage[day][hour];
            }
        }

        return sum;
    }
//d
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        double usage = 0;

        for (int day = 0; day < powerusage.length; day++) {
            for (int hour = 0; hour < powerusage[day].length; hour++) {
                usage += powerusage[day][hour];
            }
        }

        boolean exceeded = usage > threshold;

        return exceeded;
    }

    // e
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                price += usage[day][hour] * prices[day][hour];
            }
        }

        return price;
    }

    // f
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double supportThreshold = 0.70;
        double supportRate = 0.90;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                double price = prices[day][hour];

                if (price > supportThreshold) {
                    double diff = price - supportThreshold;
                    double hourlySupport = diff * supportRate * usage[day][hour];
                    support += hourlySupport;
                }
            }
        }

        return support;
    }

    // g
    public static double computeNorgesPrice(double[][] usage) {

        double sum = 0;
        int count = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                sum += usage[day][hour];
                count++;
            }
        }

        double price = sum / count;

        return price;
    }
