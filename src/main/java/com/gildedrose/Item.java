package com.gildedrose;

public class Item {

    private static final int MIN_QUALITY = 0;

    private static final int MAX_QUALITY = 50;

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre del ítem no puede ser vacío.");
        }
        if (quality < MIN_QUALITY || quality > MAX_QUALITY) {
            throw new IllegalArgumentException(
                    "La calidad debe estar entre " + MIN_QUALITY + " y " + MAX_QUALITY + ".");
        }
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        if (quality < MIN_QUALITY || quality > MAX_QUALITY) {
            throw new IllegalArgumentException(
                    "La calidad debe estar entre " + MIN_QUALITY + " y " + MAX_QUALITY + ".");
        }
        this.quality = quality;
    }

    public void increaseQuality() {
        if (this.quality < MAX_QUALITY)
            this.quality++;
    }

    public void decreaseQuality() {
        if (this.quality > MIN_QUALITY)
            this.quality--;
    }

    public void decreaseSellIn() {
        this.sellIn--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
