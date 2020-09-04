package ru.mirea.lab1;
import java.lang.*;
    public class Dog {
        private String name;
        private int age;
        public Dog(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Dog(String name){
            this.name = name;
            this.age = 1;
        }

        public Dog(int age){
            this.name = "Puppy";
            this.age = age;
        }

        public Dog(){
            name = "Puppy";
            age = 1;
        }

        public int intoHumanAge(){
           return this.age*7;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public int getAge() {
            return age;
        }
        public void getInformationOfDog(){
            System.out.println("--------------INFOMATION OF DOG---------------");
            System.out.println("Name of dog: " + this.getName());
            System.out.println("Age of dog: " + this.getAge());
            System.out.println("Age (human age): " + this.intoHumanAge());
            System.out.println("---------------------END---------------------");
        }


    }

