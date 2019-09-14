
package herencia;

import javax.swing.JOptionPane;


public class Estudiante extends Persona{
    
    //////////atributos de la subclase Estudiante///////////
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias; 
    
    ///constructor de la clase////
    public Estudiante()
    {
        // TODO Auto-generated constructor stub
    }
    
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

   //// public Estudiante() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
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
    public double calcularPromedio (double totalNotas, int numeroMaterias){
        
        double promedio=0;
        
        
        promedio=totalNotas/numeroMaterias;
        return (promedio);
    }
    
    ////metodo para solicitar datos del estudiante///////
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet="";
        int numeroMaterias=0;
        double totalNotas=0;
        double notas=0;
        double promedio=0;
        
        carnet=leerDatoTipoCadena("ingrese numero de carnet");
        nombre = leerDatoTipoCadena("Ingrese el nombre del empleado: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del empleado: ");
        edad = leerDatoTipoEntero("Ingrese la edad del empleado: ");
        peso = leerDatoTipoReal("Ingrese el peso del empleado: ");
        numeroMaterias=leerDatoTipoEntero("cantidad de materias vistas");
        
        ////obtener los datos que no hacen parte de la clase/////
        for(int i=0;i<numeroMaterias;i++){
            notas=Integer.parseInt(JOptionPane.showInputDialog("nota de la materia"));
            totalNotas=totalNotas+notas;
        }
       
        
        /////calculamos el promedio/////////
        promedio=calcularPromedio(totalNotas, numeroMaterias);
        
        ////definimos datos para el constructor/////
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedio);
        
        return (nuevoEstudiante);
    }
    
    /////metodo para imprimir el reporte de status del estudiante/////
    public void imprimirReporteEstadoEstudiante(){
        /////imprimimos a travez de la herencia los datos del estudiante////
        imprimirDatosPersona();
        
        //////ahora imprimimos los datos propios del estudiante////////
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es: "+carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias que ve el estudiante es: "+numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio de notas del estudiante es "+promedioNotas);
    }
    
    
    
}
