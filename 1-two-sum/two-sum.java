import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(nums[i], i);
        }

        // Se não encontrar (em teoria não deveria acontecer)
        return new int[0];
    }
}
