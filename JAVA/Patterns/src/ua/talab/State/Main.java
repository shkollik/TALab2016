package ua.talab.State;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Optin #1
//        Station radio7 = new Radio7();
//        Radio radio = new Radio();
//        radio.setStation(radio7);
//
//        for(int i=0; i < 10; i++){
//            radio.nextStation();
//            radio.play();
//        }

        //option #2
        Human human = new Human();
        human.setState(new Work());
        for(int i = 0; i < 10; i++){
            human.doSomething();
        }



    }
}
