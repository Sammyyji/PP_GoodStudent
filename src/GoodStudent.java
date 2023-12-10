public class GoodStudent {
    private String firstName;
    private String lastName;
    private String nickname;
    private int idNumber;
    private double gpa;
    private boolean isCSStudent;

    //Constructor
    public GoodStudent(String firstName2, String lastName2, String nickname2, int idNumber2, double gpa2, boolean isCSStudent2) {
        firstName = firstName2;
        lastName = lastName2;
        nickname = nickname2;
        idNumber = idNumber2;
        gpa = gpa2;
        isCSStudent = isCSStudent2;
    }

    //Constructor2, no nickname
    public GoodStudent(String firstName2, String lastName2, int idNumber2, double gpa2, boolean isCSStudent2){
        this(firstName2, lastName2, "", idNumber2, gpa2, isCSStudent2);
    }


    //Getters and setters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickNameSetter) {
        nickname = nickNameSetter;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpaSetter){
        gpa = gpaSetter;
    }
    public boolean getCSStatus() {
        return isCSStudent;
    }
//    public void setCSStudent(boolean isCS) {
//        isCSStudent = isCS;
//    }

    //CreateID
    public String createID() {
        String firstInitial = firstName.substring(0,1).toLowerCase();
        String lastThreeOfID = Integer.toString(idNumber).substring(Integer.toString(idNumber).length()-3);
        return firstInitial + lastName.toLowerCase() + lastThreeOfID;
    }
    // CSGPA
    public double csGPA() {
        if (isCSStudent) {
            return gpa * 1.15;
        }
        return gpa;
    }




    //ToString
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Nickname: " + nickname + "\n" +
                "ID: " + idNumber + "\n" +
                "GPA: " + gpa + "\n" +
                "CS Student: " + isCSStudent;

    }

}
