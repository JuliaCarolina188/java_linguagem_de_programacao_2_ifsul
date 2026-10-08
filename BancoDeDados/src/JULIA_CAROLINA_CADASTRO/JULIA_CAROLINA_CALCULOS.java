package JULIA_CAROLINA_CADASTRO;

public class JULIA_CAROLINA_CALCULOS {
    private String nome = "";
    private int diaNascimento = 0;
    private int mesNascimento = 0;
    private int anoNascimento = 0;
    private String modalidade = "";
    private String sexo = "";
    private float peso = 0;
    private float altura = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float Imc() {
        return peso / (altura * altura);
    }

    public String Condicao() {
        float imc = Imc();

        if (sexo == "f") {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "Peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }

}
