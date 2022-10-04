public class BirthMonths {
    public static void main(String[] args) {


        int birthMonth;

        System.out.println("Please enter your birth month (1-12).");

        birthMonth = 14;

        if (birthMonth >= 1 && birthMonth <= 12){
            System.out.println("Your birth month is " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value.");
        }
    }
}
