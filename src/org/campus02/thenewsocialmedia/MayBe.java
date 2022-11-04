package org.campus02.thenewsocialmedia;

public class MayBe<T> {
    private T value;
    // private AccessRoles neededAccessRole;

    public MayBe(T value) {
        this.value = value;
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
                System.out.println(value);
                break;
            case ExternalUser:
            case RegisteredCustomer:
            case BestFriend:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed"); //jenes was wir nicht mit case abgebildet haben, fangen wir bei defualt ab
        }

        // Bei Klausur wäre das eher für einen 1er, ansonsten kann man auch mit if implementieren
    }
}
