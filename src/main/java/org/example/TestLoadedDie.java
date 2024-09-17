package org.example;

    public class TestLoadedDie {
        public static void main(String[] args) {
            // Create two Die objects
            Die die1 = new Die();
            Die die2 = new Die();

            // Counters for die comparisons
            int die1Wins = 0;
            int dieWins = 0;

            // Roll two Die objects 1,000 times and count the number of times die1 wins
            for (int i = 0; i < 1000; i++) {
                die1.roll();
                die2.roll();
                if (die1.getValue() > die2.getValue()) {
                    die1Wins++;
                }
            }

            // Create a Die object and a LoadedDie object
            Die regularDie = new Die();
            LoadedDie loadedDie = new LoadedDie();

            // Roll a Die against a LoadedDie 1,000 times and count the number of times the Die wins
            for (int i = 0; i < 1000; i++) {
                regularDie.roll();
                loadedDie.roll();
                if (regularDie.getValue() > loadedDie.getValue()) {
                    dieWins++;
                }
            }

            // Display the results
            System.out.println("Number of times the first Die had a higher value: " + die1Wins);
            System.out.println("Number of times the regular Die won against the LoadedDie: " + dieWins);
        }
    }


