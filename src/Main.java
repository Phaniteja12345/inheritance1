import java.util.Scanner;

class person{
    public String surname;
    public String firstname;
    public String street;
    public String zipCode;
    public String city;

    public void initialize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter surname: ");
        this.surname = sc.nextLine();
        System.out.println("enter firstname: ");
        this.firstname = sc.nextLine();
        System.out.println("enter street: ");
        this.street = sc.nextLine();
        System.out.println("enter zipcode: ");
        this.zipCode = sc.nextLine();
        System.out.println("enter city: ");
        this.city = sc.nextLine();

    }

    public void print(){

        System.out.println("surname:-"+ surname);
        System.out.println("firstname:-"+ firstname);
        System.out.println("street:-"+ street);
        System.out.println("zipcode:-"+ zipCode);
        System.out.println("city:-"+ city);

    }

}

class staff extends person{
    public String education;
    public String position;

    @Override
    public void initialize() {
        super.initialize();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter education: ");
        this.education = sc.nextLine();
        System.out.println("enter position: ");
        this.position = sc.nextLine();


    }

    @Override
    public void print() {
        super.print();

        System.out.println("education:-"+ education);
        System.out.println("position:-"+ position);


    }
}

public class Main{
    public static void main(String[] args){

        staff a = new staff();
        a.initialize();
        a.print();




    }

}




