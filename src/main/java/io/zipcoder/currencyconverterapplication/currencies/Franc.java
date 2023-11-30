package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc extends CurrencyAbstract {
    public Franc(){
        this.name = "FRANC";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
