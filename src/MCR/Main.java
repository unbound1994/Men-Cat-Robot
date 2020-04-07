package MCR;

import static MCR.Treadmill.*;

public class Main {

    public static void main(String[] args) {

        //Беговая дорожка/Стена Человек
        System.out.println();

        if (Men.Run > Treadmill.Lenght) {
            System.out.println(Men.Name + " бежал " + Men.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
        } else {
            System.out.println(Men.Name + " бежал " + Men.Run + "м" + " И не хватило сил добежать до " + Treadmill.Lenght + "м");
        }

        if (Men.Jump > Wall.Hight) {
            System.out.println(Men.Name + " прыгнул на " + Men.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м");
        } else {
            System.out.println(Men.Name + " прыгнул на " + Men.Jump + "м" + " И свалилася, не допрыгнув до " + Wall.Hight + "м");
        }

        //Беговая дорожка/Стена Кот

        if (Cat.Run > Treadmill.Lenght) {
            System.out.println(Cat.Name + " бежал " + Cat.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
        } else {
            System.out.println(Cat.Name + " бежал " + Cat.Run + "м" + " И не хватило сил добежать до " + Treadmill.Lenght + "м");
        }

        if (Cat.Jump > Wall.Hight) {
            System.out.println(Cat.Name + " прыгнул на " + Cat.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м");
        } else {
            System.out.println(Cat.Name + " прыгнул на " + Cat.Jump + "м" + " И повис на стене, не допрыгнув до " + Wall.Hight + "м");
        }

        //Беговая дорожка/Стена Робот

        if (Robot.Run > Treadmill.Lenght) {
            System.out.println(Robot.Name + " бежал " + Robot.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
        } else {
            System.out.println(Robot.Name + " бежал " + Robot.Run + "м" + " И не хватило сил добежать до " + Treadmill.Lenght + "м");
        }

        if (Robot.Jump > Wall.Hight) {
            System.out.println(Robot.Name + " прыгнул на " + Robot.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м\n");
        } else {
            System.out.println(Robot.Name + " прыгнул на " + Men.Jump + "м" + " И свалилася, не допрыгнув до " + Wall.Hight + "м\n");
        }


        //Прохождение препятствий с использованием массивов

        int [][] MCR = new int [][]{{Men.Run, Cat.Run, Robot.Run},{ Men.Jump, Cat.Jump, Robot.Jump}};
        int [] TW = new int[] {Treadmill.Lenght, Wall.Hight};
        String [] name = new String[] {"беговая дорожка","стена"};
        for (int i=0; i<MCR[0].length; i++){
            for (int j=0; j<TW.length; j++){
                if (MCR[j][i]>TW[j]){
                    System.out.println("Препятствие " + name[j] + " пройдено");
                } else {
                    System.out.println("Препятствие " + name[j] + " не пройдено");
                }
            }
        }
        System.out.println();

        //Прохождение препятствий

        System.out.println("Начало соревнования:\n");

        int allPass = 0;

        if (Men.Run > Treadmill.Lenght) {
            System.out.println(Men.Name + " бежал " + Men.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
            allPass++;
            if (Men.Jump > Wall.Hight) {
                System.out.println(Men.Name + " прыгнул на " + Men.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м");
                allPass++;
            }
        }

        if (Cat.Run > Treadmill.Lenght) {
            System.out.println(Cat.Name + " бежал " + Cat.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
            allPass++;
            if (Cat.Jump > Wall.Hight) {
                System.out.println(Cat.Name + " прыгнул на " + Cat.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м");
                allPass++;
            }
        }

        if (Robot.Run > Treadmill.Lenght) {
            System.out.println(Robot.Name + " бежал " + Robot.Run + "м" + " И успешно пробежал " + Treadmill.Lenght + "м");
            allPass++;
            if (Robot.Jump > Wall.Hight) {
                System.out.println(Robot.Name + " прыгнул на " + Robot.Jump + "м" + " И успешно перепрыгнул стену " + Wall.Hight + "м");
                allPass++;
            }
        }

        if (allPass==0) System.out.println("Итог: \n" + "Никто не смог пройти ни одного препятствия :(");
    }
}


