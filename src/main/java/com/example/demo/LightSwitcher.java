package com.example.demo;
//todo: New class creation (used to do, just for practice :D)
class lightSwitcher {
    //Class fields declaration
    public String color;
    public int buttonsQuantity;
    public float amperes;
    public boolean remoteControl;
    //Declared static fields for static methods
    public static float voltage;
    public static float resistance;

    //initializing variables for static methods (wanted to have there some digits)
    static {
         voltage = 220;
         resistance = 1200;
    }

    //Static method creation for showing how much Voltage is
    public static void lightSwitcherVoltageShow () {
        System.out.println("All Light Switchers voltage is - " + voltage + " " + "Volt");
    }

    //Static method creation for calculating how much current Power is
    public static float lightSwitcherCurrentPower () {
        //used formula here Voltage^2/Resistance
        return voltage*voltage/resistance;
    }

    //Constructor of class lightSwitcher creation (4 parameters)
    public lightSwitcher(String color, int buttonsQuantity, float amperes, boolean remoteControl){
            this.color = color;
            this.buttonsQuantity = buttonsQuantity;
            this.amperes = amperes;
            this.remoteControl = remoteControl;
    }

    //Constructor of class lightSwitcher creation (3 parameters)
    public lightSwitcher(int buttonsQuantity, float amperes, boolean remoteControl){
        this.buttonsQuantity = buttonsQuantity;
        this.amperes = amperes;
        this.remoteControl = remoteControl;
    }

    //Constructor of class lightSwitcher creation (1 parameter)
    public lightSwitcher(String color){
        this.color = color;
    }

    //overriding methods for future objects use to display parameters/text, etc. in a way that human can read
    @Override
    public String toString() {
        return "lightSwitcher{" +
                "color='" + color + '\'' +
                ", buttonsQuantity=" + buttonsQuantity +
                ", amperes=" + amperes +
                ", remoteControl=" + remoteControl +
                '}';
    }

    //This one for displaying 3 parameters only, without 0 or nulls
    public String toString(int buttonsQuantity, float amperes, boolean remoteControl) {
        return "lightSwitcher{" +
                "buttonsQuantity=" + buttonsQuantity +
                ", amperes=" + amperes +
                ", remoteControl=" + remoteControl +
                '}';
    }

    //This one for displaying 1 parameter only, without 0 or nulls
    public String toString(String color) {
        return "lightSwitcher{" +
                "color='" + color + '\'' +
                '}';
    }

    //Objects creation
    public static void main (String[] args) {
        //creation an object with 4 parameters
        lightSwitcher livingRoom = new lightSwitcher("White",3,3.5f,true);
        //creation an object with 3 parameters
        lightSwitcher kitchen = new lightSwitcher(2,2.5f,true);
        //creation an object with 4 parameters
        lightSwitcher bathroom = new lightSwitcher("Black",1,2.5f,false);
        //creation an object with 1 parameters
        lightSwitcher bedroom = new lightSwitcher("Red");

        //Displaying created Objects
        //Displaying an object with 4 parameters
        System.out.println(livingRoom);
        //Displaying an object with 3 parameters
        System.out.println(kitchen.toString(2,2.5f,true));
        //Displaying an object with 4 parameters
        System.out.println(bathroom);
        //Displaying an object with 1 parameter
        System.out.println(bedroom.toString("Red"));
        //Using method lightSwitcherVoltageShow called from class lightSwitcher
        lightSwitcher.lightSwitcherVoltageShow();
        //Using method lightSwitcherCurrentPower called from class lightSwitcher, adding data to println function
        System.out.println("Current Power is - " + lightSwitcher.lightSwitcherCurrentPower() + " Watt");
    }

}