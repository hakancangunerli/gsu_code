package caseProblems;

import caseProblems.*;
import caseProblems.DinnerEventDemo;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
class Event {

    public static double pp_guest_low = 32.00;
    public static double pp_guest_high = 35.00;
    public static int maximum_amount = 50;
    private String string_event_number;
    boolean isLarge = false;
    private int integer_guests_amount;
    private double price,pricePerGuest;
    private String contactPhoneNumber;
    private int eventType;  
    public static String string_event_type_names[] = { "Wedding", "Baptism", "Birthday", "Corporate", "Other" };

    public Event() {
        this("A000", 0);
    }

    public Event(String eventNum, int guestAmount) {
        string_event_number = eventNum;
        integer_guests_amount = guestAmount;
    }

    public void setEventNumber(String eventNum) {
        string_event_number = eventNum;

        if (((eventNum.length() == 4)
                && ((Character.isAlphabetic(eventNum.charAt(0))) && (Character.isDigit(eventNum.charAt(1)))
                        && (Character.isDigit(eventNum.charAt(2))) && (Character.isDigit(eventNum.charAt(3)))))) {
            string_event_number = eventNum;
            string_event_number = Character.toUpperCase(eventNum.charAt(0)) + eventNum.substring(1);
        } else {
            string_event_number = "A0000";
        }
    }

    public void setGuests(int guestAmount) {
        integer_guests_amount = guestAmount;

        if (isLargeEvent()) {
            pricePerGuest = pp_guest_low;
        } else {
            pricePerGuest = pp_guest_high;
        }
        price = integer_guests_amount * pricePerGuest;
    }

    public void setContactPhoneNumber(String phoneNum) {
        contactPhoneNumber = phoneNum;
        String phoneFormat = "";

        for (int i = 0; i < phoneNum.length(); i++) {
            if (Character.isDigit(phoneNum.charAt(i))) {
                phoneFormat += phoneNum.charAt(i);
            }
        }
        if (phoneNum.length() < 10 || phoneNum.length() < 10) {
            contactPhoneNumber = "0000000000";
        } else {
            contactPhoneNumber = phoneFormat;
        }
    }

    public void setEventType(int eventTypeNum) {
        eventType = eventTypeNum;
        if (eventTypeNum < string_event_type_names.length) {
            eventType = eventTypeNum;
        } else {
            eventType = string_event_type_names.length;
        }
    }

    public String getEventNumber() {
        return string_event_number;
    }

    public String getEventName(int i) {
        return string_event_type_names[i];
    }

    public int getNumberOfGuests() {
        return integer_guests_amount;
    }

    public String getContactPhone() {
        {
            String phone;
            phone = "(" + contactPhoneNumber.substring(0, 3) + ") " + contactPhoneNumber.substring(3, 6) + "-"
                    + contactPhoneNumber.substring(6, 10);

            return phone;
        }
    }

    public Boolean isLargeEvent() {
        if (integer_guests_amount >= maximum_amount) {
            isLarge = true;
        } else {
        }
        return isLarge;
    }

    public int getEventType() {
        return eventType;
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }

    public double getPrice() {
        return price;
    }
}
