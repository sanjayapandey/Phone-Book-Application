/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonebook;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author syanjo
 */
public class MyPhoneBook {

    public static void main(String[] args) {

        int option_;

        Scanner input = new Scanner(System.in);
        HandelDisplay handelDisplay = new HandelDisplay();
        AddInformation addInformation = new AddInformation();
        DisplayInformation displayInformation = new DisplayInformation();
        
        handelDisplay.handelHeadStyle();
        
        option_ = input.nextInt();
        
        while(option_!= 0){

        switch (option_) {
            case 1:
                // add information in to the phonebook
                String name_;
                String phoneNumber_;
                boolean haveContinue = true;

                if (haveContinue) {

                    haveContinue = false;//reset continueue
                    addInformation.addIntoArray();

                    System.out.println("Want to Enter anothere Information:?? Enter '1"
                            + " dont want to add information?? Enter '0' ");
                    haveContinue = input.nextBoolean();
                    System.out.println("have to continue:"+haveContinue);

                }
                break;

            case 2:
                // display information in the phonebook
//                displayInformation.displayName();
//                displayInformation.displayPhoneNumber();
                displayInformation.displayAll();

                break;

            case 3:
                //edit the information in the phonebook
                System.out.println("this feature is comming soon");
                break;
            default:
                System.out.println("invalid option");
        }
        
            System.out.println("Enter your option:");
        
        }
        System.out.println("Invalid Option");
        option_ = input.nextInt();
    }
}
