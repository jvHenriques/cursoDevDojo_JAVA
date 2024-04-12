package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //reflexivo: x.equals(x) tem que ser true para tudo que é diferente de null;
    //simetrico: para x e y diferente de null, e x.equals(y) = true logo, y.equals(x) = true;
    //transitividade: para x,y,z diferente de null, se x.equals(y) = true, e x.equals(z) = true logo, y.equals(z) = true;
    //consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false;
    @Override
    public boolean equals(Object obj) {
        if (obj == null)return  false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true    |  x.hashCode == y.hashCode
    // x.hashCode == y.hashCode  |  não necessariamente x.equals(y) == true
    // x.equals(y) == false      |  x.hashCode != y.hashCode
    // x.hashCode != y.hashCode   |  x.equals(y) deverá ser false
    public int hashCode(){
        return serialNumber == null ? 0 :   serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
