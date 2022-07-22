package model;

import model.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    @Override
            public double calcularXp(){
        return X_PADRAO + 20d;
    }

    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "model.Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descritivo='" + descritivo + '\'' +
                ", data=" + data +
                '}';
    }
}
