package com.zmey755.ricegame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.zmey755.ricegame.model.Car;

//класс скрин по сути наш экран
public class GameScreen implements Screen {

    //чтобы отрисовать объект нам нужна текстура и отрисовщик
    private Texture carTexture;
    //объявляем отрисовщик
    private SpriteBatch batch;
    //добавляем ншу машинку
    private Car car;

    public GameScreen() {
    }

    @Override
    // в игре показать этот экран
    public void show() {
//инициализируем отрисовщик , те создаем экземпляр класса спрайтбатч
        batch = new SpriteBatch();
        //когда мы создаем текстуру мы должны указать путь к файлу
        // и строчкой internal мы говорим что путь к файлу относительный
        // т.е он идет из папки assets
        carTexture = new Texture(Gdx.files.internal("Car.png"));
        //объявляем экземпляр класса кар
        car = new Car(carTexture,0,0,83,159);
    }

    @Override
    public void render(float delta) {
        // в игре вызывается постоянно это по сути цикл время между кадрами в секундах
        //очистить экран иначе после движения объектов будет создаваться след
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //начало работы отрисовщика
        batch.begin();
        //теперь просто отрисовываем эту машинку
        car.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        //метод пересоздает размер камеры экрана нашей игры
    }

    @Override
    public void pause() {
        //метод пауза вызывается если мы сворачиваем игру
    }

    @Override
    public void resume() {
        //метод резюм вызывается если мы раз ворачиваем игру
    }

    @Override
    public void hide() {
        //метод хайд вызывается когда идет переключение на другой экран в игре
    }

    @Override
    public void dispose() {
        //уничтожение всех ресурсов после закрытия игры
        carTexture.dispose();
        batch.dispose();
    }
}
