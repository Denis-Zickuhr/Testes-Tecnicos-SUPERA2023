package Challenge02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MinChangeGenerator {

    /**
     * Currency map stores all possible types/values of coins, it utilizes Integer to avoid float conversion errors
     **/
    private final int[] currency_map = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

    public int[] getChange(double value) {

        /* Inner value, is a reflex of passed value, but multiplied by one hundred */
        int inner_value = (int) Math.round(value * 100);

        int[] currencyUsage = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        /* define an index capping for reducing iterations */
        int indexCapping = 0;

        while (inner_value > 0) {
            for (int i = indexCapping; i < currency_map.length; i++) {
                if (inner_value - currency_map[i] >= 0) {
                    inner_value -= currency_map[i];
                    currencyUsage[i]++;
                    break;
                } else {
                    indexCapping = i;
                }
            }
        }
        return currencyUsage;
    }

    public String getCoins(double value) {
        int[] currencyUsage = getChange(value);
        StringBuilder sb = new StringBuilder();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("0.00", decimalFormatSymbols);
        sb.append("Notas: \n");
        int notes_quantity = 6;
        for (int i = 0; i < notes_quantity; i++) {
            sb.append(String.format("%d nota(s) de R$ %s \n", currencyUsage[i], decimalFormat.format(currency_map[i] / 100f)));
        }
        sb.append("Moedas: \n");
        int coins_quantity = 6;
        for (int i = notes_quantity; i < coins_quantity + notes_quantity; i++) {
            sb.append(String.format("%d moedas(s) de R$ %s \n", currencyUsage[i], decimalFormat.format(currency_map[i] / 100f)));
        }
        return sb.toString();
    }
}
