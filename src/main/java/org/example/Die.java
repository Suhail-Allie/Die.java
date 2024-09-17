package org.example;

    public class Die {
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


