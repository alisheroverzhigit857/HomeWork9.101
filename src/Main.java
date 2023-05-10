public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Ulan","Java","Google");

        System.out.println("Name: "+programmer.getName()+" \nCompany Name: "+programmer.getCompanyName()+"\nDesignation: "+programmer.getDesignation());
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();

        System.out.println("---------------------------------");

        Dancing dancing = new Dancing("Bilal","Vals","Group Vals");
        System.out.println("Name: "+dancing.getName()+"\nGroup Name: "+dancing.getGroupName()+"\nDesignation: "+dancing.getDesignation());
        dancing.learn();
        dancing.eat();
        dancing.walk();
        dancing.dancing();

        System.out.println("--------------------------------");

        Singer singer = new Singer("Adilet","Toi yry","Kenesh tobu");
        System.out.println("Name: "+singer.getName()+"Band Name: "+singer.getBandName()+"Designation: "+singer.getDesignation());
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singin();
        singer.playGitar();
    }
}