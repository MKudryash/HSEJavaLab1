import MethodsCommodity.MethodsCommodity;
import Models.Commodity;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

import MethodsCommodity.StorageProducts;
import Task.Task1;
import Task.Task2;
import Task.Task3;
import Task.Task4;

/**
 * 5. Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
 * Если произведение этих чисел больше 50,то вычислить удвоенный корень квадратный первого числа.
 * Вывести результат на экран.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print(" 1 - Работа с задачами\n 2 - Работа с данными\n 3 - Завершение работы\n");
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    MenuTasks();
                    break;
                }
                case 2: {
                    MenuStructure();
                    break;
                }
                case 3: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void MenuTasks() {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("\n 1 - Условия \n 2 - Одномерный массив\n 3- Двумерный массив\n 4 - Нахождение D\n " +
                    "5 - Завершить программу \n");
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    //Тут собственно всякие разные исходы для MultiplicationCondition
                    System.out.printf("При x = 5 и y = 5: " + Task1.MultiplicationCondition(5, 5) + "\n");
                    System.out.printf("При x = 12 и y = 12: " + Task1.MultiplicationCondition(12, 12) + "\n");
                    System.out.printf("При x = -5 и y = 12: " + Task1.MultiplicationCondition(-5, 12) + "\n");
                    System.out.printf("При x = -4 и y = -23: " + Task1.MultiplicationCondition(-4, -23) + "\n");
                    System.out.printf("При x = 16 и y = 15: " + Task1.MultiplicationCondition(16, 15) + "\n");
                    break;
                }
                case 2: {
                    Task2.OneDimensionalArray();
                    break;
                }
                case 3: {
                    Task3.TwoDimensionalArray();
                    break;
                }
                case 4: {
                    System.out.print("Введите a = ");
                    double a = in.nextDouble();
                    System.out.print("Введите b = ");
                    double b = in.nextDouble();
                    System.out.print("D = " + Task4.FoundD(a, b));
                    break;
                }
                case 5: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void MenuStructure() {
        String menu = "Выберите действие:\n 1 - Заполнить список в ручную\n 2 - Заполнить список из файла" +
                "\n 3 - Записать список в файл\n 4 - Вывести список\n " +
                "5 - Осортировать список по имени\n " +
                "6 - Осортировать список по розничной цене\n " +
                "7 - Завершить программу\n";
        Scanner in = new Scanner(System.in);
        ArrayList<Commodity> commodityArrayList = new ArrayList<>();
        StorageProducts storageProducts = new StorageProducts(commodityArrayList);
        boolean flag = true;
        while (flag) {
            System.out.print(menu);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    RecordData(storageProducts);
                    break;
                }
                case 2: {
                    ReadDataFile(storageProducts);
                    storageProducts.printArrayCommodity();
                    break;
                }
                case 3: {
                    WriteDataFile(storageProducts);
                    break;
                }
                case 4: {
                    storageProducts.printArrayCommodity();
                    break;
                }
                case 5: {
                    MethodsCommodity.sortByName(storageProducts.getCommodityArrayList());
                    storageProducts.printArrayCommodity();
                    break;
                }
                case 6: {
                    MethodsCommodity.sortByRetailPrice(storageProducts.getCommodityArrayList());
                    storageProducts.printArrayCommodity();
                    break;
                }
                case 7: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void RecordData(StorageProducts storageProducts) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите идентификатор продукта:");
            int id = in.nextInt();
            System.out.print("Введите код продукта:");
            int productCode = in.nextInt();
            System.out.print("Введите наименование продукта:");
            String name = in.next();
            System.out.print("Введите оптовую цену продукта:");
            int wholesalePrice = in.nextInt();
            System.out.print("Введите розничную цену продукта:");
            int retailPrice = in.nextInt();
            System.out.print("Введите описание продукта:");
            String description = in.next();
            storageProducts.addElement(new Commodity(id, productCode, name, wholesalePrice, retailPrice, description));
            System.out.print("Ввести еще товары (1 - да / 0 - нет):");
            if (in.nextInt() != 1) flag = false;
        }
    }

    public static void ReadDataFile(StorageProducts storageProducts) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(new File("data.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                storageProducts.addElement(ParseString(str));
            System.out.print("Успешно записано\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так");
            e.printStackTrace();
        }
    }

    public static void WriteDataFile(StorageProducts storageProducts) {
        try (FileWriter writer = new FileWriter("Products.txt", false)) {
            // запись всей строки
            for (Commodity commodity : storageProducts.getCommodityArrayList()) {
                writer.write(commodity.toString());
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.print("Что-то пошло не так");
            System.out.println(ex.getMessage());
        }

    }

    public static Commodity ParseString(String str) {
        String[] arrayData = str.split(" ");
        return new Commodity(Integer.parseInt(arrayData[0]), Integer.parseInt(arrayData[1])
                , arrayData[2], Integer.parseInt(arrayData[3]), Integer.parseInt(arrayData[4]), arrayData[5]);

    }
}