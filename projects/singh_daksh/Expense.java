import java.time.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Expense {
    private double amount;
    private String category;
    private LocalDate date;

    // Constructor
    public Expense(double amount, String category, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    // String representation (for printing)
    @Override
    public String toString() {
        return "Expense{" +
                "amount=" + amount +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }
}
