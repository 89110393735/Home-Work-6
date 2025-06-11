package ru.netology.javaqa.javaqamvn.service;


public class MonthService {

    public long totalSale(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {

        return totalSale(sales) / 12;

    }

    public int monthMaxSale(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthaboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }

}


