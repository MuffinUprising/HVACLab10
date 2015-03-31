package com.Casey;

import java.util.LinkedList;
import java.util.Date;
import java.util.Scanner;

public class HVAC {


    /** Program to manage service calls to furnaces and AC units
     */

    private static LinkedList<ServiceCall> activeServiceCalls;
    private static LinkedList<ServiceCall> resolvedServiceCalls;

    private static Scanner scanner;   //Global scanner used for all input


    public static void main(String[] args) {
        HVACGUI HvacGui = new HVACGUI();

        //
        activeServiceCalls = new LinkedList<ServiceCall>();
        resolvedServiceCalls = new LinkedList<ServiceCall>();

    }
}

