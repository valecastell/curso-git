public class Cliente {
    private int codigoCliente;
    private String nombre;

    @Override
    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
        if (!(obj instanceof Cliente)){
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return (this.codigoCliente == 100);
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(int codigoCliente, String nombre) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
    }
}
