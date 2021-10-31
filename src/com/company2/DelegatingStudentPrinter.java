package com.company2;

public class DelegatingStudentPrinter implements IStudentPrinter {
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        // Превращаю в строки, немного ленивым путем
        for (IStudentPrinter printer : printers) {
            printer.print(student);
        }
    }
}
