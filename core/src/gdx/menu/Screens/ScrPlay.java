package gdx.menu.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import gdx.menu.GdxMenu;
import gdx.menu.TbMenu;
import gdx.menu.TbsMenu;

/**
 * Created by luke on 2016-04-05.
 */
public class ScrPlay implements Screen, InputProcessor {
    GdxMenu gdxMenu;
    TbsMenu tbsMenu;
    TbMenu tbMenu, tbOptions, tbGameover;
    Stage stage;
    SpriteBatch batch;
    BitmapFont screenName;
    Texture grass;
    Sprite grassmap;
    Texture tree;
    Sprite treeobject;
    Texture rock;
    Sprite rockobject;
    Texture txtPig;
    Sprite sprPig;
    Texture txtPig2;
    Sprite sprPig2;
    Texture slime;
    Sprite slimeenimy;
    Texture slimeball;
    Sprite slimeballobject;
        public int nXpos1 = (int)(Math.random() * 240 + 1);
        public int nXpos2 = (int)(Math.random() * 240 + 1);
        public int nYpos1 = (int)(Math.random() * 240 + 1);
        public int nYpos2 = (int)(Math.random() * -240 + 1);
        public int nYpos3 = 0;
        public int nXpos3 = 240;
        public int nXpos4 = 240;
        public int nYpos4 = 300;
        public int nXpos5 = 240;
        public int nYpos5 = 300;
        public int nDirect = -1;

    public ScrPlay(GdxMenu _gdxMenu) {  //Referencing the main class.
        gdxMenu = _gdxMenu;
    }

    public void show() {
        slimeball = new Texture("slimeball1.png");
        slimeballobject = new Sprite(slimeball);
        txtPig = new Texture("Pig.png");
        sprPig = new Sprite(txtPig);
        txtPig2 = new Texture("Pig2.png");
        sprPig2 = new Sprite(txtPig2);
        slime = new Texture("slime.png");
        slimeenimy = new Sprite(slime);
        grass = new Texture("Grass Tile Demo.png");
        grassmap = new Sprite(grass);
        tree = new Texture("tree.png");
        treeobject = new Sprite(tree);
        rock = new Texture("Rock.png");
        rockobject = new Sprite(rock);
        stage = new Stage();
        tbsMenu = new TbsMenu();
        batch = new SpriteBatch();
        screenName = new BitmapFont();
        tbOptions = new TbMenu("OPTIONS", tbsMenu);
        tbOptions.setY(0);
        tbOptions.setX(440);
        stage.addActor(tbOptions);
        Gdx.input.setInputProcessor(stage);
        btnOptionsListener();
        
    }

    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(grassmap, 0,0,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(treeobject, nXpos1,nYpos1,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(rockobject, nXpos2+100,nYpos2-150,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(slimeballobject, nXpos4,nYpos4,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(slimeballobject, nXpos5,nYpos5,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        
        if(nDirect==-1){
        batch.draw(sprPig, nXpos3+100,nYpos3+150,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3,nYpos3+100,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3+100,nYpos3+50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(slimeenimy, nXpos3,nYpos3,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3+100,nYpos3-50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3,nYpos3-100,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3+100,nYpos3-150,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3-200,nYpos3,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3-100,nYpos3-50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig, nXpos3-100,nYpos3+50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
       
        batch.end();
        stage.act();
        stage.draw();
    }
        else if(nDirect==1){
        batch.draw(sprPig2, nXpos3+100,nYpos3+150,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3,nYpos3+100,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3+100,nYpos3+50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(slimeenimy, nXpos3,nYpos3,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3+100,nYpos3-50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3,nYpos3-100,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3+100,nYpos3-150,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3-200,nYpos3,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3-100,nYpos3-50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(sprPig2, nXpos3-100,nYpos3+50,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        
        batch.end();
        stage.act();
        stage.draw();
    }
        //if(nXpos3 >= 0){
            nXpos4-=5;
            //nYpos5 = 1000;
            nYpos4 = 0;
        //}
        //if(nXpos3 <= 0){
            nXpos5+=5;
           // nYpos4 = 1000;
            nYpos5 = 0;
        //}
        
         nXpos3+=nDirect;
         
         if(nXpos4 <= -305 && nXpos4 >= -310){
             nXpos4 = nXpos3;
         }
         if(nXpos5 >= 305 && nXpos5 <= 310){
             nXpos5 = nXpos3+30;
         }
        if(nXpos3 == -240 || nXpos3 == 240){
            nDirect = nDirect*(-1);
        }
        
    }

    public void btnOptionsListener() {
        tbOptions.addListener(new ChangeListener() {
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                gdxMenu.currentState = gdxMenu.gameState.OPTI;
                gdxMenu.updateState();
            }
        });
    }
    
   

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}