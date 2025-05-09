class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int num = (brown - 4) / 2;
        for (int i = 1; i < num; i++) {
            int j = num - i;
            if (j * i == yellow) {
                answer = new int[] {j + 2, i + 2};
                break;
            }
        }
        return answer;
    }
}