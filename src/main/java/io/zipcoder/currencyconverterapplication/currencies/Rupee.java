package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee extends CurrencyAbstract {
    public Rupee(){
        this.name = "RUPEE";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
