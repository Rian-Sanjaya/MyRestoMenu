package com.lonecode.myrestomenu;

import java.util.ArrayList;

public class MenusData {
    public static String[][] data = new String[][] {
            {"1", "Nasi Ayam Mentega", "Nasi dengan ayam goreng tepung disajikan dengan saus mentega", "23.000", "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg"},
            {"2", "Nasi Ayam Asam Manis", "Nasi dengan ayam goreng dengan sambal rica rica", "23.000", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
            {"3", "Nasi Ayam Teriyaki", "Nasi dengan ayam goreng disajikan dengan saus teriyaki", "23.000", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
            {"4", "Nasi + Ayam Crisspy Black Pepper Souce", "Nasi dengan ayam goreng tepung disajikan dengan souce black pepper", "29.000", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
            {"5", "Paket Mix Mentega", "Nasi dengan udang, ayam goreng, ikan", "29.000", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
    };

    public static ArrayList<Menu> getListData() {
        ArrayList<Menu> list = new ArrayList<>();

        for (String[] aData : data) {
            Menu menu = new Menu();

            menu.setId(aData[0]);
            menu.setName(aData[1]);
            menu.setDesc(aData[2]);
            menu.setPrice(aData[3]);
            menu.setPhoto(aData[4]);

            list.add(menu);
        }

        return list;
    }
}
