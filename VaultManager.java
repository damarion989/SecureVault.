import java.util.Arrays;

class SecureVault {
    int[] items = {50, 20, 90, 10, 70, 40, 100, 30, 80, 60};
}

public class VaultManager {
    public static void main(String[] args) {
        SecureVault vault = new SecureVault();

        System.out.println("Before: " + Arrays.toString(vault.items));

        selectionSort(vault.items);

        System.out.println("After:  " + Arrays.toString(vault.items));
    }

    public static void selectionSort(int[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            int selected = i;

            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[selected]) {
                    selected = j;
                }
            }

            int temp = items[i];
            items[i] = items[selected];
            items[selected] = temp;
        }
    }
}
