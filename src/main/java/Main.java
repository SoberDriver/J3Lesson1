import ThirdTask.Apple;
import ThirdTask.Box;
import ThirdTask.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main<E> {
    private E[] arr;

    public Main(E... arr) {
        this.arr = arr;
    }

    public E[] getArr() {
        return arr;
    }

    public static void main(String[] args) {
    // первое задание
    Main<Integer> intArr = new Main<>(1, 2, 3);
    Main<String> strArr = new Main<>("12", "34", "56");
    strArr.firstTask(1, 2);
    intArr.firstTask(2, 0);
    System.out.println(Arrays.toString(strArr.getArr()));
    System.out.println(Arrays.toString(intArr.getArr()));

    //второе задание

    ArrayList<String> strArrayList = secondTask(strArr.getArr());
    ArrayList<Integer> intArrayList = secondTask(intArr.getArr());
    strArrayList.add(3, "re"); // Метод какбы работает, только нужно определять заранее тип данных arrayList
    System.out.println(strArrayList);
    System.out.println(intArrayList);


        //третье задание

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.add(apple1,apple2, apple3);
        appleBox2.add(apple4, apple5, apple6, apple7);
        orangeBox1.add(orange1,orange2);

        System.out.println("Вес первой коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Сравнение первой коробки с яблоками и второй коробки с яблоками: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение первой коробки с яблоками и коробки с апельсинами: " + appleBox1.compare(orangeBox1));
        appleBox1.toAnotherBox(appleBox2);
        System.out.println("Перекладываем яблоки из первой коробки во вторую.");
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Вес первой коробки с яблоками: " + appleBox1.getWeight());



    }

    public  void firstTask(int first, int second) {
        Object switchObj = arr[first];
        arr[first] = arr[second];
        arr[second] = (E) switchObj;
    }

    public static <E> ArrayList<E> secondTask(E[] a){
        return new ArrayList<E>(Arrays.asList(a));
    }











}
