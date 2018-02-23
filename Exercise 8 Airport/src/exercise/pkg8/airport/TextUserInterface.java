/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8.airport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class TextUserInterface {
    private final Scanner read;
    private final Airport JFK;
    private final ArrayList<Airplane> planeInfo = new ArrayList<>();
    
    public TextUserInterface(Scanner reader, Airport JFK){
        this.read = reader;
        this.JFK = JFK;
     }
     
    public void start(){
        String input, temp;
        String planeID,depCode, destCode; int cap; 
        System.out.println("Airport Panel");
        System.out.println("--------------");
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add Airplane");
            System.out.println("[2] Add Flight");
            System.out.println("[x] Exit");
            
            input = read.nextLine().trim();
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Give Plane ID:");
                planeID = read.nextLine().trim();
                if(JFK.doesIDExist(planeID)){
                    System.out.println("ID already exists. Try again.");
                    continue;
                }
                System.out.println("Give Plane Capacity:");
                cap = read.nextInt();
                temp = read.nextLine();
                JFK.addAirplane(planeID, cap);
                continue;
            }
            else if(input.equalsIgnoreCase("2")){
                System.out.println("Give Plane ID:");
                planeID = read.nextLine().trim();
                cap = JFK.getCap(planeID);
                System.out.println("Give Departure Code:");
                depCode = read.nextLine().trim();
                System.out.println("Give Destination Code:");
                destCode = read.nextLine().trim();
                Airplane plane = new Airplane(planeID,cap,depCode,destCode);
                this.planeInfo.add(plane);
                continue;
            }
            else if(input.equalsIgnoreCase("x")){
                break;
            }
            else{
                System.out.println("Wrong command.");
                continue;
            }
        }
        System.out.println("Flight Service");
        System.out.println("--------------");
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print Planes");
            System.out.println("[2] Print Flights");
            System.out.println("[3] Print Plane Info");
            System.out.println("[x] Exit");
            
            input = read.nextLine().trim();
            if (input.equalsIgnoreCase("1")) {
                ArrayList<String> planeList = JFK.planeList();
                for(String list: planeList){
                    System.out.println(list);
                }
                continue;
            }
            else if (input.equalsIgnoreCase("2")) {
                for(Airplane plane : planeInfo){
                    System.out.println(plane.getID() + " (" + plane.getCap()
                    + "ppl) (" + plane.getDep() + "-" + plane.getDest() + ")");
                }
                continue;
            }
            else if (input.equalsIgnoreCase("3")) {
                System.out.println("Give Plane ID");
                input = read.nextLine().trim();
                
                continue;
            }
            else if (input.equalsIgnoreCase("x")) {
                break;
            }
            else{
                System.out.println("Wrong command.");
                continue;
            }
            
        }
     }
     
}
