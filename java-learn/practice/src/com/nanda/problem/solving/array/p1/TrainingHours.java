package com.nanda.problem.solving.array.p1;

public class TrainingHours {

    class Strength {
        private int energy;
        private int experience;

        private int requiredTrainingHours;

        public Strength(int energy, int experience) {
            this.energy = energy;
            this.experience = experience;
            this.requiredTrainingHours = 0;
        }

        public int getEnergy() {
            return energy;
        }


    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {

        int requiredTrainingHours = 0;

        Strength me = new Strength(initialEnergy, initialExperience);

        for (int i = 0; i < energy.length; i++) {

            Strength enemy = new Strength(energy[i], experience[i]);
            reqTrainingHours(me, enemy);
            competition(me,enemy);


        }

        return me.requiredTrainingHours;

    }

    public void competition(Strength myStrength, Strength enemyStrength) {


        myStrength.energy = myStrength.energy - enemyStrength.energy;
        myStrength.experience = myStrength.experience + enemyStrength.experience;



    }

    public void reqTrainingHours(Strength me, Strength enemy) {

        if (enemy.experience > me.experience) {
            int diff = enemy.experience - me.experience;
            me.requiredTrainingHours = me.requiredTrainingHours + diff + 1;
            me.experience += diff;
        }

        if (enemy.energy > me.energy) {
            int diff = enemy.energy = me.energy;
            me.requiredTrainingHours = me.requiredTrainingHours + diff + 1;
            me.energy += diff;
        }

    }

    public static void main(String[] args) {
        new TrainingHours().minNumberOfHours(5,3, new int[]{1,4,3,2}, new int[]{2,6,3,1});
    }
}
