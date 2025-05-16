class Solution {
    public boolean isPalindrome(int x) {
        //casos obvios de q nao é palindromo
        if (x<0){
            return false;
        }
        if (x%10==0 && x!=0){
            return false;
        }

        int inverse=0;
        //vai pegando o ultimo digita de X e acresentando em inverse ate q ele seja maior
        while (inverse <x){
            inverse = inverse*10+(x%10);
            x=x/10;
        }
        // se inverse ou inverse menos o ultimo digito for igual, é palindromo
        if (inverse==x || inverse/10==x){
            return true;
        }
        return false;
        
        
    }
}