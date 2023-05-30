package com.nanda.problem.solving.array.p2;

public class Q1475Prices {

    public int[] finalPrices(int[] prices) {

        int[] finalPrices = new int[prices.length];

        int lastItemPriceIndex = prices.length - 1;

        finalPrices[lastItemPriceIndex] = prices[lastItemPriceIndex];

        for (int i = 0; i <= lastItemPriceIndex - 1; i++) {
            int priceOfIthItem = prices[i];
            finalPrices[i] = priceOfIthItem;
            for (int j = i+1; j <= lastItemPriceIndex; j++) {
                int priceOfJthItem = prices[j];
                if (priceOfIthItem >= priceOfJthItem) {
                    priceOfIthItem = priceOfIthItem - priceOfJthItem;
                    finalPrices[i] = priceOfIthItem;
                    break;
                }

            }

        }

        return finalPrices;

    }

    public static void main(String[] args) {
        new Q1475Prices().finalPrices(new int[]{10,1,1,6});
    }
}
