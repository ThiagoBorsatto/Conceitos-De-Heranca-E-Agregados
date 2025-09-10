package br.com.senai.heranca;

import br.com.senai.heranca.service.MenuService;

public class App {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        menuService.menuPrincipal();
    }
}
