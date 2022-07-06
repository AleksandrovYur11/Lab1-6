package org.Itmo.java.lesson6.Task12;

public class BankEmployee extends Human implements BankCard {
    protected String nameBank;
    protected Long numberCard;

    public BankEmployee(String name, String surName, String nameBank, Long numberCard) {
        super(name, surName);
        this.nameBank = nameBank;
        if (numberCard.toString().length() > 6) {
            this.numberCard = numberCard;
        } else {
            this.numberCard = 0L;
            System.out.println("Данного номера карты не существует у работника банка: " + name + surName);
        }
    }

    public BankEmployee(String name, String surName) {
        super(name, surName);

    }

    public String getNameBank() {
        return nameBank;
    }

    public Long getNumberCard() {
        return numberCard;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurName() {
        return super.getSurName();
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public void setNumberCard(Long numberCard) {
        this.numberCard = numberCard;
    }

    void showHumanInfo() {
        System.out.println("Имя работника банка: " + getName());
        System.out.println("Фамилия работника банка: " + getSurName());
    }

    @Override
    public void showCardInfo() {
        System.out.println("Работник банка: " + nameBank);
        System.out.println("Номер специальной карты работника банка: " + numberCard);
    }
}
