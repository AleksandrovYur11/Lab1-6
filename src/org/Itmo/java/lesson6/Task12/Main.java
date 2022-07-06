package org.Itmo.java.lesson6.Task12;

public class Main {
    public static void main(String[] args) {
        Client clientBank = new Client("Денис", "Столяров", "РосБанк", 167L);
        clientBank.showHumanInfo();
        clientBank.showCardInfo();
        System.out.println("");
        BankEmployee bankEmployee = new BankEmployee("Давид", "Когония", "ВолгаБанк", 314454552L);
        bankEmployee.showHumanInfo();
        bankEmployee.showCardInfo();
        System.out.println("");
        Human humanClient = new Client("Юра", "Иванов", "БобрБанк", 241L);
        humanClient.showHumanInfo();
        ((Client) humanClient).showCardInfo();
        System.out.println("");
        Human humanBankEmployee = new BankEmployee("Иван", "Литвинов", "СоснаБанк", 32423L);
        humanBankEmployee.showHumanInfo();
        ((BankEmployee) humanBankEmployee).showCardInfo();


    }
}
