package com.gotmiluk.munchingtime;

import com.badlogic.gdx.Game;

public class MunchingTime extends Game {
    ScrMenu scrMenu;


    int nScreen; // 0 for menu, 1 for play

    public void updateState(int _nScreen) {
        nScreen = _nScreen;
        if (nScreen == 0) {
            setScreen(scrMenu);
        }
        }


    @Override
    public void create() {
        nScreen = 0;
        // notice that "this" is passed to each screen. Each screen now has access to methods within the "game" master program
        scrMenu = new ScrMenu(this);


        updateState(0);
    }


    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

}
