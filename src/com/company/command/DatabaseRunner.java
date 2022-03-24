package com.company.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database)

        );
        developer.deleteRecord();
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
    }
}
