package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar extends CurrencyAbstract {
    public CanadianDollar(){
        this.name = "CANADIAN_DOLLAR";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
