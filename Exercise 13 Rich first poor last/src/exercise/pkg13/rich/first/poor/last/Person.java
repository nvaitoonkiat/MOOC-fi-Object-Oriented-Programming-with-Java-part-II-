/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg13.rich.first.poor.last;

import java.util.ArrayList;

/**
 *
 * @author vaitnx
 */
public class Person implements Comparable<Person> {
     private String name;
            private ArrayList<Account> accounts;

            public Person(String name) {
                this.name = name;
                this.accounts = new ArrayList<Account>();
            }

            public void addAccount(Account account) {
                this.accounts.add(account);
            }

            public int moneyTotal() {
                int total = 0;
                for (Account account: this.accounts) {
                    total += account.getBalanceAsCents();
                }

                return total;
            }
            public int compareTo(Person person) {
                return this.moneyTotal() - person.moneyTotal();
            }

            @Override
            public String toString() {
                return "Person{" + "name=" + name + ", accounts=" + accounts + '}';
            }

}
