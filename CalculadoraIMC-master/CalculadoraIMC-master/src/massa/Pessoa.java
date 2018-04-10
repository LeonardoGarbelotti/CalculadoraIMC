//Alunos: Bruno Mendonça Santos RA: 120156
//        Leonardo Garbelotti Gonçalvez RA: 120157

package massa;


public class Pessoa {

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
    public void calcularImc(){
        this.imc = peso/(altura*altura);
        
    }
    public String comparacoesIMC(){
        String resposta;
        if(getImc()<=18.5){
            resposta = " Abaixo do peso";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc())+ " -Abaixo do peso");
        }else if(getImc()>18.5 && getImc()<=24.9){
            resposta = " Peso normal";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Peso normal");
        }else if(getImc()>24.8 && getImc()<=29.9){
            resposta = " Sobrepeso";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Sobrepeso");
        }else if(getImc()>29.9 && getImc()<=34.9){
            resposta = " Obesidade";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Obesidade");
        }else if(getImc()>34.9 && getImc()<=39.9){
            resposta = " Obesidade moderada";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Obesidade moderada");
        }else if(getImc()>39.9 && getImc()<=49.9){
            resposta = " Obesidade severa";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Obesidade severa");
        }else if(getImc()>49.9){
            resposta = " Obesidade morbida";
            return resposta;
            //jIMC.setText(String.valueOf(pessoa.getImc()) + " -Obesidade morbida");
        }
        return null;
        
    }
    private float peso;
    private float altura;
    private float imc;
    
    public Pessoa(){
        peso =0;
        altura =0;
        imc =0;
    }
}
