package ru.mirea.lab71;

public class Main {
    public static void main(String args[])
    {
        MovableRectangle movableRectangle = new MovableRectangle(new MovablePoint(0,0,0,1), new MovablePoint(0,0,0,0));

        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveLeft();
        movableRectangle.moveRight();
        boolean isSameSpeed = movableRectangle.speedTest();

        System.out.println(String.format("Точки:\n%sОдинаковая скорость: %s",movableRectangle.toString(), isSameSpeed));
    }
}
