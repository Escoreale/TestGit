package org.example;

public class Main {
    public static void main(String[] args) {
        int celsius = 25; //Vi initierar variabeln celsius. Man skulle kunna skriva "final" eftersom värdet inte är tänkt att ändras.

        float fahrenheit = celsius * 1.8f + 32f; //Formeln för konvertering från C till F sparas i en float.

        float kelvin1 = celsius + 273.15f; //Formeln för konvertering från C till K sparas i en float.

        //int kelvin = (int)(celsius + 273.15); Ett alternativ som konverterar decimalvärdet på celsius till ett heltal (int).

        System.out.println("25 degrees celsius is: " + fahrenheit + " in Fahrenheit or " + kelvin1 + " in Kelvin.");  //Konverteringen skrivs ut i text.
        }
    }
