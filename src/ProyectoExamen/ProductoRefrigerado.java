package ProyectoExamen;

public class ProductoRefrigerado extends Producto {
    private String codigoSupervisionAlimentaria;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "Desconocido";
    }

    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }

    public String getCodigoSupervisionAlimentaria(){
        return codigoSupervisionAlimentaria;
    }

    public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Codigo de Supervision Alimentaria: " + getCodigoSupervisionAlimentaria());
    }
}
