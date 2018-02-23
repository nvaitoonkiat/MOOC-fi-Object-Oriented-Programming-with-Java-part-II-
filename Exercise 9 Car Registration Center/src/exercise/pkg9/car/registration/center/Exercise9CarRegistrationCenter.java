/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg9.car.registration.center;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class Exercise9CarRegistrationCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate plate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(plate)) {
            finnish.add(plate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found
        
        VehicleRegister reg4 = new VehicleRegister();
        reg4.add(reg1, "NEIL");
        reg4.add(reg2, "AEW");
        reg4.add(reg1, "NELLLY");
        System.out.println(reg4.get(reg1));
        reg4.delete(reg1);
        System.out.println(reg4.get(reg1));
    }
                
    
    
}
