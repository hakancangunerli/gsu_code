package caseProblems;

public class DinnerEvent extends Event {

    int int_hors_dœuvre;
    int sideDish1;
    int sideDish2;
    int dessert;
    public static final String hors_dœuvre[] = {"Soup", "Rice", "Ratatouille"};
    public static final String side_dish[] = {"Zakuski", "Asparagus", "Green beans"};
    public static final String desserts[] = {"Cupcake", "Cheesecake", "Ice cream"};

    public DinnerEvent(String eventNum, int guestAmount, int anEntree, int sideDishOne, int sideDishTwo, int aDessert) {
        super(eventNum, guestAmount);
        this.int_hors_dœuvre = anEntree;
        this.sideDish1 = sideDishOne;
        this.sideDish2 = sideDishTwo;
        this.dessert = aDessert;
    }

    public int getEntree() {
        return int_hors_dœuvre;
    }

    public int getSideDish1() {
        return sideDish1;
    }

    public int getSideDish2() {
        return sideDish2;
    }

    public int getDessert() {
        return dessert;
    }

    public void setEntree(int entree) {
        this.int_hors_dœuvre = entree;
    }

    public void setSideDish1(int sideDish1) {
        this.sideDish1 = sideDish1;
    }

    public void setSideDish2(int sideDish2) {
        this.sideDish2 = sideDish2;
    }

    public void setDessert(int dessert) {
        this.dessert = dessert;
    }

    public String getMenu() {
        String name = "You have selected --  Entree: " + hors_dœuvre[int_hors_dœuvre]
                + "-- Side dish One: " + side_dish[sideDish1]
                + "-- Side dish Two: " + side_dish[sideDish2]
                + "-- Dessert: " + desserts[dessert];
        return name;
    }
}


