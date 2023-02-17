class Hello {
    public static void main(String[] args) {
        String [] arr = new String [5];

        arr[0] = "a"; 
        arr[1] = "b"; 
        arr[2] = "c";  
        arr[3] = "d";  
        arr[4] = "e"; 

        System.out.println("Initial array: ");
        printArray(arr);

        rightShift(arr);

        System.out.println("\nAfter right shift 1 time(s): ");
        printArray(arr);

        leftShift(arr);

        System.out.println("\nFixed by left shift 1 time(s): ");
        printArray(arr);

        leftShift(arr);

        System.out.println("\nAfter left shift 1 time(s): ");
        printArray(arr);

        rightShift(arr);

        System.out.println("\nFixed after right shift 1 time(s): ");
        printArray(arr);
    }

    public static void printArray(String[] arr){
        for (String item : arr){
            System.out.println(item);
        }
    }

    public static void leftShift(String[] arr){
        /* 
        a -> b   1 & 0
        b -> c   2 & 1
        c -> d   3 & 2
        d -> e   4 & 3
        e -> a   0 & 4
        */ 
        int next = arr.length - 1;
        String tmp1 = arr[0], tmp2;
        while (next > -1 ){
            tmp2 = arr[next];
            arr[next] = tmp1; 
            tmp1 = tmp2;
            next--;
        }
    }

    public static void rightShift(String[] arr){
        /* 
        a -> e   4 & 0
        b -> a   0 & 1
        c -> b   1 & 2
        d -> c   2 & 3
        e -> d   3 & 4
        */ 
        int next = 0;
        String tmp1 = arr[arr.length-1], tmp2;
        while (next < arr.length){
            tmp2 = arr[next];
            arr[next] = tmp1; 
            tmp1 = tmp2;
            next++;
        }
    }
}