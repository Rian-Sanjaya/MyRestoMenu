package com.lonecode.myrestomenu;

import java.util.ArrayList;

public class MenusData {
    public static String[][] data = new String[][] {
            {"1", "Beef Teriyaki", "Daging sapi premium yang dimasak dengan potongan bawang bombay dan menggunakan saus teriyaki khas HokBen.", "39,000", "https://www.hokben.co.id/assets/uploads/menu/069e1-Beef-Teriyaki.jpg"},
            {"2", "Beef Yakiniku", "Daging sapi premium yang dimasak dengan potongan bawang bombay dan paprika hijau menggunakan saus yakiniku khas HokBen.", "39,000", "https://www.hokben.co.id/assets/uploads/menu/265cb-Beef-Yakiniku.jpg"},
            {"3", "Chicken Teriyaki", "Daging ayam tanpa tulang yang dimasak dengan potongan bawang bombay dan saus teriyaki khas HokBen.", "29,500", "https://www.hokben.co.id/assets/uploads/menu/d3765-Chicken-Teriyaki.jpg"},
            {"4", "Chicken Yakiniku", "Daging ayam tanpa tulang yang dimasak dengan potongan bawang bombay dan saus yakiniku khas HokBen.", "29.000", "https://www.hokben.co.id/assets/uploads/menu/d2e22-Chicken-Yakiniku.jpg"},
            {"5", "Chicken Karaage", "Daging ayam berkualitas dan terpilih yang dimasak dengan teknik Deep Frying Oil sehingga menghasilkan tekstur tepung yang garing dan renyah serta bagian dalam yang empuk.", "31.500", "https://www.hokben.co.id/assets/uploads/menu/48c81-Crispy-Karaage.jpg"},
            {"6", "Sukiyaki", "Dibuat dari daging sapi premium, tahu sutra jepang, shiratake, sawi putih, daun bawang, bawang bombay dan dimasak dengan saus sukiyaki khas HokBen.", "56,000", "https://www.hokben.co.id/assets/uploads/menu/8b3df-Sukiyaki.jpg"},
            {"7", "Chicken Tofu ( 2 pcs )", "Dibuat dari tahu pilihan yang dilapisi daging ayam olahan dan disajikan dengan daun bawang serta kuah kaldu ayam khas HokBen.", "20,000", "https://www.hokben.co.id/assets/uploads/menu/bdb46-Chicken-Tofu-(-2-pcs-).jpg"},
            {"8", "Es Ogura", "Kacang merah yang disajikan dengan air gula, santan dan es serut sebagai makanan penutup.", "11,500", "https://www.hokben.co.id/assets/uploads/menu/41119-Es-Ogura.jpg"},
            {"9", "Es Sarang Burung", "Agar-agar dan buah kelengkeng yang disajikan dengan air gula serta es serut sebagai makanan penutup.", "18.000", "https://www.hokben.co.id/assets/uploads/menu/0aa55-Es-Sarang-Burung.jpg"},
            {"10", "Chocolate Pudding", "Puding dengan aroma dan rasa coklat. ", "20.000", "https://www.hokben.co.id/assets/uploads/menu/3348f-Chocolate-Pudding.jpg"},
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
