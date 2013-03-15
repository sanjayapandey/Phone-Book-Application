/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonebook;

/**
 *
 * @author syanjo
 */
public class DisplayInformation {

    String name;
    String phoneNumber;

    void displayName() {
    }

    void displayPhoneNumber() {
    }

    void displayAll() {

        for (int i = 0; i < AddInformation.arrayOfInformationHolder.size(); i++) {

            name = AddInformation.arrayOfInformationHolder.get(i).name;
            phoneNumber = AddInformation.arrayOfInformationHolder.get(i).phoneNumber;
            System.out.println("Name:" + name);
            System.out.println("Number:" + phoneNumber);


        }
    }
}
