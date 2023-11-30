package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar extends CurrencyAbstract {
    public SingaporeDollar(){
        this.name = "SINGAPORE_DOLLAR";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
