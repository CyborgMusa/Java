public class CallVoidMethodDemo {
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        }else if (score >= 70.0) {
            System.out.println('C');
        }else if (score >= 60.0) {
            System.out.println('D');
        }else if (score >= 50.0) {
            System.out.println('E');
        } else {
            System.out.println('F');
        }
    }

    public static void main(String[] args) {
        System.out.println("The grade is: ");
        printGrade(78.5);
        System.out.println("The grade is: ");
        printGrade((30.5));
    }
}
