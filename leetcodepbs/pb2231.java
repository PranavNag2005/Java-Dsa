class Solution {
    public int largestInteger(int num) {
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        List<Integer>number=new ArrayList<>();
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            number.add(rem);
            temp/=10;
        }
        Collections.reverse(number);
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                even.add(rem);
            }else{
                odd.add(rem);
            }
            num/=10;
        }
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        int evenindex=0;
        int oddindex=0;
        for(int nums:number){
            if(nums%2==0){
                sb.append(even.get(evenindex++));
            }
            else{
                sb.append(odd.get(oddindex++));
            }
        }

    return Integer.parseInt(sb.toString());
    }
}
