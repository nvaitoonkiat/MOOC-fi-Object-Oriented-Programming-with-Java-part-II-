/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg26.phone.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author vaitnx
 */
public class PhoneBook implements UserInterface{
    private final Set<Person> phoneBook;
    private final Scanner read;
    private String name; 
    public PhoneBook(Scanner input) {
        this.phoneBook = new HashSet<>();
        this.read = input;
        
    }
    
    @Override
    public void start() {
        while(true){
        printStatements();
        int input1 = this.read.nextInt();
        this.read.nextLine();
        switch(input1){
            case 1: addNumber(); continue;
            case 2: searchNumber();continue;
            case 3: searchPersonByNumber();continue;
            case 4: addAddress();continue;
            case 5: searchForPersonalInformation();continue;
            //case 6: 
            //case 7:
            case 8: break;
            default: break;
        }
        
        }
        
    }
    public void printStatements(){
        System.out.println("phone search");
        System.out.println("available operations");
        System.out.println("1 add a number");
        System.out.println("2 search for number");
        System.out.println("3 search for person by number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal info");
        System.out.println("6 delete personal info");
        System.out.println("7 filtered listing");
        System.out.println("8 quit");
    }
    
    public void addNumber(){
        String input, number; 
        System.out.println("Whose number: ");
        input = this.read.nextLine().trim();
        System.out.println("Number:");
        number = this.read.nextLine().trim();
        this.phoneBook.add(new Person(input));
        for(Person per : this.phoneBook){
            if(input.equals(per.getName())){
                per.addNumber(number);
                break;
            }
            System.out.println("not found");
        }
    }
    public void searchNumber(){
        String input, number; 
        System.out.println("Whose number: ");
        input = this.read.nextLine().trim();
        for(Person per : this.phoneBook){
            if(input.equals(per.getName())){
                System.out.println(per.getNumber());
            }
            System.out.println("not found");
        }
    }
    public void searchPersonByNumber(){
        String input, number; 
        System.out.println("number: ");
        input = this.read.nextLine().trim();
        if(ifPersonExists(input)){
            for(Person per : this.phoneBook){
                for(String str : per.getNumber()){
                    if(input.equals(str)){
                        System.out.println(per.getName());
                        break;
                    }
                }
            }
        }
    }
    public void addAddress(){
        String input, street, city; 
        System.out.println("Whose address: ");
        input = this.read.nextLine().trim();
        System.out.println("Street: ");
        street = this.read.nextLine().trim();
        System.out.println("City: ");
        city = this.read.nextLine().trim();
        if(ifPersonExists(input)){ //check if person already exists
            for(Person per : this.phoneBook){
              if(per.getName().equals(input)){
                  per.editAddress(street, city);
              }
            }  
        }
        else{
            this.phoneBook.add(new Person(input,street,city));
        }
    }
    
    public void searchForPersonalInformation(){
        String input, street, city; 
        System.out.println("Whose info: ");
        input = this.read.nextLine().trim();
        if(ifPersonExists(input)){
            for(Person per : this.phoneBook){
                  if(input.equals(per.getName())){
                      System.out.println(per.getNumber());
                      System.out.println(per.getStreet()+ " " + per.getCity());
                  }
            }
        }
        else{
            System.out.println("Not found");
        }
    }
    
    public void deletePerson(){
        String input; 
        System.out.println("Whose info: ");
        input = this.read.nextLine().trim();
        
    }
    public boolean ifPersonExists(String name){
        for(Person per : this.phoneBook){
            if(name.equals(per.getName())){
                return true;
            }
        }
        return false;
    }
    
}// end class
