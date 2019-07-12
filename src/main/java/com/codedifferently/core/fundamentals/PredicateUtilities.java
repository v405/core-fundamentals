package com.codedifferently.core.fundamentals;


public class PredicateUtilities {
    public Boolean isGreaterThan(int x, int y) {
        if (x > y) {
            return true;
        }
        return false;
    }
    //
    public Boolean isLessThan(int x, int y) {
        if (x < y) {
            return true;
        }
        return false;
    }

    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        if (x >= y) {
            return true;
        }
        return false;
    }

    public Boolean isLessThanOrEqualTo(int x, int y) {
        if (x <= y) {
            return true;
        }
        return false;
    }

    public Boolean returnTrue() {
        return true;
    }

    public Boolean returnFalse() {
        return false;
    }

}