import java.util.Scanner;

public class XoaPhanTu {
    private static double[] deleteElement(double oldArray[], int index) {
        int length = oldArray.length;
        double newArray[] = new double[length - 1];
        for (int i = 0; i< index; i++){
            newArray[i] = oldArray[i];
        }
        for (int i = index+1; i< length; i++){
            newArray[i-1] = oldArray[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        int size;
        do {
            System.out.println("Nhap so luong phan tu cua mang:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhap so luong phan tu nho hon 20");
            }
        } while (size > 20);
        array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextDouble();
        }
        //Xuat mang
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:" + array[i]);
        }

        double value;
        System.out.println("Nhap gia tri phan tu muon xoa:");
        value = sc.nextDouble();
        for (int i =0 ;i<array.length;i++){
            if (array[i] == value){
                array=deleteElement(array,i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:" + array[i]);
        }


    }
}
