package org.Itmo.java.lesson6.Task12;


public class Client extends Human implements BankCard {
    protected String nameBank;
    protected Long numberCard;


    public Client(String name, String surName, String nameBank, Long numberCard) {
        super(name, surName);
        this.nameBank = nameBank;
        this.numberCard = numberCard;
    }

    public Client(String name, String surName) {
        super(name, surName);
    }

    public void showHumanInfo() {
        System.out.println("Имя клиента: " + getName());
        System.out.println("Фамилия клиента: " + getSurName());
    }

    @Override
    public void showCardInfo() {
        System.out.println("Карта из банка: " + nameBank);
        System.out.println("Номер карты клиента банка: " + numberCard);

    }
}