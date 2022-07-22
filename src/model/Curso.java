package model;
import model.Conteudo;

public class Curso extends Conteudo {


    @Override
    public double calcularXp() {
        return X_PADRAO * cargaHoraria;
    }

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "model.Curso{" +
                "titulo='" + titulo + '\'' +
                ", descritivo='" + descritivo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
