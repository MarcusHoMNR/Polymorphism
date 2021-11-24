package objects;

public class ColorPrinter extends Printer{
    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    @Override
    public void printing(){
        System.out.println("Printing " + color + "...");
    }
}
