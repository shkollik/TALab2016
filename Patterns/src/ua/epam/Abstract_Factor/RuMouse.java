package ua.epam.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class RuMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной щелчок мышью");

    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Скроллим вверх");
        }
        else if(direction < 0){
            System.out.println("Скроллим вниз");
        }
        else{
            System.out.println("Не скроллим");
        }

    }
}
