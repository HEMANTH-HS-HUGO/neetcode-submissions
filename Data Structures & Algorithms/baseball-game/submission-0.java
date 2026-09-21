class Solution {
    public int calPoints(String[] operations) {
        List<Integer> lst = new ArrayList<>();

        for(int i=0;i<operations.length; i++){
            if(operations[i].equals("+")){
                int adding = lst.get(lst.size()-1) + lst.get(lst.size()-2);
                    lst.add(adding);
            }

            else if(operations[i].equals("D")){
                int doubling = lst.get(lst.size()-1) * 2;
                lst.add(doubling);
            }

            else if(operations[i].equals("C")){
                lst.remove(lst.size()-1);
            }

            else{
                // lst.add(Integer.parseInt(operations[i]));
                lst.add(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        for(int j=0;j<lst.size();j++){
            sum += lst.get(j);
        }
        return sum;
    }
}