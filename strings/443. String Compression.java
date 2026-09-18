class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex=0;
        while(readIndex<chars.length){
            char curr = chars[readIndex];
            int count = 0;
            //count dup char
            while (readIndex<chars.length && curr==chars[readIndex]){
                readIndex++;
                count++;
            }
            //now we have curr char and count of that
            chars[writeIndex]= curr;
            writeIndex++;
            //now insert count
            if(count>1){
                String countStr = String.valueOf(count);
                for(char digit: countStr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
}
