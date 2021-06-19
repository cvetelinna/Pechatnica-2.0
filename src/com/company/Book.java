package com.company;

public class Book extends Order{
    private String title;
    private int pageCount;
    private Format format;
    private TypeOfPaper typeOfPaper;


    public Book(int requestedCount, String title, int pageCount, Format format, TypeOfPaper typeOfPaper) {
        super(requestedCount);
        this.title = title;
        this.pageCount = pageCount;
        this.format = format;
        this.typeOfPaper = typeOfPaper;


    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Format getFormat() {
        return format;
    }

    public TypeOfPaper getTypeOfPaper() {
        return typeOfPaper;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", format=" + format +
                ", typeOfPaper=" + typeOfPaper +
                '}';
    }

    public double price() {

        return (this.format.getFormatValue() + this.typeOfPaper.getNumVal()) * this.pageCount;
    }

    public double calculateBookIncome(){
        double  increaseInPrice = price() * 1.4;
        return increaseInPrice * getRequestedCount();
    }
}
