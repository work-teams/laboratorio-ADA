package tareaGrupal01;

public class Objeto {
    
     private int beneficioDelObjeto;
  private int pesoDelObjeto;
  private float beneficioPesoDelObjeto;

    public Objeto(int beneficioDelObjeto, int pesoDelObjeto, float beneficioPesoDelObjeto) {
        this.beneficioDelObjeto = beneficioDelObjeto;
        this.pesoDelObjeto = pesoDelObjeto;
        this.beneficioPesoDelObjeto = beneficioPesoDelObjeto;
    }

    public int getBeneficioDelObjeto() {
        return beneficioDelObjeto;
    }

    public void setBeneficioDelObjeto(int beneficioDelObjeto) {
        this.beneficioDelObjeto = beneficioDelObjeto;
    }

    public int getPesoDelObjeto() {
        return pesoDelObjeto;
    }

    public void setPesoDelObjeto(int pesoDelObjeto) {
        this.pesoDelObjeto = pesoDelObjeto;
    }

    public float getBeneficioPesoDelObjeto() {
        return beneficioPesoDelObjeto;
    }

    public void setBeneficioPesoDelObjeto(float beneficioPesoDelObjeto) {
        this.beneficioPesoDelObjeto = beneficioPesoDelObjeto;
    }
    
}
