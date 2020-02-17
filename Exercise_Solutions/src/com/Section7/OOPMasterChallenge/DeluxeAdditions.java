package com.Section7.OOPMasterChallenge;

import java.math.BigDecimal;

class DeluxeAdditions extends Additions {

    public DeluxeAdditions(DeluxeAdditionType additionType) {
        this.additionType = additionType;
    }

    public enum DeluxeAdditionType { Chips("Chips"), Drinks("Drinks");
    private String action;

        public String getAction() {
            return action;
        }

        DeluxeAdditionType(String action) {
            this.action = action;
        }
    };


    private DeluxeAdditionType additionType;


    @Override
    public String toString(){
        return additionType.getAction();
    }

    @Override
    public double getPrice() {
        switch (additionType) {
            case Chips:
                return 2.0;
            case Drinks:
                return 2.5;
            default:
                return 0;
        }
    }
}
