class Solution {
    public int solution(int[][] sizes) {
        int tmp, cardWidth = 0, cardHeight = 0, width, height;
        
        for (int i = 0; i < sizes.length; i++) {
            width = sizes[i][0];
            height = sizes[i][1];
            
            if (width < height) {
                tmp = width;
                width = height;
                height = tmp;
            }
            
            cardWidth = Math.max(cardWidth, width);
            cardHeight = Math.max(cardHeight, height);
        }
        
        
        return cardWidth * cardHeight;
    }
}