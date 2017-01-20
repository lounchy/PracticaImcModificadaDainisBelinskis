package com.example.lounchy.practicaimc.Resultado;


/**
 * Cada objeto tiene 3 propiedades: limite, resultado, imagen
 */

public class ImcModelo {
    private float mLimite;
    private String res;
    private int imageRecurso;


/**
 * Creo nuevo constructor para Tabla model
 * @param mLimite es el limite de imc que ayudará sacar el resultado correcto
 * @param res es reultado corespondiente
 * @param imageRecurso es corespondiente imagen para resultado
 */
    public ImcModelo(int mLimite, String res, int imageRecurso) {
        this.mLimite = mLimite;
        this.res = res;
        this.imageRecurso = imageRecurso;
    }
    /*
    *Creo getters para sacar cada propiedad
    */
    public float getmLimite() {
        return mLimite;
    }
    public String getRes() {
        return res;
    }
    public int getImageRecurso() {
        return imageRecurso;
    }
}
