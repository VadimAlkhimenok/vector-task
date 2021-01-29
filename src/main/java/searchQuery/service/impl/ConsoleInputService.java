package searchQuery.service.impl;

import searchQuery.service.InputService;

import java.util.Scanner;

public class ConsoleInputService implements InputService {

    @Override
    public String readData() {
        System.out.print("Input word: ");
        return new Scanner(System.in).nextLine();
    }
}
