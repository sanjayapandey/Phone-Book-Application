/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonebook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author syanjo
 */
public class AddInformation {

    Scanner input = new Scanner(System.in);
    static ArrayList<InformationHolder> arrayOfInformationHolder = new ArrayList<>();
    InformationHolder informationHolder = null;

    String getName() {
        String name;
        System.out.println("Enter Name:");
        name = input.nextLine();
        return name;


    }

    String getPhoneNumber() {
        String phoneNumber;
        System.out.println("Enter PhoneNumber");
        phoneNumber = input.nextLine();
        return phoneNumber;

    }

    void addIntoArray() {
        this.getName();
        this.getPhoneNumber();
        informationHolder = new InformationHolder(this.getName(), this.getPhoneNumber());
        arrayOfInformationHolder.add(informationHolder);

    }
}
