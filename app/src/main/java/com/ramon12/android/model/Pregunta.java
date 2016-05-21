package com.ramon12.android.model;

/**
 * Created by ramon12 on 21/05/2016.
 */
public class Pregunta {
    int mIdResTexto;
    boolean mRespuesraVerdadera;

    public Pregunta(int mIdResTexto, boolean mRespuesraVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuesraVerdadera = mRespuesraVerdadera;
    }

    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismRespuesraVerdadera() {
        return mRespuesraVerdadera;
    }

    public void setmRespuesraVerdadera(boolean mRespuesraVerdadera) {
        this.mRespuesraVerdadera = mRespuesraVerdadera;
    }
}
