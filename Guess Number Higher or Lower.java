/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n)==-1){
while(true){
if(guess(n)==-1)n--;
else break;
        }
        }
        else if(guess(n)==1){
            while(true){
if(guess(n)==1)n++;
else break;
        }}
        else 
return n;
        return n;
    }
}
