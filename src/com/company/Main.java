package com.company;

public class Main {

    public static void main(String[] args) {
	Gamer gamer = new Gamer("Pro", 2000);

    CheckGamerName checkGamerName =  new CheckGamerName();

    checkGamerName.showGamerScore(gamer);
    }
}
