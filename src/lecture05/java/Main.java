package lecture05.java;

public class Main {

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
        }
    }

    private boolean isValidScore(int score) {
        return 0 <= score && score <= 100;
    }

    private String getPassOrFail(int score) {
        // expression
        // return score >= 50 ? "P" : "F";

        // statement
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    private boolean startsWithA(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).startsWith("A");
        }
        return false;
    }

    private void judgeNumberV1(int number) {
        if (number == -1 || number == 0 || number == 1) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }

    private void judgeNumberV2(int number) {
        if (number == 0) {
            System.out.println("0");
            return;
        }
        if (number % 2 == 0){
            System.out.println("짝");
            return;
        }
        System.out.println("홀");
    }
}
