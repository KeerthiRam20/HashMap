package com.main;

import java.util.*;

public class StateAndDistricts {
    public static void main (String ...args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state");

        String enteredState = sc.nextLine();

        Districts districtsList = new Districts();
         States states = new States();

        List<String> returnedState = states.statesOfIndia();


        //Retrieving  the district of particular states
        Map<String, List<String>> stateAndDistricts = new HashMap<>();


          for (int i=0;i<10;i++){

              stateAndDistricts.put(returnedState.get(i),districtsList.districtsOfParticularStates().get(i));
          }

          if(returnedState.contains(enteredState)){

              System.out.println( stateAndDistricts.get(enteredState));
          }
          else
          {
              //Checking whether the entered state first letter is Captical
              System.out.println("Entered  State Name is not valid \n NOTE: First letter of the words of state Name should be CAPITAL \n OR Recheck Spelling Mistake in the entered state   \n OR Entered state shouldn't be in digits" );

          }

    }

    }

