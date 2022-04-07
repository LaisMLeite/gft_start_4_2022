package desafio3;


public class Pessoa {
    public String nomePessoa;
    public int idadePessoa;
    public Cachorro pet;

    public Pessoa(String nomePessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
            }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public Cachorro getPet() {
        return pet;
    }

    public void setPet(Cachorro pet) {
        this.pet = pet;
    }
}
