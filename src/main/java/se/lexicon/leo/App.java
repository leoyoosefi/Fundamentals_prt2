package se.lexicon.leo;

public class App 
{
    public static void main( String[] args )
    {

        Person leo = new Person();
        leo.firstName = "Leo";
        leo.lastName = "Yoosefi";
        leo.age = 30;
        leo.hobby = "Musician";
        System.out.println(leo.getInformation());



        Car volvoV40 = new Car();
        volvoV40.brand = "Volvo";
        volvoV40.color = "Dark Grey";
        volvoV40.maxSpeed = 200;
        volvoV40.registrationNumber = "abcd-123456";
        volvoV40.ownerName = "Jack Sparrow";


    }
}
