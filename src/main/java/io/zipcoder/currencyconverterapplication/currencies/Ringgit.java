package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit extends CurrencyAbstract {
    public Ringgit(){
        this.name = "RINGGIT";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
