package com.definex.functional;

import driver.Driver;

public class DfxPage {
    public void goTo() {
        Driver.goTo(Constants.dfx_url);
    }

    public boolean isAt() {
        return Driver.title().equals(Constants.dfx_title);
    }
}
