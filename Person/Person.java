package org.example;
public class Person {
    String name;
    float height, weight, bmi;
    int age;

    //======================================================建構子
    public Person(String name, int birthYear) throws Exception {
        this.name = name;
        setAge(birthYear);
    }

    //======================================================建構子
    public Person(String name, float height, float weight, int birthYear) throws Exception {
        setAge(birthYear);
        this.name = name;
        setHW(height, weight);
    }

    //======================================================建構子(no exception)
    public Person(String name){
        this.name = name;
    }

    //======================================================set HW
    public void setHW(float height, float weight) throws Exception{
        if(height > 2.5){
            throw new Exception("invalid Height");
        }
        if(weight > 500 || weight <= 0){
            throw new Exception("invalid Weight");
        }
        this.height = height;
        this.weight = weight;
        this.bmi = weight / (height*height);
    }

    //======================================================set Age
    public void setAge(int birthYear) throws Exception{
        if(birthYear > 2023){
            throw new Exception("invalid birthYear");
        }
        this.age = 2023 - birthYear;
    }

    //======================================================get Age
    int getAge(){
        assert this.age >= 0 && this.age <150;
        return age;
    }
    //======================================================get Name
    String getName(){
        return this.name;
    }
    //======================================================get BMI
    float getBMI(){
        assert this.bmi > 15 && this.bmi <= 40 ; //: "BMI error!"
        return bmi;
    }
}