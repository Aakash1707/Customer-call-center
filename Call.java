package com.callcenter;

public class Call implements Comparable<Call> {
    private static int idCounter = 1;
    private int callId;
    private String callerName;
    private int priority; // 1 = VIP, 2 = Regular
    private long arrivalTime;

    public Call(String callerName, int priority) {
        this.callId = idCounter++;
        this.callerName = callerName;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getPriority() {
        return priority;
    }

    public String getCallerName() {
        return callerName;
    }

    public int getCallId() {
        return callId;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public int compareTo(Call other) {
        if (this.priority != other.priority)
            return Integer.compare(this.priority, other.priority); // Lower = higher priority
        return Long.compare(this.arrivalTime, other.arrivalTime); // FIFO if same priority
    }

    @Override
    public String toString() {
        return "Call ID: " + callId + " | Name: " + callerName + " | Priority: " +
                (priority == 1 ? "VIP" : "Regular") + " | Time: " + arrivalTime;
    }
}
