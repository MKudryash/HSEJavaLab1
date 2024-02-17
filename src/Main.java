import MethodsCommodity.MethodsCommodity;
import Models.Commodity;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import MethodsCommodity.StorageProducts;

/**
 * 5. Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
 * Если произведение этих чисел больше 50,то вычислить удвоенный корень квадратный первого числа.
 * Вывести результат на экран.
 */
public class Main {
    public static void main(String[] args) {
        //Тут собственно всякие разные исходы для MultiplicationCondition
      /*  System.out.printf("При x = 5 и y = 5: " + MultiplicationCondition(5, 5) + "\n");
        System.out.printf("При x = 12 и y = 12: " + MultiplicationCondition(12, 12) + "\n");
        System.out.printf("При x = -5 и y = 12: " + MultiplicationCondition(-5, 12) + "\n");
        System.out.printf("При x = -4 и y = -23: " + MultiplicationCondition(-4, -23) + "\n");
        System.out.printf("При x = 16 и y = 15: " + MultiplicationCondition(16, 15) + "\n");*/

        //Task2.OneDimensionalArray();
        //Task3.TwoDimensionalArray();

       /* ArrayList<Commodity> commodityArrayList = new  ArrayList<>();
        commodityArrayList.add(new Commodity(1,5263,"Телевизор",2500,3500,"Крутой телевизор"));
        commodityArrayList.add(new Commodity(1,5263,"Монитор",1000,1500,"Сломанный телевизор"));
        commodityArrayList.add(new Commodity(1,5263,"Мышка",2000,2500,"Серая мышка"));

        MethodsCommodity.sortByName(commodityArrayList);
        for (Commodity it:commodityArrayList)
        {
            System.out.printf(it.toString() + "\n");
        }
        MethodsCommodity.sortByRetailPrice(commodityArrayList);
        for (Commodity it:commodityArrayList)
        {
            System.out.printf(it.toString() + "\n");
        }*/

        System.out.print("Выберите действие:\n 1 - Заполнить список в ручную\n 2 - Заполнить список из файла\n");
        Scanner in = new Scanner(System.in);
        ArrayList<Commodity> commodityArrayList = new ArrayList<>();
        StorageProducts storageProducts = new StorageProducts(commodityArrayList);

        int num = in.nextInt();
        switch (num) {
            case 1: {
                break;
            }
            case 2: {
                ReadDataFile(storageProducts);
                storageProducts.printArrayCommodity();
                break;
            }
        }


    }

    public static void ReadDataFile(StorageProducts storageProducts) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(new File("data.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                storageProducts.addElement(ParseString(str));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Commodity ParseString(String str) {
        String[] arrayData = str.split(" ");
        return new Commodity(Integer.parseInt(arrayData[0]), Integer.parseInt(arrayData[1])
                , arrayData[2], Integer.parseInt(arrayData[3]), Integer.parseInt(arrayData[4]), arrayData[5]);

    }
}