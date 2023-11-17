package homework27.task02;

import java.time.temporal.TemporalAmount;

public class Bank {

  public String bankName;
  public String accountOwner;
  private int account;
  private double Amount;


  public Bank(String bankName, String accountOwner, int account, double Amount) {
    this.bankName = bankName;
    this.accountOwner = accountOwner;
    this.account = account;
    this.Amount = Amount;
  }
  public String getBankName() {
   return bankName;
  }
  public String getAccountOwner() {
    return accountOwner;
  }
  private int getAccount(){
        return account;
  }
  private double getAmount() {
    return Amount;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;

  }

}
