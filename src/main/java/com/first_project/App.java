package com.first_project;

import com.first_project.ActionPerformer;

/**
 * Hello world!
 */
public class App {
    static ActionPerformer ap;

    public static void main(String[] args) {
        double a = 2.3;
        System.out.println(Math.ceil(a));
        ap = new ActionPerformer();
    }
}
