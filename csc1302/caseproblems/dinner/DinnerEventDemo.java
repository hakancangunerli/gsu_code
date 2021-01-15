
package caseProblems;

import caseProblems.*;
import java.util.Scanner;
import caseProblems.Event;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Lisa
 */
public class DinnerEventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String eventNum;
        int guests, entree, side1, side2, dessert;

        DinnerEvent[] dinnerEvents = new DinnerEvent[4];

        for (int x = 0; x < dinnerEvents.length; ++x) {
            System.out.println("***NEW EVENT***");
            eventNum = getEventNumber();
            guests = getGuests();
            entree = getEntree();
            side1 = getSides();
            side2 = getSides();
            dessert = getDessert();

            dinnerEvents[x] = new DinnerEvent(eventNum, guests, entree, side1, side2, dessert);
            dinnerEvents[x].setContactPhoneNumber(getContactPhone());
            dinnerEvents[x].setEventType(getEventType());
        }
        
        int sort = sortOption();
        while (sort >= 0 && sort <= 3) {
            if (sort == 0) {
                System.out.println("You have QUIT!");
                System.exit(0);
            }
            if (sort == 1) {
                sortByEventNumber(dinnerEvents);
            }
            if (sort == 2) {
                sortByGuests(dinnerEvents);
            }
            if (sort == 3) {
                sortByEventType(dinnerEvents);
            }

            for (int i = 0; i < dinnerEvents.length; ++i) {
                displayEventDetails(dinnerEvents[i]);
            }
            sort = sortOption();
        }
    }

    public static String getEventNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event number: ");
        num = input.nextLine();
        return num;
    }

    public static int getGuests() {
        int guests;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the amount of guests: ");
            guests = input.nextInt();
            input.nextLine();
        } while (guests < 5 || guests > 100);
        return guests;
    }

    public static String getContactPhone() {
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your phone number? ");
        phone = input.nextLine();
        return phone;
    }

    public static int getEventType() {
        int eventType;
        Scanner input = new Scanner(System.in);
        System.out.println("Event types are");
        for (int x = 0; x < Event.string_event_type_names.length; ++x) {
            System.out.println("    " + x + " " + Event.string_event_type_names[x]);
        }
        System.out.print("Enter the event type: ");
        eventType = input.nextInt();
        return eventType;
    }

    public static int getEntree() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Entree choices are: ");
        for (int j = 0; j < DinnerEvent.ENTREES.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.ENTREES[j]);
        }
        System.out.print("What number entree would you like? ");
        num = input.nextInt();
        return num;
    }

    public static int getSides() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Side dish choices are: ");
        for (int j = 0; j < DinnerEvent.SIDE_DISHES.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.SIDE_DISHES[j]);
        }
        System.out.print("What side dish would you like? ");
        num = input.nextInt();
        return num;
    }

    public static int getDessert() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Dessert choices are: ");
        for (int j = 0; j < DinnerEvent.DESSERTS.length; ++j) {
            System.out.println("    " + j + " " + DinnerEvent.DESSERTS[j]);
        }
        System.out.print("What dessert number would you like? ");
        num = input.nextInt();
        return num;
    }

    public static int sortOption() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option to sort by: 1) Event Number, 2) Guests, 3) Event Type, or 0) QUIT: ");
        choice = input.nextInt();
        return choice;
    }

    public static void sortByEventNumber(DinnerEvent[] dinnerEvents) {
        DinnerEvent sortByEventNumber;
        for (int a = 0; a < dinnerEvents.length - 1; a++) {
            for (int b = 0; b < dinnerEvents.length - 1; b++) {
                int resultSortEventNumber = dinnerEvents[b].getEventNumber().compareTo(dinnerEvents[b + 1].getEventNumber());
                if (resultSortEventNumber > 0) {
                    sortByEventNumber = dinnerEvents[b];
                    dinnerEvents[b] = dinnerEvents[b + 1];
                    dinnerEvents[b + 1] = sortByEventNumber;
                }
            }
            for (a = 0; a < dinnerEvents.length; ++a) {
                displayEventDetails(dinnerEvents[a]);
            }
        }
    }

    public static void sortByGuests(DinnerEvent[] dinnerEvents) {
        DinnerEvent sortByGuests;

        for (int a = 0; a < dinnerEvents.length - 1; a++) {
            for (int b = 0; b < dinnerEvents.length - 1; b++) {
                if (dinnerEvents[b].getNumberOfGuests() > dinnerEvents[b + 1].getNumberOfGuests()) {
                    sortByGuests = dinnerEvents[b];
                    dinnerEvents[b] = dinnerEvents[b + 1];
                    dinnerEvents[b + 1] = sortByGuests;
                }
            }
            for (a = 0; a < dinnerEvents.length; ++a) {
                displayEventDetails(dinnerEvents[a]);
            }
        }
    }

    public static void sortByEventType(DinnerEvent[] dinnerEvents) {
        DinnerEvent sortByEventType;
        for (int a = 0; a < dinnerEvents.length - 1; a++) {
            for (int b = 0; b < dinnerEvents.length - 1; b++) {
                if (dinnerEvents[b].getEventType() > dinnerEvents[b + 1].getEventType()) {
                    sortByEventType = dinnerEvents[b];
                    dinnerEvents[b] = dinnerEvents[b + 1];
                    dinnerEvents[b + 1] = sortByEventType;
                }
            }
            for (a = 0; a < dinnerEvents.length; ++a) {
                displayEventDetails(dinnerEvents[a]);
            }
        }
    }

    public static void displayEventDetails(DinnerEvent dinnerEvents) {
        System.out.println();
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + dinnerEvents.getEventNumber());
        System.out.println("Number of guests is: " + dinnerEvents.getNumberOfGuests());
        System.out.println("Phone number is:  " + dinnerEvents.getContactPhone());
        System.out.println("Event type number is: " + dinnerEvents.getEventType() + ". The event type is: " + dinnerEvents.getEventName(dinnerEvents.getEventType()));
        System.out.println("Is this a large event? " + dinnerEvents.isLargeEvent() + "." + " The price per guest is $" + dinnerEvents.getPricePerGuest() + ". The total cost is: $" + dinnerEvents.getPrice());
        System.out.println(dinnerEvents.getMenu());
    }
}
