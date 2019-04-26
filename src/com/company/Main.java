package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.awt.Color.white;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 25; i++) {

            ArrayList<String>rice= new ArrayList<>();

            rice.add("white");
            rice.add("brown");
            rice.add("no rice");

            Random rnd = new Random();
            int a = rnd.nextInt(rice.size());

            ArrayList<String>meat = new ArrayList<>();

            meat.add("chicken meat");
            meat.add ("steak");
            meat.add("carnidas");
            meat.add("chorizo");
            meat.add("sofritas");
            meat.add("veggies");

            int b = rnd.nextInt(meat.size());

            ArrayList<String>beans = new ArrayList<>();
            beans.add("pinto");
            beans.add("black");
            beans.add("no beans");
            int c = rnd.nextInt(beans.size());

            ArrayList<String>salsa = new ArrayList<>();
            salsa.add("mild salsa");
            salsa.add("medium salsa");
            salsa.add("hot salsa");
            salsa.add("no salsa");
            salsa.add("all salsa");
            int d = rnd.nextInt(salsa.size());

            ArrayList<String>veggies = new ArrayList<>();
            veggies.add("lettuce");
            veggies.add("fajita veggies");
            veggies.add("no veggies");
            veggies.add("all veggies");
            int k = rnd.nextInt(veggies.size());

            ArrayList<String>cheese = new ArrayList<>();
            cheese.add("cheese");
            cheese.add("no cheese");
            int h = rnd.nextInt(cheese.size());

            ArrayList<String>guac = new ArrayList<>();
            guac.add("guac");
            guac.add("no guac");
            int g = rnd.nextInt(guac.size());

            ArrayList<String>sourcream = new ArrayList<>();
            sourcream.add("sour cream");
            sourcream.add("no sour cream");
            int s = rnd.nextInt(sourcream.size());


                System.out.println("Burrito\t" + i + ":\t" + rice.get(a) + ",\t" + meat.get(b) + ",\t" + beans.get(c) + ",\t" + salsa.get(d) + ",\t" + veggies.get(k) + ",\t" + cheese.get(h) + ",\t" + guac.get(g)+ ",\t" + sourcream.get(s));
            }

        }
    }

