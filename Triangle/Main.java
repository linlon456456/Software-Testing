package org.example;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Software Testing_資訊三丁_D0931732_邱楷哲");

        try {
            Triangle T = new Triangle(1, 1, 1); //正三角形
            System.out.println(T.getTriType());

            T = new Triangle(2, 2, 3);      //等腰三角形
            System.out.println(T.getTriType());

            T = new Triangle(3, 2, 2);      //等腰三角形
            System.out.println(T.getTriType());

//            T = new Triangle(10, 23, 11);         //非三角形
//            System.out.println(T.getTriType());

            T = new Triangle(0, -1, -2);    //非三角形
            System.out.println(T.getTriType());

        } catch (TriangleException e) {
            e.printStackTrace();
        }
    }
}

//=============================Triangle=====================================
class Triangle {
    int a, b, c;
    String TriType;

    //======================================================建構子
    Triangle(int a, int b, int c) throws TriangleException {
        checkTriangle(a, b, c);
    }

    //======================================================method
    void checkTriangle(int a, int b, int c) throws TriangleException {

        assert a > 0 && b > 0 && c > 0 : "Warning!";

        if (a + b > c && b + c > a && c + a > b) {
            this.a = a;
            this.b = b;
            this.c = c;
            if (a == b)
                if (b == c) {
                    this.TriType = "正三角形";
                } else
                    this.TriType = "等腰三角形";
            else if (b == c) {
                assert (a != b);
                this.TriType = "等腰三角形";
            } else
                this.TriType = "三角形";
        } else
            throw new TriangleException(a, b, c);
    }

    //=====================================================getType
    String getTriType() {
        return "a: "+a+"\tb: "+b+"\tc: "+c+"\t-->\t"+this.TriType;
    }
}

//=============================Exception=====================================
class TriangleException extends Exception {
    int a, b, c;

    TriangleException(int a, int b, int c) {
        super("The side of triangle is wrong!");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}