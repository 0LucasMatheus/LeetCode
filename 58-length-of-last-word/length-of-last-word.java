class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        //remove os espaços das pontas se existirem
        s=s.trim();
        //começa o indice pelo ultimo da string
        int i = s.length() -1;
        //verifica se o caractere é um espaço e desce 1 no indice
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
    return count;
    }
}