package oop.day3.family;

public class SubFather extends GrandFather{
    private String familyName;
    private String houseAddress;
    private String job;

    public void printFather()
    {
        System.out.println("나는 아버지입니다. 나는 할아버지로부터 상속받습니다.");
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
