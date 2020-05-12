package Homework2;

public class GradingSystem {
    public static void main(String[] args) {
        GradingSystem grader = new GradingSystem();
        System.out.println(grader.getLetterGrade(100));
        System.out.println(grader.getLetterGrade(96));
        System.out.println(grader.getLetterGrade(93));
        System.out.println(grader.getLetterGrade(90));
        System.out.println(grader.getLetterGrade(86));
        System.out.println(grader.getLetterGrade(83));
        System.out.println(grader.getLetterGrade(80));
        System.out.println(grader.getLetterGrade(76));
        System.out.println(grader.getLetterGrade(73));
        System.out.println(grader.getLetterGrade(70));
        System.out.println(grader.getLetterGrade(66));
        System.out.println(grader.getLetterGrade(63));
        System.out.println(grader.getLetterGrade(60));
        System.out.println(grader.getLetterGrade(50));
        System.out.println(grader.getLetterGrade(-10));
        System.out.println(grader.getLetterGrade(110));
    }

    public String getLetterGrade(double percent) {
        if (percent < 0 || percent > 100) {
            return("Please provide a valid percentage");
        } else {
            if (percent <= 100 && percent >= 96) {
                return "A+";
            } else if (percent < 96 && percent >= 93) {
                return "A";
            } else if (percent < 93 && percent >= 90) {
                return "A-";
            } else if (percent < 90 && percent >= 86) {
                return "B+";
            } else if (percent < 86 && percent >= 83) {
                return "B";
            } else if (percent < 83 && percent >= 80) {
                return "B-";
            } else if (percent < 80 && percent >= 76) {
                return "C+";
            } else if (percent < 76 && percent >= 73) {
                return "C";
            } else if (percent < 73 && percent >= 70) {
                return "C-";
            } else if (percent < 70 && percent >= 66) {
                return "D+";
            } else if (percent < 66 && percent >= 63) {
                return "D";
            } else if (percent < 63 && percent >= 60) {
                return "D-";
            } else {
                return "F";
            }
        }
    }
}
