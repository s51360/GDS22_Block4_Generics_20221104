package org.campus02.thenewsocialmedia;

public class MayBeCreditCardNumber {
    private String creditCardNumber;
    // private AccessRoles neededAccessRole;

    public MayBeCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        // this.neededAccessRole = AccessRoles.ExternalUser;
    }

    public void deliverValue(AccessRoles accesor) {
        /*
        if (accesor == AccessRoles.Platform) {
            System.out.println(creditCardNumber);
        }
        else if (accesor == AccessRoles.ExternalUser) {
            System.out.println("forbidden");
        }
        else if (accesor == AccessRoles.RegisteredCustomer) {
            System.out.println("forbidden");
        }
        else if (accesor == AccessRoles.BestFriend) {
            System.out.println("forbidden");
        }
        else if (accesor == AccessRoles.Self) {
            System.out.println(creditCardNumber);
        }
        else {
            System.out.println("forbidden");
        }
        */

        switch (accesor) {
            case Platform:
            case Self:
                System.out.println(creditCardNumber);
                break;
            case ExternalUser:
            case RegisteredCustomer:
            case BestFriend:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed");
        }

        // Bei Klausur wäre das eher für einen 1er, ansonsten kann man auch mit if implementieren
    }
}
