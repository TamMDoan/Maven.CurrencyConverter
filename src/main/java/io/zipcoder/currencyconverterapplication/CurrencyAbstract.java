package io.zipcoder.currencyconverterapplication;

public abstract class CurrencyAbstract implements ConvertableCurrency {
    /*
     * Made a new abstract class because all our currencies will have
     * a String name & CurrencyType currencyType variables.
     * Plus the convert() and getName() methods would be repeated
     * for all the different currencies we have. Might as well just
     * write it once and have the currencies extend this class.
     */
    protected String name;
    protected CurrencyType currencyType;

    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.currencyType.getRate();
    }
    public String getName(){
        return this.name;
    }
}
