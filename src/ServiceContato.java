import java.util.ArrayList;

public class ServiceContato {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public ServiceContato() {
    }

    public ServiceContato(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarTelefones(Contato contato){
        int opc = 0;
        do {
            int codArea = Integer.parseInt(IO.readln("Digite o codigo de area: "));
            String numero = IO.readln("Digite o numero de telefone: ");
            String descricao = IO.readln("Digite a descricao: ");
            Telefone telefone = new Telefone(codArea, numero, descricao);
            contato.addTelefone(telefone);
            opc = Integer.parseInt(IO.readln("Digite 0 para sair, ou qualquer outra coisa para adicionar um novo telefone"));

        }while (opc != 0);
    }

    public void adicionarContato(){
        String nome = IO.readln("Digite o nome desejado: ");
        String email = IO.readln("Digite o email desejado: ");
        Contato contato = new Contato(nome, email);
        this.adicionarTelefones(contato);
        this.contatos.add(contato);
    }

    public void listarContatos(){
        for (int i = 0; i < this.contatos.size(); i++) {
            System.out.println("Indice: " + i);
            System.out.println(this.contatos.get(i).toString());
        }
    }

    public void removerContato(){
        this.listarContatos();
        int indice = Integer.parseInt(IO.readln("Digite o indice que deseja remover: "));
        int opc = Integer.parseInt(IO.readln("Digite 1 para deletar contato e 2 para deletar um numero deste contato: "));
        switch (opc){
            case 1:
                this.contatos.remove(indice);
                break;
            case 2:
                this.contatos.get(indice).deletarTelefone();
                break;
        }
    }

    public void editarContatos(){
        this.listarContatos();
        int indice = Integer.parseInt(IO.readln("Digite o indice que deseja editar: "));
        String nome = IO.readln("Digite o novo nome: ");
        String email = IO.readln("Digite o novo email: ");
        this.contatos.get(indice).setNome(nome);
        this.contatos.get(indice).setEmail(email);

        int opc = 0;
        do {
            this.contatos.get(indice).listarTelefones();
            System.out.println("Digite 1 para editar algum telefone, ou 0 para sair: ");
            opc = Integer.parseInt(IO.readln());
            if (opc == 1){
                int indiceTelefone = Integer.parseInt(IO.readln("Digite o indice que deseja editar: "));
                this.contatos.get(indice).editarTelefone(indiceTelefone);
            }
        }while (opc != 0);


    }


    public void menu(){
        int opc = 1;

        do {
            System.out.println("Menu");
            System.out.println("1- Adicionar contato");
            System.out.println("2- Remover contato");
            System.out.println("3- Editar contato");
            System.out.println("4- Listar contatos");
            System.out.println("0- Sair");
            opc = Integer.parseInt(IO.readln("Digite a opcao desejada: "));
            switch (opc){
                case 1:
                    this.adicionarContato();
                    break;
                case 2:
                    this.removerContato();
                    break;
                case 3:
                    this.editarContatos();
                    break;
                case 4:
                    this.listarContatos();
                    break;
                default:
                    System.out.println("opcao invalida!");
                    break;
            }
        }while (opc != 0);
    }
}


