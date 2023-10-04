package com.example.javacrash.afterInheritence.InheritanceChallange1.EncapsulationChallange;

public class EncapsulationChallange2 {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public EncapsulationChallange2(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel < 0) || (tonerLevel > 100)) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount < 1) || ((this.tonerLevel + tonerAmount) > 100)) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages / 2 + pages % 2;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}

