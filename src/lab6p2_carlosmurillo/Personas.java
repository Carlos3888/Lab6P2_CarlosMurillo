
package lab6p2_carlosmurillo;

public class Personas {
    private String tipo;
    private String id;
    private String nombre;
    private int edad;
    private String sexo;
    private String estado;
    private double altura;
    private double peso;
    
    private String usuario;
    private String contra;
    private String cargo;
    
    private String ocupacion;
    private String horario;
    private int tiempo;
    private double sueldo;

    public Personas() {
    }

    public Personas(String tipo, String id, String nombre, int edad, String sexo, String estado, double altura, double peso, String usuario, String contra, String cargo) {
        this.tipo = tipo;
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public Personas(String tipo, String id,  String nombre, int edad, String sexo, String estado, double altura, double peso, String ocupacion, String horario, int tiempo, double sueldo) {
        this.tipo = tipo;
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre+"       "+tipo;
    }
    
    
}
