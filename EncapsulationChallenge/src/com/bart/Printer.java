package com.bart;

/**
 * Created by bartziemba on 27/09/2017.
 */
public class Printer {

    private int tonerLevel = 80;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        if (tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }


    public int fillUpToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
           if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel = tonerLevel + tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printingPage(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = pagesToPrint / 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted = pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public Printer(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
