import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de pares de números desejados para dividi-los: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Primeiro Número: ");
            int a = sc.nextInt();
            System.out.println("Segundo Número: ");
            int b = sc.nextInt();

            if(b == 0){
                System.out.println("Divisão impossível!");
            } else {
                double divisao = a / b;
                System.err.println("Divisão: ");
                System.out.printf("%.1f\n", divisao);
            }
        }

        sc.close();
    }
}
