package com.nanda.generics;

public class TestBank {

    public static void main(String[] args) {
        RewardCalculator<Account> rc = new RewardCalculator<>();

        rc.getMyReward(new Gold(), 2000);
        rc.getMyReward(new Platinum(), 2000);

    }
}


abstract class Account {
    abstract public int rewards(int amount);
}

class Gold extends Account {

    @Override
    public int rewards(int amount) {
        return (amount / 200) * 1;
    }
}

class Platinum extends Account {

    @Override
    public int rewards(int amount) {
        return (amount / 100) * 1;
    }
}


class RewardCalculator<T extends Account> {

    public void getMyReward(T t, int amount) {
        System.out.println(t.rewards(amount));;
    }
}