import java.util.ArrayList;

public class Contato {

    private String nome;
    private String email;
    private ArrayList<Telefone> telefones = new ArrayList<>();

    public Contato() {

    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Contato(String nome, String email, ArrayList<Telefone> telefones) {
        this.nome = nome;
        this.email = email;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);

    }

    public void listarTelefones(){
        for (int i = 0; i < this.telefones.size(); i++) {
            System.out.println("Indice: " + i);
            System.out.println(this.telefones.get(i));

        }
    }

    public void editarTelefone(int indice){
        this.telefones.get(indice).setCodArea(Integer.parseInt(IO.readln("Digite um novo codigo de área: ")));
        this.telefones.get(indice).setNumero(IO.readln("Digite um novo numero: "));
        this.telefones.get(indice).setDescricao(IO.readln("Digite uma nova descriçao: "));
    }

    public void deletarTelefone(){
        this.listarTelefones();
        int indice = Integer.parseInt(IO.readln("Digite o indice do numero que deseja remover: "));
        this.telefones.remove(indice);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefones=" + telefones +
                '}';
    }

}
