package com.example.abstracts;

public class Abstracts {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 通过形状工厂创建圆形
        Shape circle = shapeFactory.createShape();
        circle.draw();

        // 获取正方形工厂
        AbstractFactory squareFactory = FactoryProducer.getFactory("SQUARE");

        // 通过正方形工厂创建正方形
        Shape square = squareFactory.createShape();
        square.draw();
    }
}

// 抽象产品接口
interface Shape {
    void draw();
}

// 具体产品类：圆形
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

// 具体产品类：长方形
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

// 具体产品类：正方形
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

// 抽象工厂接口
interface AbstractFactory {
    Shape createShape();
}

// 具体工厂类：形状工厂
class ShapeFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle(); // 这里可以根据需要返回不同的具体产品
    }
}

// 具体工厂类：正方形工厂
class SquareFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

// 具体工厂类：长方形工厂
class RectangleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

// 客户端类

// 工厂生产器，根据需要获取具体的工厂
class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("SQUARE")) {
            return new SquareFactory();
        } else if (choice.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleFactory();
        }
        return null;
    }
}
