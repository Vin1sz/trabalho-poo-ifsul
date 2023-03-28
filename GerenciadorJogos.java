import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorJogos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Games> jogosList = new ArrayList<>();
        int opcao;

        do {
            System.out.println("SISTEMA DE GERENCIAMENTO DE JOGOS");
            System.out.println("1) Cadastrar jogo");
            System.out.println("2) Editar jogo");
            System.out.println("3) Excluir jogo");
            System.out.println("4) Listar jogo");
            System.out.println("5) Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar Jogo");
                    System.out.println("Digite o titulo do jogo: ");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a plataforma: ");
                    String plataforma = scanner.nextLine();
                    System.out.println("Digite o desenvolvedor: ");
                    String desenvolvedor = scanner.nextLine();
                    System.out.println("Digite o genêro: ");
                    String genero = scanner.nextLine();
                    System.out.println("Digite a data de lançamento: ");
                    String dataLancamento = scanner.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricao = scanner.nextLine();

                    Games game = new Games(titulo, plataforma, desenvolvedor, genero, dataLancamento, descricao);
                    jogosList.add(game);
                    System.out.println("Jogo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Editar jogo");
                    System.out.println("Digite o id do jogo a ser editado: ");
                    int id = scanner.nextInt();
                    Games jogoEditar = jogosList.get(id);
                    System.out.println("Digite o titulo: ");
                    jogoEditar.setTitulo(scanner.nextLine());
                    System.out.println("Digite a plataforma: ");
                    jogoEditar.setPlataforma(scanner.nextLine());
                    System.out.println("Digite o desenvolvedor: ");
                    jogoEditar.setDesenvolvedor(scanner.nextLine());
                    System.out.println("Digite o genêro: ");
                    jogoEditar.setGenero(scanner.nextLine());
                    System.out.println("Digite a data de lançamento: ");
                    jogoEditar.setDataLancamento(scanner.nextLine());
                    System.out.println("Digite a descrição: ");
                    jogoEditar.setDescricao(scanner.nextLine());
                    System.out.println("Jogo editado com sucesso!");
                    break;

                case 3:
                    System.out.println("Excluir jogo");
                    System.out.println("Digite o ID do jogo a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    jogosList.remove(idExcluir);
                    System.out.println("Jogo excluído com sucesso!");
                    break;

                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("Listar jogos");
                    for (int i = 0; i < jogosList.size(); i++) {
                        Games jogoListado = jogosList.get(i);
                        System.out.println("ID: " + i);
                        System.out.println("Titulo: " + jogoListado.getTitulo());
                        System.out.println("Plataforma: " + jogoListado.getPlataforma());
                        System.out.println("Desenvolvedor: " + jogoListado.getDesenvolvedor());
                        System.out.println("Genêro: " + jogoListado.getGenero());
                        System.out.println("Data de lançamento: " + jogoListado.getDataLancamento());
                        System.out.println("Descrição: " + jogoListado.getDescricao());
                        System.out.println("------------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("Desligando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }
}
