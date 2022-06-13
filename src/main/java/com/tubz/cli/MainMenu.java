package com.tubz.cli;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private List<Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public void showMenu(){

        for (Menu menu : menuList) {
            menu.show();
        }
        menuList.clear();
    }
}
