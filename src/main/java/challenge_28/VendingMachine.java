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

        // print a list of available products
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1) + ": " + products.get(i).getName() + "| Price: " + products.get(i).getPrice());
        }

        //Enter the product selection
        System.out.print("Enter the product number you want to purchase: ");
        int selectedProduct = scanner.nextInt();

        if (selectedProduct >= 0 && selectedProduct < products.size()) {
            System.out.println("You selected: " + products.get(selectedProduct).getName());
            productSelection = selectedProduct;
        } else {
            System.out.println("Invalid product selection.");
        }

       // scanner.close();
    }

    public void insertCoinsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert a coin (Available values are: 5 , 10, 50, 100, 50 or 0 to finish): ");
            int coinValue = scanner.nextInt();

            if (coinValue == 0) {
                break;
            } else if (coinValue == 5 || coinValue == 10 || coinValue == 25 || coinValue == 100 || coinValue == 200) {
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

        if(inputMoney == productPrice){
            changeList.add(0);
            System.out.println("Transaction Complete, you don't have any change.");
            return changeList;
        }else if (inputMoney<productPrice){
            System.out.println("Enought money to complete the transaction. Here are your coins");
            for (int coins : inputCoins){
                System.out.println("Coin of: " + coins + "cents to collect");
            }
            return inputCoins;
        }else{
            for (int denomination : COIN_DENOMINATIONS) {
                int numberOfCoins = inputMoney / denomination;
                for (int i = 0; i < numberOfCoins; i++) {
                    changeList.add(denomination);
                }
                inputMoney -= numberOfCoins * denomination;
            }
            for (int coins : changeList){
                System.out.println("Coin of: " + coins + "cents to collect");
            }
            return changeList;

        }

    }

    public int sumListElements(List<Integer> list) {
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
