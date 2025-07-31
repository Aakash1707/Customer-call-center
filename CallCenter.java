package com.callcenter;

import java.util.PriorityQueue;

public class CallCenter {
    private PriorityQueue<Call> callQueue;

    public CallCenter() {
        callQueue = new PriorityQueue<>();
    }

    public void receiveCall(String callerName, int priority) {
        Call newCall = new Call(callerName, priority);
        callQueue.offer(newCall);
        System.out.println("📞 New call received → " + newCall);
    }

    public void handleNextCall() {
        if (callQueue.isEmpty()) {
            System.out.println("📭 No calls in queue.");
            return;
        }
        Call call = callQueue.poll();
        System.out.println("✅ Handling call → " + call);
    }

    public void showPendingCalls() {
        if (callQueue.isEmpty()) {
            System.out.println("🟡 No pending calls.");
            return;
        }
        System.out.println("\n🔔 Pending Calls:");
        for (Call c : callQueue) {
            System.out.println("  • " + c);
        }
    }
}
