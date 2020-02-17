package com.Section7;

public class Bed {

    public Dimension getBedDimensions() {
        return bedDimensions;
    }

    public void setBedDimensions(Dimension bedDimensions) {
        this.bedDimensions = bedDimensions;
    }

    private Dimension bedDimensions;
    private String material;
    private BedSheets sheets;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BedSheets getSheets() {
        return sheets;
    }

    public void setSheets(BedSheets sheets) {
        this.sheets = sheets;
    }

    public Bed(Dimension bedDimensions, String material, BedSheets sheets) {
        this.bedDimensions = bedDimensions;
        this.material = material;
        this.sheets = sheets;
    }
}
