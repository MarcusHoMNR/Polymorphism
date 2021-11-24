package objects;

public class BlackAndWhitePrinter extends Printer{

    private boolean isblack;

    public void setIsblack(boolean isblack) {
        this.isblack = isblack;
    }

    @Override
    public void printing(){
        System.out.println("Printing " + (isblack? "black" : "white") + "...");
    }
}