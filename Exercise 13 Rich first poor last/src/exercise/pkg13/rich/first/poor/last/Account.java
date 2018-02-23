/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg13.rich.first.poor.last;

/**
 *
 * @author vaitnx
 */
public class Account {
    private String accountID;
            private int balanceAsCents;

            public Account(String accountID) {
                this.accountID = accountID;
                this.balanceAsCents = 0;
            }

            public void deposit(int sum) {
                this.balanceAsCents += sum;
            }

            public int getBalanceAsCents() {
                return this.balanceAsCents;
            }
            
            @Override
            public String toString() {
                return "Account{" + "accountID=" + accountID + ", balanceAsCents=" + balanceAsCents + '}';
            }
             
}
