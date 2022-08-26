
package lab6p2_carlosmurillo;

import java.awt.Color;

public class Objetos {
    private String tipo;
    private Color color;
    private String descripcion;
    private String marca;
    private int tamano;
    private String calidad;
    private String persona;
    
    private String talla;
    private String suela;
    private String comodidad;
    
    private String talla2;
    private String tela;
    private String pais;
    private int num;
    
    private String descripcion2;
    private String instrucciones;
    private int tiempo;

    public Objetos() {
    }

    public Objetos(String tipo, Color color, String descripcion, String marca, int tamano, String calidad, String persona, String talla, String suela, String comodidad) {
        this.tipo = tipo;
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.persona = persona;
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }
    
    public Objetos(String tipo, Color color, String descripcion, String marca, int tamano, String calidad, String persona, String talla2, String tela, String pais, int num) {
        this.tipo = tipo;
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.persona = persona;
        this.talla2 = talla2;
        this.tela = tela;
        this.pais = pais;
    }

    public Objetos(String tipo, Color color, String descripcion, String marca, int tamano, String calidad, String persona, String descripcion2, String instrucciones, int tiempo) {
        this.tipo = tipo;
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.persona = persona;
        this.descripcion2 = descripcion2;
        this.instrucciones = instrucciones;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public String getComodidad() {
        return comodidad;
    }

    public void setComodidad(String comodidad) {
        this.comodidad = comodidad;
    }

    public String getTalla2() {
        return talla2;
    }

    public void setTalla2(String talla2) {
        this.talla2 = talla2;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return  color + "        " + marca + "        " + persona;
    }
    
    
    
    
    
}
