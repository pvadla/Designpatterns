package structural.adapter;


import structural.adapter.thirdparty.ICICIBank;

public class ICICIBankAdapter implements BankAPI {
    ICICIBank ib = new ICICIBank();

    @Override
    public int balance() {

        return ib.getBalance();
    }

    @Override
    public void addMoney(int x) {

        ib.doDeposit(x);
    }

    @Override
    public void remMoney(int x) {

        ib.doWithdraw(x);
    }
}
