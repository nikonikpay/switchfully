package com.ali.email;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        EmailAssignment sortingEmail = new EmailAssignment();

        List<String> unsortedEmail = new ArrayList<>();
        unsortedEmail.add("Here is my CV");
        unsortedEmail.add("I hope you get this promo");
        unsortedEmail.add("here is the new advertising");
        unsortedEmail.add("i want to show you my proposal");
        unsortedEmail.add("there is nothing more to talk about");
        unsortedEmail.add("please let me know if you are interested");


        sortingEmail.sortEmailList(unsortedEmail);


        unsortedEmail.add("This is second CV");


        sortingEmail.sortEmailList(unsortedEmail);

        unsortedEmail.add("this is second proposal");
        unsortedEmail.add("this is second advertising");

        sortingEmail.sortEmailList(unsortedEmail);




    }
}
