package com.example.lounchy.practicaimc.Tabla;


/**
 * Cada objeto tiene 6 propiedades: altura, bajo peso, peso ideal, sobrepeso, obesidad, obesidad mórbida
 */

public class TablaModelo {
    private String mAltura;
    private String mBajoPeso;
    private String mPesoIdeal;
    private String mSobrepeso;
    private String mObesidad;
    private String mObesidadMorbida;

    /**
     * Creo nuevo constructor para Tabla model
     * @param mAltura es la altura en cm
     * @param mBajoPeso es corespondiente peso para bajo peso
     * @param mPesoIdeal es corespondiente peso para peso ideal
     * @param mSobrepeso es corespondiente peso para sobrepeso
     * @param mObesidad es corespondiente peso para obesidad
     * @param mObesidadMorbida es corespondiente peso para obesidad mórbida
     */
    public TablaModelo(String mAltura, String mBajoPeso, String mPesoIdeal, String mSobrepeso, String mObesidad, String mObesidadMorbida) {
        this.mAltura = mAltura;
        this.mBajoPeso = mBajoPeso;
        this.mPesoIdeal = mPesoIdeal;
        this.mSobrepeso = mSobrepeso;
        this.mObesidad = mObesidad;
        this.mObesidadMorbida = mObesidadMorbida;
    }

    /*
    *Creo getters para sacar cada propiedad
     */
    public String getmAltura() {
        return mAltura;
    }

    public String getmBajoPeso() {
        return mBajoPeso;
    }

    public String getmPesoIdeal() {
        return mPesoIdeal;
    }

    public String getmSobrepeso() {
        return mSobrepeso;
    }

    public String getmObesidad() {
        return mObesidad;
    }

    public String getmObesidadMorbida() {
        return mObesidadMorbida;
    }
}

