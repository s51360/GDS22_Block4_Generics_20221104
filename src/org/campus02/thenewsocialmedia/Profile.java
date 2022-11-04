package org.campus02.thenewsocialmedia;

public class Profile {
    private String eMail;
    private int age;
    private String fullname;
    private MayBe<String> creditCardNumber;
    private MayBe<Double> salary;

    // bei generics brauchen wir referenzdatentypen ... primtive gehen nicht, deswegen markiert er double rot
    // bei primitiv müsste man Double großes D schreiben - eine WrapperKlasse von double -> also Double für primitive

    private Profile bestFriend;

    public Profile(String eMail, int age, String fullname, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullname = fullname;
        this.creditCardNumber = new MayBe<String>(creditCardNumber);
        this.salary = new MayBe<Double>(salary);
    }

    public void printPublicPage(AccessRoles role) {
        System.out.println("My profile");
        System.out.println("eMail = " + eMail);
        if (role == AccessRoles.BestFriend || role == AccessRoles.Self) {
            System.out.println("age = " + age);
        }

        System.out.println("fullname = " + fullname);

//        if (role == AccessRoles.Platform || role == AccessRoles.Self) {
//            System.out.println("creditCardNumber = " + creditCardNumber);
//        }

        creditCardNumber.deliverValue(role);

        System.out.println("salary = " + salary);
        System.out.println("bestFriend = " + bestFriend);
    }

    public void setBestFriend(Profile bestFriend) {
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", bestFriend=" + bestFriend +
                '}';
    }
}
