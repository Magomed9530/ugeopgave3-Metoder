/*Opgave 1
public class BankAccount {

    // Globale variable til saldo og kontonavn
    double balance = 0;
    String accountName;

    // Indsætter 100 kr.
    void deposit100() {
        balance += 100;
    }

    // Hæver 50 kr.
    void withdraw50() {
        balance -= 50;
    }

    // Udskriver saldoen
    void printBalance() {
        System.out.println(accountName + " har " + balance + " kr");
    }

    public static void main(String[] args) {

        // Opretter en bankkonto
        BankAccount account = new BankAccount();

        // Sætter navnet på kontoen
        account.accountName = "Anders";

        // Indsætter 100 kr. to gange
        account.deposit100();
        account.deposit100();

        // Hæver 50 kr. én gang
        account.withdraw50();

        // Udskriver saldoen
        account.printBalance();
    }
}
/*

*/Opgave 2
public class GradeCalculator {

    // Globale variable til at gemme point
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    // Tilføjer point til assignment
    void addAssignmentPoints(int points) {
        assignmentPoints += points;
    }

    // Tilføjer point til eksamen
    void addExamPoints(int points) {
        examPoints += points;
    }

    // Tilføjer point til projektet
    void addProjectPoints(int points) {
        projectPoints += points;
    }

    // Lægger alle point sammen og printer totalen
    void printTotal() {
        int total = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total score: " + total);
    }

    public static void main(String[] args) {

        // Opretter et GradeCalculator-objekt
        GradeCalculator calculator = new GradeCalculator();

        // Tilføjer de point, som opgaven beder om
        calculator.addAssignmentPoints(25);
        calculator.addExamPoints(40);
        calculator.addProjectPoints(30);

        // Udskriver den samlede score
        calculator.printTotal();
    }
}
/*

*/Opgave3
public class PriceCalculator {

    // Beregner prisen efter rabat
    double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    // Tilføjer 25% moms
    double addTax(double price) {
        return price * 1.25;
    }

    // Beregner slutprisen ved først at give rabat og derefter moms
    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);

        return finalPrice;
    }

    public static void main(String[] args) {

        // Starter med en basispris på 500 kr. og 20% rabat
        double finalPrice = calculateFinalPrice(500, 20);

        // Udskriver slutprisen
        System.out.println("Slutpris: " + finalPrice + " kr");
    }
}
/*

