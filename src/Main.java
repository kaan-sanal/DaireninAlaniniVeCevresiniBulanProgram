import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ödev Sorusu: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        // Formül:(𝜋 * (r*r) * 𝛼) / 360

        int yaricap2, merkezaciolcusu;
        double pisayisi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Daire Diliminin Yarıçap Uzunluğu : ");
        yaricap2 = input.nextInt();
        System.out.print("Daire Diliminin Merkez Açısının Ölçüsü  : ");
        merkezaciolcusu = input.nextInt();

        double dairedilimialami = (pisayisi * (yaricap2*yaricap2) * merkezaciolcusu)/360;
        System.out.println("Daire Diliminin Alanı : " + dairedilimialami);
    }
}