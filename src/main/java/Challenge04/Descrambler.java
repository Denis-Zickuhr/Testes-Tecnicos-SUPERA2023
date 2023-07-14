package Challenge04;

public class Descrambler {
    public String DescramblePrinterVirusEncryption(String corruptedString){
        String firstPortion = new StringBuilder(corruptedString.substring(0, corruptedString.length() / 2))
                .reverse()
                .toString()
                .stripLeading();

        String secondPortion = new StringBuilder(corruptedString.substring(corruptedString.length() / 2))
                .reverse()
                .toString()
                .stripTrailing();

        return firstPortion + secondPortion;
    }
}
