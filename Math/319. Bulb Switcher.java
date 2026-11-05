class Solution {
    public int bulbSwitch(int n) {
        //no of flips = no of divisors
        //12 = 12.1 || 6.2 || 3.4 => even divisors => bulb is off
        //9 = 9.1 || 3.3 => odd divisors => bulb is on
        return (int)Math.sqrt(n);
    }
}
