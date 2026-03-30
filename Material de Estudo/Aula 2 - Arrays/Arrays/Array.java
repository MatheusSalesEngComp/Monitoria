package Arrays;

public class Array {
    public static void main(String[] args){
        
        //*********Declaração de arrays*********
        /*Array 1*/
        System.out.println("Array 1:");
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*Array 2*/
        System.out.println("\nArray 2:");
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;  
            System.out.println(array2[i]);
        }
        /*Array 3*/
        System.out.println("\nArray 3:");
        int n = 10;
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i + 1;
        }
        
        //*********Cópia de arrays*********
        int arrayOriginal [] = new int[10];
        int copiaArray[];
        
        /*Cópia dependente*/ 
        copiaArray = arrayOriginal;
        arrayOriginal[0] = 100;
        System.out.println("\nArray Dependente:\n");
        for (int i = 0; i < copiaArray.length; i++) {
            System.out.println(copiaArray[i]);
        }
        
        /*Cópia independete*/
        int vetor[] = new int[10];
        int vetor2[];
        vetor2 = vetor.clone();
        vetor[0] = 100;

        System.out.println("\nArray Independete:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }

        //*********Passando arrays em funções*********
        System.out.println("\nFunção Array:");
        int vetFunc[] = new int[10];
        
        soma(vetFunc);

        for(int i = 0; i < vetFunc.length; i++){
            System.out.println(vetFunc[i]);
        }
    }

    public static int soma(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array.length;
    }
}
