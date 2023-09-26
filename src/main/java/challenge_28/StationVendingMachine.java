package challenge_28;

/*
 * Simula el funcionamiento de una máquina expendedora creando una operación
 * que reciba dinero (array de monedas) y un número que indique la selección
 * del producto.
 * - El programa retornará el nombre del producto y un array con el dinero
 *   de vuelta (con el menor número de monedas).
 * - Si el dinero es insuficiente o el número de producto no existe,
 *   deberá indicarse con un mensaje y retornar todas las monedas.
 * - Si no hay dinero de vuelta, el array se retornará vacío.
 * - Para que resulte más simple, trabajaremos en céntimos con monedas
 *   de 5, 10, 50, 100 y 200.
 * - Debemos controlar que las monedas enviadas estén dentro de las soportadas.
 */

import java.util.List;

public class StationVendingMachine {

    public static void main(String[] args) {

        List<VendingMachineProducts> products = List.of(
                new VendingMachineProducts(1, "Chips", 100),
                new VendingMachineProducts(2,"Candy", 75),
                new VendingMachineProducts(3,"Soda", 150),
                new VendingMachineProducts(4,"Water", 50),
                new VendingMachineProducts(5,"Juice", 80),
                new VendingMachineProducts(6,"Cookies", 120),
                new VendingMachineProducts(7,"Snack Bar", 110),
                new VendingMachineProducts(8,"Gum", 10),
                new VendingMachineProducts(9,"Popcorn", 70),
                new VendingMachineProducts(10,"Energy Drink", 200)
        );

        VendingMachine vendingMachine = new VendingMachine(products);

        vendingMachine.selectProductFromConsole();
        vendingMachine.insertCoinsFromConsole();
        vendingMachine.setProductPrice(vendingMachine.getProductSelection());
        List<Integer> change = vendingMachine.enoughtMoney();


    }

}
