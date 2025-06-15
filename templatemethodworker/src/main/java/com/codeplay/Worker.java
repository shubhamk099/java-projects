package com.codeplay;

public abstract class Worker {
    public void goToWork() {
        System.out.println("== I'm going to work sadly ==");
    }

    public void goToHome() {
        System.out.println("== I'm going home happy ==");
    }

    public abstract void workingProgesss();

    public final void work() {
        goToWork();
        workingProgesss();
        goToHome();
    }
}
