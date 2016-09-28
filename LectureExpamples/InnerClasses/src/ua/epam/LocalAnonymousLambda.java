package ua.epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 9/28/2016.
 */
public class LocalAnonymousLambda {
    public static void main(String[] args) {
        List<Ship> list = Arrays.asList(new Ship("aaa", 20000, 10000),
                                        new Ship("bbb", 25000, 15000)
                                        , new Ship("ccc", 40000, 5000));

        //list.sort(null);
        //System.out.println(list);

       final boolean reverse []= {true};

        class NameReverseComparator implements Comparator<Ship> {
            public int compare(Ship left, Ship right){
                return (reverse[0] ? -1 : 1) * left.getName().compareTo(right.getName());
            }
        }

        reverse[0] = false;

        list.sort(new NameReverseComparator());

        Comparator<Ship> tonnageComparator = new Comparator<Ship>() {

            public int compare(Ship o1, Ship o2) {
                return (int)(o1.getTonnage() - o2.getTonnage());
            }
        };

        list.sort(tonnageComparator);

        list.sort(new Comparator<Ship>() {
            @Override
            public int compare(Ship o1, Ship o2) {
                return o1.getEngine().getHp() - o2.getEngine().getHp();
            }
        });

        list.sort( (o1, o2) -> o1.getEngine().getHp() - o2.getEngine().getHp());


        System.out.println(list);
    }
}
