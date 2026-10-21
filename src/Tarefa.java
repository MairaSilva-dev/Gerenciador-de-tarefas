public class Tarefa {
    int id;
    String titulo;
    String descricao;
    boolean concluido;

    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo ;
        this.descricao = descricao;
        this.concluido = false;
    }

}
