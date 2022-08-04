class LinearSearch {

    private static void Search(int[] arr, int key) {

        for(int i=0;i < arr.length;i++){
            if(arr[i] == key)
            {
                System.out.println(key + " element is found at index : " + i);
                return;
            }
        }
        System.out.println(" key element is not found");

    }

    public static void main(String args[]) {
        int[] arr = {12, 5, 18, 25, 3, 19};

        int key = 25;
        Search(arr, key);
    }
}
