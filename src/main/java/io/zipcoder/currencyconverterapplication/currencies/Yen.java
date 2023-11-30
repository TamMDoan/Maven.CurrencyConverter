package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen extends CurrencyAbstract {
    public Yen(){
        this.name = "YEN";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
