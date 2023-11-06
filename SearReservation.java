class SeatManager {
    private boolean [] seats;  
    int i=0;
    public SeatManager(int n) {
        seats=new boolean[n];
    }
    
    public int reserve() {
       while(seats[i]!=false)
       {
           if(i==seats.length-1) break;
           i++;
       }
       seats[i]=true;  
       i++;
       return i;
    }
    
    public void unreserve(int seatNumber) {
        seats[--seatNumber]=false; 
        if(i>seatNumber)
        i=seatNumber;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */