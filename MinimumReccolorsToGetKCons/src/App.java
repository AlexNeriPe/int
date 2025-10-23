public class App {
    public static void main(String[] args) throws Exception {
        String blocks  = "WBBWWBBWBW";
        int k = 7;
        int sol = minimumRecolors(blocks, k);    
        System.out.println(sol);
    }


    static int  minimumRecolors(String blocks, int k) {
        int whiteCount = 0;
        int minMoves = Integer.MAX_VALUE;

        for(int i = 0 ;  i < k ; i++) {
            if(blocks.charAt(i) == 'W') { 
               whiteCount++;
            }
        }

        minMoves = whiteCount;

        for(int i = k ; i < blocks.length() ; i++) {
            if(blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
            if(blocks.charAt(i) == 'W') {
                whiteCount++;
            }
            minMoves = Math.min(minMoves, whiteCount);
        }
        
        return minMoves;
    }
}
