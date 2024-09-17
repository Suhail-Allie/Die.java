package org.example;

    public class LoadedDie extends Die {

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


