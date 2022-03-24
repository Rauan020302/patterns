package com.company.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);

        report.setNextNotifier(sms);
        sms.setNextNotifier(email);

        report.notifyManager("everything is OK",Priority.ROUTINE);
        report.notifyManager("Something went wrong!",Priority.IMPORTANT);
        report.notifyManager("Houston, we've had a problem here!",Priority.ASAP);

    }
}
