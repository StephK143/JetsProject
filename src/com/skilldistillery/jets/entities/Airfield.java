package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	List<Jet> fleetOfJets = new ArrayList<>();

	public List<Jet> getFleetOfJets() {
		return fleetOfJets;
	}

	public void setFleetOfJets(List<Jet> fleetOfJets) {
		this.fleetOfJets = fleetOfJets;
	}

	public Airfield() {
	}

	public List<Jet> readJetsIn() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.csv"))) {
			String line;

			while ((line = bufIn.readLine()) != null) {

				String[] jetsIn = line.split(",");

				String jetType = jetsIn[0];
				String jetModel = jetsIn[1];
				double jetSpeed = Double.parseDouble(jetsIn[2]);
				int jetRange = Integer.parseInt(jetsIn[3]);
				long jetPrice = Long.parseLong(jetsIn[4]);

				if (jetType.equalsIgnoreCase("Cargo")) {
					fleetOfJets.add(new Cargo(jetType, jetModel, jetSpeed, jetRange, jetPrice));

				}
				if (jetType.equalsIgnoreCase("Fighter")) {
					fleetOfJets.add(new Fighter(jetType, jetModel, jetSpeed, jetRange, jetPrice));

				}
				if (jetType.equalsIgnoreCase("Passenger")) {
					fleetOfJets.add(new Passenger(jetType, jetModel, jetSpeed, jetRange, jetPrice));

				}
				if (jetType.equalsIgnoreCase("Ufo")) {
					fleetOfJets.add(new Ufo(jetType, jetModel, jetSpeed, jetRange, jetPrice));

				}
				if (jetType.equalsIgnoreCase("Compound Helicopter")) {
					fleetOfJets.add(new CompoundHelicopter(jetType, jetModel, jetSpeed, jetRange, jetPrice));

				}

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleetOfJets;
	}

	public void userListsJets() {
		System.out.println("**********  The fleet of jets  **********");
		System.out.println();
		for (int i = 0; i < fleetOfJets.size(); i++) {
			System.out.println(i + 1 + ". " + fleetOfJets.get(i) + "\n");
		}

		System.out.println();
	}

	public void userFlysAllJets() {

		System.out.println("All fleet: Prepare for take off! ");
		System.out.println();

		for (Jet jets : fleetOfJets) {
			jets.fly();

		}
	}

	public void userViewsFastestJet() {

		Jet fastestJet = null;
		for (Jet jets : fleetOfJets) {
			if (fastestJet == null) {
				fastestJet = jets;
			} else if (jets.getSpeedInMilesPerHour() > fastestJet.getSpeedInMilesPerHour()) {
				fastestJet = jets;
			}

		}
		System.out.println("*****     The Fastest Jet in the Fleet is:     *****\n\n" + fastestJet.toString());
	}

	public void userViewsLongestRangeJet() {
		Jet longestRange = null;
		for (Jet jets : fleetOfJets) {
			if (longestRange == null) {
				longestRange = jets;
			} else if (jets.getRange() > longestRange.getRange()) {
				longestRange = jets;
			}
		}
		System.out.println("*****     The jet with the longest range is:     *****\n\n" + longestRange.toString());

	}

	public void userLoadsCargoJet() {

	}

	public void userAddsJet(Scanner kb) {

		String jetType = "";
		String jetModel = "";
		double jetSpeed = 0.0;
		int jetRange = 0;
		long jetPrice = 0;
		int i = 0;

		System.out.println("***********************************************\n"
				+ "***********************************************\n" + "** Please choose                   **\n"
				+ "**    1 for a new Fighter jet      **\n" + "**    2 for a new Cargo jet        **\n"
				+ "**    3 for a new Helicopter       **\n" + "**    4 for a new Passenger jet    **\n"
				+ "**    5 for a new UFO              **\n" + "**    6 to exit the menu           **\n"
				+ "*************************************\n" + "*************************************");

		i = kb.nextInt();

		do {
			System.out.println("What is the name of the plane?");
			jetModel = kb.next();

			System.out.println("What is the plane's speed?");
			jetSpeed = kb.nextDouble();

			System.out.println("What is the range of the plane?");
			jetRange = kb.nextInt();

			System.out.println("What is the purchase price of the plane?");
			jetPrice = kb.nextLong();

		} while (jetModel.equals("") && jetSpeed == 0.0 && jetRange == 0 && jetPrice == 0.0);

		switch (i) {

		case 1:
			jetType = "Fighter";
			fleetOfJets.add(new Fighter(jetType, jetModel, jetSpeed, jetRange, jetPrice));
			break;
		case 2:
			jetType = "Cargo";
			fleetOfJets.add(new Cargo(jetType, jetModel, jetSpeed, jetRange, jetPrice));
			break;
		case 3:
			jetType = "Helicopter";
			fleetOfJets.add(new CompoundHelicopter(jetType, jetModel, jetSpeed, jetRange, jetPrice));
			break;
		case 4:
			jetType = "Passenger";
			fleetOfJets.add(new Passenger(jetType, jetModel, jetSpeed, jetRange, jetPrice));
		case 5:
			jetType = "Ufo";
			fleetOfJets.add(new Ufo(jetType, jetModel, jetSpeed, jetRange, jetPrice));
		case 6:
			break;
		default:
			System.out.println("Not a valid entry");

		}

		System.out.println("The following jet was added");
		System.out.println(jetType + " By the name of: " + jetModel + " with a speed of " + jetSpeed
				+ " and a range of " + jetRange + ". The purchase price is $" + jetPrice);

	}

	public void userDeletesJet(Scanner kb) {

		System.out.println("**********  The fleet of jets  **********");
		System.out.println();
		for (int i = 0; i < fleetOfJets.size(); i++) {
			System.out.println(i + 1 + ". " + fleetOfJets.get(i) + "\n");
		}

		System.out.println();

		System.out.println("Please choose the number of the jet you would like to remove.");
		int jetToBeRemoved = kb.nextInt();

		if (jetToBeRemoved < 1 || jetToBeRemoved > fleetOfJets.size()) {
			System.out.println("Invalid Entry please try again.");
		} else {
			fleetOfJets.remove(jetToBeRemoved - 1);

		}

	}

	public void userSendsTroopsToFight() {

	}
}
