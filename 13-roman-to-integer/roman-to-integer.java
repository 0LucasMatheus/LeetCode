import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Mapa para armazenar os casos "especiais" de dois caracteres,
        // onde um símbolo menor aparece antes de um maior e representa subtração
        Map<String, Integer> specials = new HashMap<>();
        specials.put("IV", 4);   // 1 antes do 5
        specials.put("IX", 9);   // 1 antes do 10
        specials.put("XL", 40);  // 10 antes do 50
        specials.put("XC", 90);  // 10 antes do 100
        specials.put("CD", 400); // 100 antes do 500
        specials.put("CM", 900); // 100 antes do 1000

        // Mapa para os valores normais de cada letra romana
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int i = 0;       // Índice para percorrer a string
        int total = 0;   // Resultado final da conversão

        // Loop principal para percorrer os caracteres da string
        while (i < s.length()) {
            // Verifica se há pelo menos dois caracteres restantes para formar um par
            if (i + 1 < s.length()) {
                // Extrai dois caracteres para verificar se é um dos casos especiais
                String twoChars = s.substring(i, i + 2);

                // Se for um par especial, soma seu valor e pula os dois caracteres
                if (specials.containsKey(twoChars)) {
                    total += specials.get(twoChars); // Soma o valor do par especial
                    i += 2; // Avança dois índices
                    continue; // Pula para a próxima iteração do loop
                }
            }

            // Caso não seja um par especial, soma o valor do caractere atual
            total += roman.get(s.charAt(i));
            i++; // Avança um índice
        }

        // Retorna o valor final convertido
        return total;
    }
}
