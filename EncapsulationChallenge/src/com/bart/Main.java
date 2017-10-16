package com.bart;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(80, true);

        System.out.println("Initial count is " + printer.getPagesPrinted());
        int pagesPrinted = printer.printingPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new totat print count for printer " + printer.getPagesPrinted());

        pagesPrinted = printer.printingPage(10);
        System.out.println("Pages printed was " + pagesPrinted + " new totat print count for printer " + printer.getPagesPrinted());

        System.out.println("Toner level is: " + printer.fillUpToner(19));
    }
}
