package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar extends CurrencyAbstract {
    public USDollar(){
        this.name = "US_DOLLAR";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
