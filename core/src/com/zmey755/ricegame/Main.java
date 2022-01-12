package com.zmey755.ricegame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class Main extends Game {
    //создаем обьект класса скрин
    private Screen gameScreen;
    @Override
    public void create() {
        //создаем экземпляр класса геймскрин
        gameScreen = new GameScreen();
        setScreen(gameScreen);

    }
}
