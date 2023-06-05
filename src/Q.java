/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author netom
 */
public class Q {
    public String R;
    public String X;
    public boolean isEvaluado;

    public String getR() {
        return R;
    }

    public void setR(String R) {
        this.R = R;
    }

    public String getX() {
        return X;
    }

    public void setX(String X) {
        this.X = X;
    }

    public Q(String R, String X) {
        this.R = R;
        this.X = X;
        isEvaluado=false;
    }

    public boolean isIsEvaluado() {
        return isEvaluado;
    }

    public void setIsEvaluado(boolean isEvaluado) {
        this.isEvaluado = isEvaluado;
    }
    
}
