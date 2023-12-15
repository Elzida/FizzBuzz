public class FizzBuzz {
    public static void main(String[] args) {
        int [] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            if(numbers[i] % 5==0 && numbers[i] % 3==0) {
                numbers[i]= 8888;
            }
            else if(numbers[i] % 3==0) {

                numbers[i]= 1055;}
            else if(numbers[i] % 5==0) {
                numbers[i]= 1033;
            }
            System.out.println(numbers[i]);
        }


    }
}
