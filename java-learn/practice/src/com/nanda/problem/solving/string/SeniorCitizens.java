package com.nanda.problem.solving.string;

public class SeniorCitizens {

    public int countSeniors(String[] details) {


        int count =0;

        // split based on regex

        for (int i = 0; i < details.length ; i++) {

            if (details[i].length() == 15) {

                String[] splitOne = details[i].split("[0-9]{10}[M|F]");
                if (splitOne.length == 2 && splitOne[1] != null) {
                    String splitTwo = splitOne[1].split("\\d{2}$")[0];
                    if (Integer.parseInt(splitTwo) > 60) {
                        count+=1;
                    }
                }

            }





        }



        //System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        new  SeniorCitizens().countSeniors(new String[]
                {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"});
    }
}
