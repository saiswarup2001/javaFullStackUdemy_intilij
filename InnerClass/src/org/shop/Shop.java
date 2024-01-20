package org.shop;


public class Shop {
    public static void main(String[] args) {
        Door door = new Door();
        door.statusOfShop();
        door.getLock().setLock(false);
        door.statusOfShop();
    }
}