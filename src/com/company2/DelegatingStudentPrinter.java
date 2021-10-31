package com.company2;

public class DelegatingStudentPrinter implements IStudentPrinter {
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        // Превращаю в строки, немного ленивым путем
        String stringStudent = student.toString();
        for (IStudentPrinter printer : printers) {
            printer.print(stringStudent);
        }
    }

    @Override
    public void print(String student) {

    }
}
