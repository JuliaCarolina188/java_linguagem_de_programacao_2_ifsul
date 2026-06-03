package C_Orientação_a_objetos.Encapsulamento;

public class teste {

    class Solution {

        public int findMaxK(int[] nums) {
            int maior = nums[0];
            int menor = nums[0];

            for (byte i = 0; i < nums.length; i++) {
                    if (nums[i] > maior) {
                        maior = nums[i];
                    }
                    if (nums[i] < menor) {
                        menor = nums[i];
                    }

                }

                String menorStr = String.valueOf(menor).replace("-", "");
                int menorPositivo = Integer.parseInt(menorStr);
                
                if ((menorPositivo == maior) {
                    return maior;
                } else {
                    return -1;
                }
            }
        }
    }
