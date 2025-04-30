package testes;

import models.Bolsa;
import models.Avaliacao;
import models.Sugestao;
import enums.TipoSugestao;

import java.util.Scanner;

public class MenuTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bolsa bolsa = new Bolsa(
                "Mochila", "Nike", 299.90,
                "Mochila resistente com compartimento para notebook.",
                "Mochila", 25.0, true);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ver Informações");
            System.out.println("2. Ver Detalhes Técnicos");
            System.out.println("3. Ver Descrição");
            System.out.println("4. Aplicar Desconto");
            System.out.println("5. Verificar Promoção");
            System.out.println("6. Atualizar Descrição");
            System.out.println("7. Fazer Avaliação");
            System.out.println("8. Enviar Sugestão");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> System.out.println(bolsa.getInformacoesAdicionais());
                case 2 -> System.out.println(bolsa.getDetalhesTecnicos());
                case 3 -> System.out.println(bolsa.getDescricao());
                case 4 -> {
                    System.out.print("Digite o percentual de desconto: ");
                    double desconto = sc.nextDouble();
                    sc.nextLine();
                    bolsa.aplicarDesconto(desconto);
                    System.out.println("Desconto aplicado com sucesso!");
                }
                case 5 -> System.out.println(bolsa.estaEmPromocao() ? "Está em promoção!" : "Preço normal.");
                case 6 -> {
                    System.out.print("Nova descrição: ");
                    String novaDesc = sc.nextLine();
                    bolsa.atualizarDescricao(novaDesc);
                    System.out.println("Descrição atualizada.");
                }
                case 7 -> {
                    System.out.print("Nome do usuário: ");
                    String usuario = sc.nextLine();
                    System.out.print("Nota (1 a 5): ");
                    int nota = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Comentário: ");
                    String comentario = sc.nextLine();

                    Avaliacao avaliacao = new Avaliacao(usuario, nota, comentario);
                    System.out.println("Avaliação registrada: " + avaliacao.getResumoAvaliacao());
                }
                case 8 -> {
                    System.out.print("Nome do usuário: ");
                    String usuario = sc.nextLine();

                    System.out.println("Tipo: 1 - ELOGIO | 2 - CRITICA | 3 - SUGESTAO");
                    int tipoOpcao = sc.nextInt();
                    sc.nextLine();
                    TipoSugestao tipo = switch (tipoOpcao) {
                        case 1 -> TipoSugestao.ELOGIO;
                        case 2 -> TipoSugestao.CRITICA;
                        case 3 -> TipoSugestao.SUGESTAO;
                        default -> TipoSugestao.SUGESTAO;
                    };

                    System.out.print("Mensagem: ");
                    String mensagem = sc.nextLine();

                    Sugestao sugestao = new Sugestao(usuario, tipo, mensagem);
                    System.out.println("Sugestão enviada: " + sugestao.getResumoSugestao());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
