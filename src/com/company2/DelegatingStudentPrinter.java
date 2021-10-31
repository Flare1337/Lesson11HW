package com.company2;

public class DelegatingStudentPrinter implements IStudentPrinter {
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        IStudentPrinter studentPrinter = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                for (IStudentPrinter printer : printers) {
                    printer.print(student);
                }
            }
        };
        studentPrinter.print(student);
    }
}
