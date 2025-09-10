package br.com.senai.heranca.service;

import java.util.Scanner;

public class MenuService {
    static Scanner tec = new Scanner(System.in);
    private boolean execucaoDoMenu;

    public void menuPrincipal() {
        do {
            printOpcoesDoMenuPrincipal();
            switch (leitorDeOpcao()) {
                case 1:
                    menuDePessoas();
                    break;
                case 2:
                    menuDeFuncionarios();
                    break;
                case 3:
                    menuDeClientes();
                    break;
                case 4:
                    menuDeProdutos();
                    break;
                case 5:
                    menuDeVendas();
                    break;
                case 6:
                    menuDeEnderecos();
                    break;
                case 9:
                    encerrarExecucao();
                    System.out.println("--- PROGRAMA ENCERRADO ---");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
    }

    public void printOpcoesDoMenuPrincipal() {
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1 - Pessoa:");
        System.out.println("2 - Funcionário:");
        System.out.println("3 - Clinte:");
        System.out.println("4 - Produto:");
        System.out.println("5 - Venda:");
        System.out.println("6 - Endereço:");
        System.out.println("9 - Encerrar Programa:");
    }

    public void printOpcoesDoMenuSecundario() {
        System.out.println("1 - Cadastro:");
        System.out.println("2 - Edição:");
        System.out.println("3 - Listar:");
        System.out.println("4 - Buscar:");
        System.out.println("5 - Exclusão:");
        System.out.println("9 - Voltar para o Menu Principal:");
    }

    public void continuarExecucao() {
        execucaoDoMenu = true;
    }

    public void encerrarExecucao() {
        execucaoDoMenu = false;
    }

    public int leitorDeOpcao() {
        int opcao;

        System.out.println();
        System.out.print("Escolha a opção desejada: ");
        opcao = tec.nextInt();
        System.out.println();
        return opcao;
    }

    public void menuDePessoas() {
        PessoaService pessoaService = new PessoaService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE PESSOAS ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    pessoaService.lerDadosPessoa();
                    pessoaService.cadastrarPessoa();
                    break;
                case 2:
                    pessoaService.leitorDeID();
                    pessoaService.lerDadosPessoa();
                    pessoaService.editarPessoa();
                    break;
                case 3:
                    pessoaService.listarPessoas();
                    break;
                case 4:
                    pessoaService.leitorDeID();
                    pessoaService.buscarPessoa();
                    break;
                case 5:
                    pessoaService.leitorDeID();
                    pessoaService.removerPessoa();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }

    public void menuDeFuncionarios() {
        FuncionarioService funcionarioService = new FuncionarioService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE FUNCIONÁRIOS ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    funcionarioService.lerDadosFuncionario();
                    funcionarioService.cadastrarFuncionario();
                    break;
                case 2:
                    funcionarioService.leitorDeID();
                    funcionarioService.lerDadosFuncionario();
                    funcionarioService.editarFuncionario();
                    break;
                case 3:
                    funcionarioService.listarFuncionario();
                    break;
                case 4:
                    funcionarioService.leitorDeID();
                    funcionarioService.buscarFuncionario();
                    break;
                case 5:
                    funcionarioService.leitorDeID();
                    funcionarioService.removerFuncionario();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }

    public void menuDeClientes() {
        ClienteService clienteService = new ClienteService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE CLIENTES ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    clienteService.lerDadosCliente();
                    clienteService.cadastrarCliente();
                    break;
                case 2:
                    clienteService.leitorDeID();
                    clienteService.lerDadosCliente();
                    clienteService.editarCliente();
                    break;
                case 3:
                    clienteService.listarClientes();
                    break;
                case 4:
                    clienteService.leitorDeID();
                    clienteService.buscarCliente();
                    break;
                case 5:
                    clienteService.leitorDeID();
                    clienteService.removerCliente();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }

    public void menuDeProdutos() {
        ProdutoService produtoService = new ProdutoService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE PRODUTOS ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    produtoService.lerDadosProduto();
                    produtoService.cadastrarProduto();
                    break;
                case 2:
                    produtoService.leitorDeID();
                    produtoService.lerDadosProduto();
                    produtoService.editarProduto();
                    break;
                case 3:
                    produtoService.listarProdutos();
                    break;
                case 4:
                    produtoService.leitorDeID();
                    produtoService.buscarProduto();
                    break;
                case 5:
                    produtoService.leitorDeID();
                    produtoService.removerProduto();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }

    public void menuDeVendas() {
        VendaService vendaService = new VendaService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE VENDAS ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    vendaService.lerDadosVenda();
                    vendaService.cadastrarVenda();
                    break;
                case 2:
                    vendaService.leitorDeID();
                    vendaService.lerDadosVenda();
                    vendaService.editarVenda();
                    break;
                case 3:
                    vendaService.listarVendas();
                    break;
                case 4:
                    vendaService.leitorDeID();
                    vendaService.buscarVenda();
                    break;
                case 5:
                    vendaService.leitorDeID();
                    vendaService.removerVenda();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }

    public void menuDeEnderecos() {
        EnderecoService enderecoService = new EnderecoService();
        do {
            continuarExecucao();
            System.out.println("--- MENU DE ENDEREÇOS ---");
            printOpcoesDoMenuSecundario();
            switch (leitorDeOpcao()) {
                case 1:
                    enderecoService.lerDadosEndereco();
                    enderecoService.cadastrarEndereco();
                    break;
                case 2:
                    enderecoService.leitorDeID();
                    enderecoService.lerDadosEndereco();
                    enderecoService.editarEndereco();
                    break;
                case 3:
                    enderecoService.listarEnderecos();
                    break;
                case 4:
                    enderecoService.leitorDeID();
                    enderecoService.buscarEndereco();
                    break;
                case 5:
                    enderecoService.leitorDeID();
                    enderecoService.removerEndereco();
                    break;
                case 9:
                    encerrarExecucao();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucaoDoMenu);
        continuarExecucao();
    }
}
