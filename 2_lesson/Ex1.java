public class Ex1 {
    //Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    public static void main(String[] args) {
        int n = 6;
        char c1 = 'a';
        char c2 = 'b';
        for (int i = 0; i < n; i++) {
            System.out.print(c1);
            System.out.print(c2);
            
        }
    }        
}