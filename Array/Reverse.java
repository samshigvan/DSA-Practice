class Reverse {

    public static reversArray(int[] arr){

    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = number.length-1;
        int tmp;
        while (start<end) {
            System.out.println("Changing start " + start + "to " + end);
            tmp = number[start];
            number[start] = number[end];
            number[end] = tmp;
            start++;
            end--;
        }
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        System.out.println();
    }

}