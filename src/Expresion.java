
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author netom
 */
public class Expresion {

    String X;
    ArrayList<Q> elemento;
    boolean isAlrden = false;

    public Expresion() {
        elemento = new ArrayList<>();
        X = "";
    }

    public int getSize() {
        return this.elemento.size();
    }

    public Expresion(String X) {
        elemento = new ArrayList<>();
        this.X = X;
    }

    public String getX() {
        return X;
    }

    public void setX(String X) {
        this.X = X;
    }

    public List getElemnt() {
        return elemento;
    }

    public Q getElementoByIndex(int i) {
        return this.elemento.get(i);
    }

    public void setElementobyInedx(Q q, int i) {
        this.elemento.set(i, q);
    }

    public void addExprecionStr(String r, String x) {
        this.elemento.add(new Q(r, x));
    }

    public void addExpresion(Q q) {
        this.elemento.add(q);
    }

    void mostrarExpresion() {
        System.out.print(X + "=");
        for (int i = 0; i < this.elemento.size(); i++) {
            System.out.print(this.elemento.get(i).R + this.elemento.get(i).X);
            if ((i + 1) == this.elemento.size()) {
                System.out.println("");
            } else {
                System.out.print("+");
            }
        }
    }

    public String getExpresion() {
        String res = "";
        for (int i = 0; i < this.elemento.size(); i++) {

            res += this.elemento.get(i).R + this.elemento.get(i).X;

            if ((i + 1) == this.elemento.size()) {
                res += "";

            } else {
                res += "+";
            }
        }
        return res;
    }

    public boolean isAren() {
        for (int i = 0; i < getSize(); i++) {
            if (this.X.equals(this.elemento.get(i).X)) {
                Q q = this.elemento.get(i);
                if (q.R.equals("v")) {
                    q.setIsEvaluado(true);
                }
                if (elemento.size() == 1) {
                    q.isEvaluado = true;
                }
                if (q.R.contains("v")) {
                    if ((i + 1) == this.elemento.size()) {
                        q.R = "";
                        q.X = "";
                    } else {
                        q.R = "";
                        q.X = this.elemento.get(i + 1).X;
                        this.elemento.set(i, q);
                        this.elemento.remove(i + 1);
                    }
                } else {
                    if ((i + 1) == this.elemento.size()) {
                        q.R = q.R + "*";
                        q.X = "";
                    } else {
                        q.R = q.R + "*" + this.elemento.get(i + 1).R;
                        q.X = this.elemento.get(i + 1).X;
                        this.elemento.set(i, q);
                        this.elemento.remove(i + 1);
                    }
                }
                isAren();
            }
        }
        if (elemento.size() == 1 && elemento.get(0).isEvaluado && elemento.get(0).X.equals("")) {
            this.isAlrden = true;
            return true;
        } else {
            this.isAlrden = false;
            return false;
        }
    }




    Q ArdenNodo() {
        return elemento.get(0);
    }

}
