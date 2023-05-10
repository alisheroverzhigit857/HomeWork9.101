public class Singer extends Person {
    private  String bandName;
    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singin () {
        System.out.println(getName() + "this is very likes singing every day");
    }
    public void playGitar () {
        System.out.println(getName() + "His friend playing gitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
