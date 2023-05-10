public class Person {
    private  String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void learn () {
        System.out.println(getName()+" is leanrning to code ");
    }
    public void walk () {
        System.out.println(getName() + " is likes walking a mountain");
    }
    public void eat () {
        System.out.println(getName() + " is likes pizza ");
    }

    @Override
    public String toString() {
        return " Person: " +
                "\n name: " + name +
                "\ndesignation: " + designation ;
    }
}
