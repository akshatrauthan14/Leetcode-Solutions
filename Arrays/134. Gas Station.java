class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas<totalCost){
            return -1;
        }
        //if we reach at a stop and we have gas left then check for next stop
        //if we stop midway, check from the next station
        int currGas = 0;
        int s =0;
        for(int i=0; i<gas.length; i++){
            currGas += gas[i] - cost[i];
            if(currGas<0){
                currGas = 0;
                s = i+1;
            }
        }
        return s;
    }
}
