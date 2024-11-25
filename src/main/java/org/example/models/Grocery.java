package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();

    //kullanıcıdan input alabilmek için scanner clasını kullanıyoruz
    Scanner scanner = new Scanner(System.in);

    public void startGrocery(){
        int choice;
        do{
            System.out.println(" Yapılmak istenen operasyonu seçin. (0=çıkış, 1=ekle, 2=çıkar)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        }
        while (choice != 0);

        //Açtığın scanner'ı kapatman lazım.(Açtığın herşeyi kapaman lazım)
        scanner.close();
    }

    public static void removeItems(String itemsToRemove) {
        String[] splitItems = itemsToRemove.split(",");
        for (String item: splitItems){
            item = item.trim();
            if(!checkItemsList(item)){
                System.out.println("Girilen item listede zaten yok");
            }else {
                groceryList.remove(item);
            }
        }
        sortItems();
    }

    public static void addItems(String itemsToAdd) {
        String[] splitItems = itemsToAdd.split(",");
        for (String item : splitItems){
            item=item.trim();
            if(checkItemsList(item)){
                System.out.println("girilen item listede zaten var: "+ item);
            }else{
                groceryList.add(item);
            }
        }
        sortItems();
    }

    public static boolean checkItemsList(String item) {
        return groceryList.contains(item);
    }

    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut pazar listesi: ");
        for (String item: groceryList){
            System.out.println(item);
        }
    }

    public static void sortItems() {
        Collections.sort(groceryList);
    }
}
