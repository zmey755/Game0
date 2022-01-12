package com.zmey755.ricegame.model;

import com.badlogic.gdx.graphics.Texture;

//класс просто машинка унаследуем его от родительского класса всех объектов GameObject
//нажимаем альт+ интер и сразу нам добавится унаследованный конструктор для объектов
public class Car extends GameObject {
    public Car(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
    }
}
