package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        hare.tryEat(ball);
        ball.run(hare);
        wolf.tryEat(ball);
        ball.run(wolf);
        fox.eat(ball);
        ball.died(ball);
    }
}
