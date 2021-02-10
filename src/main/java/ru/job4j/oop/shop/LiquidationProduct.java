package ru.job4j.oop.shop;

public final class LiquidationProduct extends Product {
    private Product product;
    private String name;

    public LiquidationProduct(String name, int price) {
        super(name, price);
        this.name = name;
    }

    @Override
    public int discount() {
        return 90;
    }

    @Override
    public String label() {
        return name + " " + price();
    }
}
