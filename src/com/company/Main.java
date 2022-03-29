package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
                //Задание 1
                LinkedList<String> car = new LinkedList<>();
                car.add("Toyota camry 70");
                car.add("BMW x7");
                car.add("Mercedes Benz");
                car.add("Mazda");
                car.add("Porsche");
                car.add("Toyota allion");
                car.add("Honda Fit");

                //Задание 2
                System.out.println("1 элемент через индекс: " + car.get(0));
                System.out.println("1 элемент через ключевое слово: " + car.get(car.indexOf("Porsche")));

                //Задание 3
                List<Integer> num = new ArrayList<Integer>(Arrays.asList(23,43,23,216,53,23,4,6,23,45,67,2));
                int counter = 0;
                for (Integer value : num) {
                    if (value < 45)
                        counter++;
                }
                System.out.println("Кол-во чисел меньших чем 45: " + counter);

                //Задание 4
                counter = 0;
                for (Integer value : num) {
                    if (value > 45)
                        counter++;
                }
                System.out.println("Кол-во чисел больших чем 45: " + counter);

                //Задание 5
                List<String> city = new ArrayList<String>(Arrays.asList("LA", "New York", "San Francisco", "Paris","Moscow", "Tokyo", "Philadelfia"));
                city.forEach((n) -> System.out.println("В позиции " + city.indexOf(n) + " содержится " + n));

                //Задание 6
                Integer max = Integer.MIN_VALUE;
                Integer min = Integer.MAX_VALUE;
                for (Integer value : num) {
                    max = Integer.max(max, value);
                    min = Integer.min(min, value);
                }

                System.out.println("Минимальное значение: " + min);
                System.out.println("Максимальное значение: " + max);

                //Задание 7
                List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,9,2,12,4,5,11,13));
                Integer sum = 0;
                for (Integer value : numbers) {
                    sum += (value+3);
                }
                System.out.println("Результат: " + sum);

                //Задание 8
                for (int i =0;i<4;i++) {
                    System.out.println(i+"-й элемент списка: " + num.get(i));
                }
                for (int i =num.size()-3;i<num.size();i++) {
                    System.out.println(i+"-й элемент списка: " + num.get(i));
                }

                //Задание 9
                System.out.println("Список до сортировки");
                System.out.println(num);
                Collections.sort(num);
                System.out.println("Список после сортировки");
                System.out.println(num);

                //Задание 10
                List<Person> persons = new ArrayList<Person>();
                persons.add(new Person("Bermet",19));
                persons.add(new Person("Sultan", 13));
                persons.add(new Person("Bekjan",32));
                persons.add(new Person("Salia",16));
                persons.add(new Person("Aliya",21));
                persons.add(new Person("Adel", 25));
                persons.add(new Person("Maral", 20));
                persons.add(new Person("Sabrina",55));
                persons.add(new Person("Polina",23));
                persons.add(new Person("Katerina",9));
                persons.add(new Person("Alibek", 17));

                List<Person> new_persons = new ArrayList<Person>();
                for (Person person : persons) {
                    if (person.getAge() >= 18)
                        new_persons.add(person);
                }

                System.out.println("Новый список: ");
                for (Person person : new_persons) {
                    System.out.println(person.getName() + " " + person.getAge());
                }
            }
}
