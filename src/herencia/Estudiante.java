
package herencia;


public class Estudiante extends Persona{
    
    //////////atributos de la subclase Estudiante///////////
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias; 
    
    /////////constructor de la subclase////////////////////
    public Estudiante(String nombre, String apellido, int edad, int peso, String carnet,
            double promedioNotas, int numeroMaterias) {
        
        ///////////el operador super para establecer el constructor de la superclase///////
        super(nombre, apellido, edad, peso);
        
        //////definimos los atributos propios del objeto/////////
        this.carnet=carnet;
        this.numeroMaterias=numeroMaterias;
        this.promedioNotas=numeroMaterias;
    }
    
    ///////metodos de encapsulamiento (get y set)////////
   
    public String getCarnet() {
        return carnet;
    }

    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    
    public double getPromedioNotas() {
        return promedioNotas;
    }

    
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

   
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    ///////metodos propios del estudiante////////
    
    /////metodo para calcular el promedio de notas////////////
    public double calcularPromedio (double totalNotas, int numeroNotas){
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double nota4=0;
        double promedio=0;
        
        totalNotas=nota1+nota2+nota3+nota4;
        promedio=totalNotas/4;
        return (promedio);
    }
    
    
    
}
