package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;


public class JetsApplication {

	Airfield hanger = new Airfield();

	Scanner kb = new Scanner(System.in);
	int choice = 0;

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();

		app.runApp();

	}

	public void runApp() {

		System.out.println("***Welcome to our Fleet of Jets***");

		hanger.readJetsIn();

		do {
			displayUserMenu();
			choice = kb.nextInt();
			userChoice();
		} while (choice < 9 && choice > 0);
		kb.close();

	}

	public void userChoice() {

		switch (choice)

		{

		case 1:
			hanger.userListsJets();
			break;
		case 2:
			hanger.userFlysAllJets();
			break;
		case 3:
			hanger.userViewsFastestJet();
			break;
		case 4:
			hanger.userViewsLongestRangeJet();
			break;
		case 5:
			hanger.userLoadsCargoJet();
			break;
		case 6:
			hanger.userSendsTroopsToFight();
			break;
		case 7:
			hanger.userAddsJet(kb);
			break;
		case 8:
			hanger.userDeletesJet(kb);
			break;
		case 9:
			System.out.println("You have choosen to exit. GoodBye.");
			break;
		default:
			System.out.println("That is not a valid entry, please choose again.");
		}

	}

	public void displayUserMenu() {

		System.out.println("====================================");
		System.out.println("====================================");
		System.out.println("==========      MENU     ===========");
		System.out.println("==                                ==");
		System.out.println("== 1. List fleet                  ==");
		System.out.println("== 2. Fly all jets                ==");
		System.out.println("== 3. View fastest jet            ==");
		System.out.println("== 4. View jet with longest range ==");
		System.out.println("== 5. Load all Cargo jets         ==");
		System.out.println("== 6. Send the troops to fight!   ==");
		System.out.println("== 7. Add a jet to the fleet      ==");
		System.out.println("== 8. Remove a jet from the fleet ==");
		System.out.println("== 9. Quit                        ==");
		System.out.println("====================================");
		System.out.println("====================================");

	}

}
