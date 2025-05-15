class Solution {
    public int reverse(int x) {
        //verifica se é negativo
        Boolean negativo = x<0;
        //vira string
        String S = Integer.toString(x);
        if (negativo){
            //tira o - se for negativo
            S = S.substring(1);
        }
        //inverte o numero
        String Sinvertido = new StringBuilder(S).reverse().toString();
        try {
            //vira int de volta
            int intinvertido = Integer.parseInt(Sinvertido);
            //return com operador ternario
            return negativo ? -intinvertido : intinvertido;
        } catch (NumberFormatException e) {
            //se o numero for maior q um int ele pega o erro e retorna 0
            return 0;
        }
    }
}