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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    public VendingMachine(List<VendingMachineProducts> products) {
        this.products = products;
        this.productSelection = -1;
        this.productPrice = 0;
        this.inputCoins = new ArrayList<>(); // Initialize the inputCoins list
    }

    public int getProductSelection() {
        return productSelection;
    }

    public void selectProductFromConsole() {
        Scanner scanner = new Scanner(System.in);
        boolean validProduct = false;

        // Print a list of available products
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getId() + ": " + products.get(i).getName() + "| Price: " + products.get(i).getPrice());
        }

        // Enter the product selection
        System.out.print("Enter the product number you want to purchase: ");
        int selectedProduct = scanner.nextInt() ;

        for (VendingMachineProducts product: products){
            if (selectedProduct == product.getId()){
                System.out.println("You selected: " + product.getName());
                productSelection = selectedProduct;
                validProduct = true;
            }
        }
        if (!validProduct) {
            System.out.println("Invalid product selection.");
            System.exit(0);
        }
    }


    public void insertCoinsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert a coin (Available values are: 5 , 10, 50, 100, 50 or 0 to finish): ");
            int coinValue = scanner.nextInt();

            if (coinValue == 0) {
                break;
            } else if (coinValue == 5 || coinValue == 10 || coinValue == 50 || coinValue == 100 || coinValue == 200) {
                inputCoins.add(coinValue);
                System.out.println("Inserted " + coinValue + " cents.");
            } else {
                System.out.println("Invalid coin value. Please insert a valid coin.");
            }
        }

        scanner.close();
    }

    public List<Integer> enoughtMoney(){
        List<Integer> changeList = new ArrayList<>();
        int inputMoney = sumListElements(inputCoins);
        int change = inputMoney  - productPrice;

        if(change == 0){
            changeList.add(0);
            System.out.println("Transaction Complete, you don't have any change.");
            return changeList;
        }else if (change <0){
            System.out.println("Not enought money to complete the transaction. Here are your coins");
            for (int coins : inputCoins){
                System.out.println("Coin of: " + coins + " cents to collect from the box");
            }
            return inputCoins;
        }else{
            for (int denomination : COIN_DENOMINATIONS) {
                int numberOfCoins = change / denomination;
                for (int i = 0; i < numberOfCoins; i++) {
                    changeList.add(denomination);
                }
                change -= numberOfCoins * denomination;
            }
            for (int coins : changeList){
                System.out.println("Coin of: " + coins + " cents to collect from the box");
            }
            System.out.println("Thanks for your pourchase, take you'r product from the box");
            return changeList;

        }

    }

    private int sumListElements(List<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }


    public int setProductPrice(int productId) {
        for (VendingMachineProducts product : products) {
            if (product.getId() == productId) {
                productPrice = product.getPrice();
                return productPrice;
            }
        }
        return 0;
    }


    List<VendingMachineProducts> products;
    private int productSelection;
    private int productPrice;
    private List<Integer> inputCoins;
    private static final int[] COIN_DENOMINATIONS = {200, 100, 50, 10, 5};

}
