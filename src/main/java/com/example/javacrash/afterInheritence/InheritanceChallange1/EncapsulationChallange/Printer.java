package com.example.javacrash.afterInheritence.InheritanceChallange1.EncapsulationChallange;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        tonerLevel += tonerAmount;
        if ((tempAmount > 100) || (tempAmount < 0)) return -1;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
