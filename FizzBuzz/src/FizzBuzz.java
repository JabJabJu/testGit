/**
 * Petit programme FizzBuzz. On compte jusqu'a un nombre predetermine d'iterations
 * et on remplace les chiffres qui sont des multiples de 3 par Fizz et ceux qui
 * sont des multiples de 5 par Buzz.
 * Exemple : 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz ...
 */

public class FizzBuzz {

    public static void main(String[] args) {
        int iterations = 100;

        for (int i = 1; i < iterations + 1; i++) {
            if (i % 3 != 0 && i % 5 !=0) {
                System.out.print(i);
            } else {
                if (i % 3 == 0)
                    System.out.print("Fizz");
                if (i % 5 == 0)
                    System.out.print("Buzz");
            }
            System.out.print(" ");
        }
    }
}
