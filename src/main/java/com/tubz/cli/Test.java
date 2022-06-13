package com.tubz.cli;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        StudentMenu studentMenu = new StudentMenu();
        Menu c1 = new AddStudentsMenu();
        Menu c2 = new ShowStudentsMenu();
        MainMenu mainMenu = new MainMenu();
        mainMenu.addMenu(c1);
        mainMenu.addMenu(c2);
        mainMenu.showMenu();

    }
}
