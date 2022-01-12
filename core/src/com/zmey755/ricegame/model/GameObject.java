package com.zmey755.ricegame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/*Создали класс который будет являться родительским для всех объектов игры
т.к у каждого объекта игры есть св-ва такие как размер координаты цвет итд
данный клас будет абстрактным и по сути нельзя будет создать объект этого класса ,
но можно будет унаследовать его параметры
*/
 abstract class GameObject {
    //по сути эта переменная содерж в себе как позицию так ширину и высоту
 Rectangle bounds;
//объект класса спрайт это объект который можно поворачивать он наследуется от региона текстур
// , а текстура это какая либо картинка.
 Sprite object;
//поэтому в конструкторе передаем 4 параметра
    //также передаем в параметры конструктора текстуру позже добавим регион текстур
 GameObject(Texture texture,float x, float y, float width, float height){
    //мы создали ограничивающую рамку bounds для объектов игры
bounds = new Rectangle(x,y,width,height);
//и создаем новый спрайт на основе нашей текстуры
    object = new Sprite(texture);
    //все мы сделали наш род-ский класс для всех объектов которые будут в игре не считая интерфейса
    // хотя возможно некотрые компоненты интерфейса будем наследовать также от этого класса
}
//создаем метод отрисовать
    public void draw (SpriteBatch batch){
   //сначала задаем нашему объекту размеры x,y ширина и высота
        object.setBounds(bounds.getX(),bounds.getY(),bounds.getWidth(),bounds.getHeight());
        //теперь просто отрисовываем наш объект
        object.draw(batch);
    }
}
