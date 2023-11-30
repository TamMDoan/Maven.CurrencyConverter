package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency extends CurrencyAbstract {
    public UniversalCurrency(){
        this.name = "UNIVERSAL_CURRENCY";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
