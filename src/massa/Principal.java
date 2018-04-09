//Alunos: Bruno Mendonça Santos RA: 120156
//        Leonardo Garbelotti Gonçalvez RA: 120157

package massa;


public class Principal {

    public float getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = Float.valueOf(peso);
    }
    
    public void setPeso(float peso) { //metodo setPeso sobrecarregado
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = Float.valueOf(altura);
    }
    public void setAltura(float altura) { //metodo setAltura sobrecarregado
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float peso, float altura) {
        
        this.imc = peso/(altura*altura);
    }
    private float peso;
    private float altura;
    private float imc;
    
    public Principal(){
        peso =0;
        altura =0;
        imc =0;
    }
}
