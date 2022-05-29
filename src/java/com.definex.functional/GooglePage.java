package com.definex.functional;

import driver.Driver;

public class GooglePage {
    public void goTo() {
        Driver.goTo(Constants.google_url);
    }

    public boolean isAt() {
        return Driver.title().equals(Constants.google_title);
    }
}
