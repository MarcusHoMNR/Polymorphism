import objects.BlackAndWhitePrinter;
import objects.ColorPrinter;

public class printerService {
    public static void main (String arg[]) {
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.setColor("blue");
        colorPrinter.printing();
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();
        blackAndWhitePrinter.setIsblack(true);
        blackAndWhitePrinter.printing();
    }
}
