import java.util.Date;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String adress;
    private String phoneNum;
    private Faculty faculty;
    private int courseNum;
    private Group group;
    private String dateOfBirthday;

    public  Student (int id, String name, String surname, String middleName, String adress, String phoneNum,
                    Faculty faculty, int courseNum, Group group, String dateOfBirthday){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.courseNum = courseNum;
        this.group = group;
        this.dateOfBirthday = dateOfBirthday;
    }
    public Student () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0 && id<1000) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Incorrect number ID");
        }
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        if (courseNum>0 && courseNum<=5) {
        this.courseNum = courseNum;}
        else {
            throw new IllegalArgumentException("Incorrect number of Course"); }
    }

    public Group getGroupNum() {
        return group;
    }

    public void setGroupNum(Group group) {
        this.group = group;
    }

    public String toString() {
      return "ID: " +id + " Surname: " + surname + " Name: " + name + " middleName: " + middleName +
            " Adress: " + adress + " Phone number: " + phoneNum + " Facilty: " + faculty +
            " Course: " + courseNum + " Group: " + group + " dataOfBirthday: " + dateOfBirthday;
    }
    public boolean equalsFaculty(String faculty) {
        return faculty.equals(this.faculty.toString());
    }

    public boolean equalsCourse(int courseNum) {
        return courseNum == this.courseNum;
    }
    public boolean equalsBDay (String dateOfBirthday) {
        return Integer.parseInt(this.dateOfBirthday.substring(6)) > Integer.parseInt(dateOfBirthday);
    }
    public boolean equalsGroup(String group) {
        return group.equals(this.group.toString());
    }

}
