public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Se não há strings, não há prefixo
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Começamos assumindo que o prefixo é o primeiro string inteiro
        String prefixo = strs[0];

        // Agora comparamos esse prefixo com cada string da lista
        for (int i = 1; i < strs.length; i++) {
            // Enquanto o prefixo não for prefixo da string atual, vamos encurtando ele
            while (!strs[i].startsWith(prefixo)) {
                // Remove o último caractere
                prefixo = prefixo.substring(0, prefixo.length() - 1);

                // Se o prefixo virar vazio, então não há prefixo comum
                if (prefixo.isEmpty()) {
                    return "";
                }
            }
        }

        // Quando terminar, prefixo conterá o prefixo comum
        return prefixo;
    }
}
