public class GoodStudentDriver {
    public static void main(String[] args) {
        GoodStudent alanTuring = new GoodStudent("Alan", "Turing", "Big Al", 191254, 3.56, true);
        GoodStudent florenceNightingale = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent graceHopper = new GoodStudent("Grace", "Hopper", "Queen Bee", 190692, 3.99, true);

        //alan toString
        System.out.println("Alan Turing: " + alanTuring.toString());

        System.out.println();

        //Florence nickname and gpa setters
        florenceNightingale.setNickname("Flo-No");
        florenceNightingale.setGpa(3.92);
        System.out.println("New Florence nickname: " + florenceNightingale.getNickname());
        System.out.println("New Florence gpa: " + florenceNightingale.getGpa());

        System.out.println();

        //Grace first name and CS status
        System.out.println("Grace first name: " + graceHopper.getFirstName());
        System.out.println("Grace CS Student? " + graceHopper.getCSStatus());

        System.out.println();

        //createID for all 3
        System.out.println("Alan Turing ID: " + alanTuring.createID());
        System.out.println("Florence ID: " +florenceNightingale.createID());
        System.out.println("Grace ID " + graceHopper.createID());

        System.out.println();

        //CSgpa for all 3
        System.out.println("Alan Turing csGPA: " + alanTuring.csGPA());
        System.out.println("Florence csGPA: " + florenceNightingale.csGPA());
        System.out.println("Grace csGPA " + graceHopper.csGPA());



    }
}