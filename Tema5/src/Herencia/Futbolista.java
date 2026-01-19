package Herencia;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcación;

    public void entrevista(){
        System.out.println("Entrevista de ANTENA3");
    }

    public Futbolista(){}

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcación) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }
    

}
