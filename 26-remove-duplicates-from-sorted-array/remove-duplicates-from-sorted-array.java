class Solution {
    public int removeDuplicates(int[] nums) {
       // k vai contar quantos números únicos foram encontrados até agora
        int k = 0;

        // percorre cada elemento do array
        for (int i = 0; i < nums.length; i++) {
            boolean duplicado = false;

            // verifica se nums[i] já apareceu antes, comparando com todos os anteriores únicos
            for (int j = 0; j < k; j++) {
                if (nums[i] == nums[j]) {
                    duplicado = true;
                    break;
                }
            }

            // se não for duplicado, colocamos o valor em nums[k]
            if (!duplicado) {
                nums[k] = nums[i];
                k++;
            }
        }

        // retorna o número de elementos únicos
        return k;
    }
}