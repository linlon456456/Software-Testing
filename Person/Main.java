package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Software Testing_資訊三丁_D0931732_邱楷哲\n");
        System.out.println("\tName\tAge\t BMI");
        float bmi;
        String name;
        int age;

//Person 1---------------------------------------------------------------------
        Person kevin = null;
        try {
            kevin = new Person("Kevin", 2025);                         //設定出生年不合理
            kevin.setHW(3.2f, 65);                                      //設定身高不合理
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        bmi = kevin.getBMI();
        name = kevin.getName();
        age = kevin.getAge();
        System.out.println("P1: "+name+"\t"+age+"\t "+bmi+"\n");

//Person 2---------------------------------------------------------------------
        Person jimmy = null;
        try {
            jimmy = new Person("Jimmy", 1.7f, 800, 2000); //設定體重不合理
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        jimmy.setHW(1.7f, 60);
        bmi = jimmy.getBMI();
        name = jimmy.getName();
        age = jimmy.getAge();
        System.out.println("P2: "+name+"\t"+age+"\t "+bmi+"\n");
    }
}