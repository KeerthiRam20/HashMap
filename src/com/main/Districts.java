package com.main;

import java.util.ArrayList;
import java.util.List;

public class Districts {
    // Displaying the districts of particular States in India
    public List<List<String>> districtsOfParticularStates() {

        List<String> districtsOfKA = new ArrayList<>();
        districtsOfKA.add("Bangalore");
        districtsOfKA.add("Kolar");
        districtsOfKA.add("hassan");
        districtsOfKA.add("tumkur");
        districtsOfKA.add("Belgaum");
        districtsOfKA.add("Chikmagalur");
        districtsOfKA.add("Mangalore");
        districtsOfKA.add("Raichur");
        districtsOfKA.add("Yadgir");

        List<String> districtsOfAP = new ArrayList<>();
        districtsOfAP.add("Srikakulam");
        districtsOfAP.add("Guntur");
        districtsOfAP.add("Kurnool");
        districtsOfAP.add("Chittoor");

        List<String> districtsOfPJ = new ArrayList<>();
        districtsOfPJ.add("Amritsar");
        districtsOfPJ.add("Sangrur");
        districtsOfPJ.add("Kapurthala");
        districtsOfPJ.add("Hoshiarpur");

        List<String> districtsOfMR = new ArrayList<>();
        districtsOfMR.add("Ahmednagar");
        districtsOfMR.add("Akola");
        districtsOfMR.add("Amravati");
        districtsOfMR.add("Aurangabad");

        List<String> districtsOfKE = new ArrayList<>();
        districtsOfKE.add("Thiruvananthapram");
        districtsOfKE.add("Kasargod");
        districtsOfKE.add("Kannur");
        districtsOfKE.add("Palakkad");

        List<String> districtsOfUP = new ArrayList<>();
        districtsOfUP.add("Jaunpur");
        districtsOfUP.add("Allahabad");
        districtsOfUP.add("Basti");
        districtsOfUP.add("Agra");

        List<String> districtsOfWB = new ArrayList<>();
        districtsOfWB.add("Darjeeling");
        districtsOfWB.add("Malda");
        districtsOfWB.add("Bankura");
        districtsOfWB.add("Jalpaiguri");

        List<String> districtsOfTN = new ArrayList<>();
        districtsOfTN.add("Madurai");
        districtsOfTN.add("Chennai");
        districtsOfTN.add("Salem");
        districtsOfTN.add("Erode");

        List<String> districtsOfGU = new ArrayList<>();
        districtsOfGU.add("Ahmedabad");
        districtsOfGU.add("Amreli");
        districtsOfGU.add("Anand");
        districtsOfGU.add("Aravalli");

        List<String> districtsOfRA = new ArrayList<>();
        districtsOfRA.add("Ajmer");
        districtsOfRA.add("Alwar");
        districtsOfRA.add("Banswara");
        districtsOfRA.add("Baran");



         List<List<String>> districtsList = new ArrayList<>();
         districtsList.add(districtsOfKA);
        districtsList.add(districtsOfAP);
        districtsList.add(districtsOfPJ);
        districtsList.add(districtsOfMR);
        districtsList.add(districtsOfKE);
        districtsList.add(districtsOfUP);
        districtsList.add(districtsOfWB);
         districtsList.add(districtsOfTN);
         districtsList.add(districtsOfGU);
         districtsList.add(districtsOfRA);

         return districtsList;
    }
}
