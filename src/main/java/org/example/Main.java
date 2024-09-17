package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Die
    public static class Die {
        // Protected field to hold the value of the Die
        protected int value;

        // Constructor that initializes the value of the Die
        public Die() {
            roll(); // Initialize the die with a random value
        }

        // Method to roll the die and set its value to a random number between 1 and 6
        public void roll() {
            value = (int) (Math.random() * 6) + 1;
        }

        // Method to get the value of the Die
        public int getValue() {
            return value;
        }

        // Method to set the value of the Die
        public void setValue(int value) {
            if (value >= 1 && value <= 6) {
                this.value = value;
            } else {
                throw new IllegalArgumentException("Value must be between 1 and 6");
            }
        }
    }

    //LoadedDie
    public class LoadedDie extends org.example.Die {

        // Constructor
        public LoadedDie() {
            super(); // Call the superclass constructor
        }

        // Override the roll method to ensure the die never rolls a 1
        @Override
        public void roll() {
            // Generate a random number between 2 and 6
            value = (int) (Math.random() * 5) + 2;
        }
    }

    //TestLoadedDie
    public class TestLoadedDie {
        public static void main(String[] args) {
            // Create two Die objects
            org.example.Die die1 = new org.example.Die();
            org.example.Die die2 = new org.example.Die();

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
            org.example.Die regularDie = new org.example.Die();
            org.example.LoadedDie loadedDie = new org.example.LoadedDie();

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




}