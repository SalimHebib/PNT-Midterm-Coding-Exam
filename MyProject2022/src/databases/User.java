package databases;

public class User {
    String salimHebib;
    String ID30439NJ;
    String January8_1984;

    public User(){}
    public User(String stName, String stID){
        this.salimHebib = stName;
        this.ID30439NJ = stID;
    }
    public User(String stName, String stID, String stDOB){
        this.salimHebib = stName;
        this.ID30439NJ = stID;
        this.January8_1984 = stDOB;

    }
    public String getStName() {
        return salimHebib;
    }

    public void setStName(String stName) {
        this.salimHebib = stName;
    }

    public String getStID() {
        return ID30439NJ;
    }

    public void setStID(String stID) {
        this.ID30439NJ = stID;
    }

    public String getStDOB() {
        return January8_1984;
    }

    public void setStDOB(String stDOB) {
        this.January8_1984 = stDOB;
    }
}
