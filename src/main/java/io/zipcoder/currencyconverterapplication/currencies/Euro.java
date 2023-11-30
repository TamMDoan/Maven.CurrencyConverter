package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro extends CurrencyAbstract {
    public Euro(){
        this.name = "EURO";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
