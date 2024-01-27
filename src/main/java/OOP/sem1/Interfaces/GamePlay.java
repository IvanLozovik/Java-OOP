package OOP.sem1.Interfaces;

import OOP.sem1.TypeOfHeroes.Hero;

import java.util.ArrayList;

public interface GamePlay {
    void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllias);
}
