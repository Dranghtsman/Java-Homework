package cookingupdate;

import java.util.Scanner;

public class Convert {

    private Cooking unit;

    public static void main(String[] args) {
        Convert convert = new Convert();
        convert.promptUnit();

        System.out.println(convert.getUnit().name()+" "+
                convert.getUnit().getMl()+"  "+
                convert.getUnit().getType().name());
    }

    public Cooking getUnit() {
        return unit;
    }


    public void promptUnit() {

        Scanner write = new Scanner(System.in);
        System.out.println("Enter one of these elements:" +
                "TSP  TBSP  FL_OUNCE  CUP  PINT  QUART  GALLON  OZ  POUND ");
        String input = write.nextLine().toUpperCase();
        while (!validate(input)) {
            System.out.println("Please enter right unit: ");
            input = write.nextLine().toUpperCase();
        }
        unit = Cooking.valueOf(input.toUpperCase());
    }


    public boolean validate(String input) {
        boolean result1 = false;
        for (Cooking s : Cooking.values())
            if (input.equalsIgnoreCase(s.name()))
                result1 = true;
        return result1;
    }
}