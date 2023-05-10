public class Dancing extends Person {
    private String groupName;
    public Dancing(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing () {
        System.out.println(getName() + " it dancing every day ");
    }

    @Override
    public String toString() {
        return "Dancing: " +
                "\nGroupName: " + groupName;
    }
}
