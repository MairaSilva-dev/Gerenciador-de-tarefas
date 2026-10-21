import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){


        Tarefa t = new Tarefa(1, "Estudar Java", "Estudar classes e objetos");

        Tarefa t1 = new Tarefa(2, "Estudar HTML E CCS3", "Estilizar os elementos");

        Tarefa t2 = new Tarefa(3, "Fazer trabalho da faculdade", "Sobre projeto de Expansão");

        Tarefa t3 = new Tarefa(4, "Ir a academia", "fazer exercicios e cuidar da saúde");

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(t);
        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);

        for (int i = 0; i < tarefas.size(); i++ ){
            System.out.println("ID: " + tarefas.get(i).id);
            System.out.println("Título: " + tarefas.get(i).titulo);
            System.out.println("Descrição: " + tarefas.get(i).descricao);
            System.out.println("Conclusão: " + tarefas.get(i).concluido);

            System.out.println("-----------------");

        }
        Scanner ler= new Scanner(System.in);

        System.out.println("Digite uma nova tarefa: ");
        String titulo = ler.nextLine();

        System.out.println("Digite a descrição da tarefa: ");
        String descricao = ler.nextLine();

        Tarefa nv = new Tarefa(tarefas.size()+1, titulo, descricao);

        tarefas.add(nv);

        System.out.println("Tarefa cadastra com sucesso");
        System.out.println("----------");

        int idEscolhido;
        String resposta = "s";

        do{
            System.out.println("Digite a tarefa que deseja concluir: ");
            idEscolhido = ler.nextInt();

            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i) .id == idEscolhido) {
                    tarefas.get(i).concluido = true;
                    System.out.println("Tarefa Concluída!");

                }
            }
            ler.nextLine();

            System.out.println("Deseja concluir outra tarefa: S/N");
            resposta  =ler.nextLine();
        }while (resposta.equalsIgnoreCase("s"));

        System.out.println("=====LISTA=ATUALIZADA=====");

        for (int i =0; i < tarefas.size(); i++){
            System.out.println("ID: " + tarefas.get(i).id);
            System.out.println("Título: " + tarefas.get(i).titulo);
            System.out.println("Descrição: " + tarefas.get(i).descricao);

            if (tarefas.get(i).concluido == true){
                System.out.println("Status: Concluído");
            }
            else {
                System.out.println("Status: Pendente");
            }


        }


    }

}
