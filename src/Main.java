import java.util.concurrent.ForkJoinPool;

class Main{
    public static int rand_mass(int a, int b){

        return (int)(Math.random()*a+b);
    }
    public static  void mass1(){
        int mass[] = new int[19];
        for (int i=0; i<19; i++){
            mass[i]= rand_mass(2,0);
            System.out.print(mass[i] + " ");
        }

    }
    public static void OUT(int a[], int n){
        System.out.print("\nМассив номер " + n + " ");
        for (int i=0; i<10; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void mass2(){
        int mass1[], mass2[], mass3[], mass4[], mass5[];
        mass1 = new int[10];
        mass2 = new int[10];
        mass3 = new int[10];
        mass4 = new int[10];
        mass5 = new int[10];
        for (int i=0; i<10; i++){
            mass1[i] = rand_mass(2, 0);
            mass2[i] = rand_mass(2, 0);
            mass3[i] = rand_mass(2, 0);
            mass4[i] = rand_mass(2, 0);
            mass5[i] = rand_mass(2, 0);
        }
        OUT(mass1, 1);
        OUT(mass2, 2);
        OUT(mass3, 3);
        OUT(mass4, 4);
        OUT(mass5, 5);
    }
    public static void quickSort(int a[], int l, int r)
    {
        int l_h = l;
        int r_h = r;
        int pivot = a[l];
        while (l < r) {
            while ((a[r] >= pivot) && (l < r)) r--;
            if (l != r){ a[l] = a[r]; l++; }
            while ((a[l] <= pivot) && (l < r)) l++;
            if (l != r){ a[r] = a[l]; r--; }
        }
        a[l] = pivot; pivot = l;
        l = l_h; r = r_h;
        if (l < pivot) quickSort(a, l, pivot - 1);
        if (r > pivot) quickSort(a, pivot + 1, r);
    }

    public static  void mass3(){
        int mass[] = new int[10];
        for (int i=0; i<10; i++){
            mass[i] = rand_mass(2,0);
        }
        OUT(mass, 0);
        quickSort(mass, 0, 9);
        OUT(mass, 0);
    }
    public static  void main(String argc[]){
        System.out.print("\nМассив размерности 20\n");
        mass1();
        System.out.print("\nМассивы размерности 10\n");
        mass2();
        System.out.print("\nСортировка массива\n");
        mass3();
    }
}