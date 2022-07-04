package com.ali.email;

import java.util.ArrayList;
import java.util.List;
public class EmailAssignment {


    private List<String> recruitmentList = new ArrayList<>();
    private List<String> spamList = new ArrayList<>();
    private List<String> salesList = new ArrayList<>();
    private List<String> receptionList = new ArrayList<>();

    int totalEmailInDays = 0;


    public void sortEmailList(List<String> unsortedEmailList) {

        int totalEmailThisTurn = unsortedEmailList.size();
        int recruitmentEmailCount = 0;
        int spamEmailCount = 0;
        int salesEmailCount = 0;
        int receptionEmailCount = 0;
        totalEmailInDays += unsortedEmailList.size();


        if(unsortedEmailList.isEmpty()) {
            System.out.println("There is nothing to print");
        }

        for(String email : unsortedEmailList) {

            if(email.contains("CV")) {
                sendTo("recruitment@parkshark.com", email);
                recruitmentEmailCount++;

            } else if(email.contains("promo") || email.contains("advertising")) {
                sendTo("spam@parkshark.com", email);
                spamEmailCount++;

            } else if(email.contains("proposal")) {
                sendTo("sales@parkshark.com", email);
                salesEmailCount++;

            } else {
                sendTo("reception@parkshark.com", email);
                receptionEmailCount++;

            }


        }

        System.out.println("--------------------------------------");
        System.out.println("in this turn : ");
        printReport(totalEmailThisTurn, recruitmentEmailCount, spamEmailCount, salesEmailCount, receptionEmailCount);

        unsortedEmailList.clear();


        System.out.println(" In whole day :");
        // for whole day
        printReport(totalEmailInDays, recruitmentList.size(), spamList.size(), salesList.size(), receptionList.size());

    }

    private void sendTo(String toEmail, String emailBody) {
        if(toEmail.startsWith("recruitment")) {
            recruitmentList.add(emailBody);
        } else if(toEmail.startsWith("spam")) {
            spamList.add(emailBody);
        } else if(toEmail.startsWith("sales")) {
            salesList.add(emailBody);
        } else {
            receptionList.add(emailBody);
        }


    }

    private void printReport(int total, int recruitment, int spam, int sales, int reception) {

        System.out.println("We have printed " + total);
        System.out.println(recruitment + " To recruitment");
        System.out.println(spam + " To Spam");
        System.out.println(sales + " To Sales");
        System.out.println(reception + " To Reception");
    }


}
