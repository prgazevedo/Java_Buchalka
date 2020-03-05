package com.prgazevedo.timbuchalka.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class BedSheets {
    private Dimension sheetDimensions;
    private String fabricType;
    private String color;

    public Dimension getSheetDimensions() {
        return sheetDimensions;
    }

    public void setSheetDimensions(Dimension sheetDimensions) {
        this.sheetDimensions = sheetDimensions;
    }

    public BedSheets(Dimension sheetDimensions, String fabricType, String color) {
        this.sheetDimensions = sheetDimensions;
        this.fabricType = fabricType;
        this.color = color;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
