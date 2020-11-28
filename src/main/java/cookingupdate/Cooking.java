package cookingupdate;

import static cookingupdate.MeasurementType.G;
import static cookingupdate.MeasurementType.ML;

public enum Cooking {

/*
1 TSP = 5 ML
1 TBSP = 15 ML
1 FL OUNCE = 30 ML
1 CUP = 237 ML
1 PINT (2 CUPS) = 473 ML
1 QUART (4 CUPS) =0.95 LITER
1 GALLON (16 CUPS) = 3.8 LITERS
1 OZ = 28 GRAMS
1 POUND = 454 GRAMS
 */


    TSP(5, ML),
    TBSP(15, ML),
    FL_OUNCE(30, ML),
    CUP(237, ML),
    PINT(473, ML),
    QUART(950, ML),
    GALLON(3800, ML),
    OZ(28, G),
    POUND(454, G);



    private final int ml;
    private final MeasurementType type;

    Cooking(int ml, MeasurementType type) {
        this.ml = ml;
        this.type = type;
    }

    public int getMl() {
        return ml;
    }

    public MeasurementType getType() {
        return type;
    }
}


