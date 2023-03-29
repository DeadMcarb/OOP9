package com.example.oop9;

import com.example.oop9.tabulation.Functions;
import com.example.oop9.tabulation.Point;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

public class HelloController {
    public Label resultLabel;

    @FXML
    private TextField startField;
    @FXML
    private TextField finishField;
    @FXML
    private TextField stepField;

    private Functions processor;


    public void initialize() {
        processor = new Functions();
    }

    //Реалізувати табуляцію. Вивести у вікні інформацію про кількість кроків
    //табуляції, та зберегти результати у колекції об’єктів Point (що містить
    //значення x та y для кожної точки табуляції). Саму колекцію виводити не
    //треба.
    //3. Пересвідчитись, що колекцію точок створюється правильно за
    //допомогою модульного тестування.

    //4. Вивести найбільше та найменше значення функції, вказавши значення     +++++
    //аргументу, для яких відповідні значення отримані.
    //5. Вивести суму та середнє арифметичне елементів масиву значень    +++++++
    //функції.

    private void TypeInLabel(double average, double sum, Point max, Point min) {
        StringBuilder s = new StringBuilder();


        s.append(String.format("Average: %6.4f\n",average));
        s.append("Sum: ").append(sum).append("\n");

        s.append(String.format("Max: x = %6.4f y = %6.4f\n", max.getX(), max.getY()));
        s.append(String.format("Min: x = %6.4f y = %6.4f\n", min.getX(), min.getY()));
        resultLabel.setText(s.toString());
    }


    public void makeResults() {
        double start = Double.parseDouble(startField.getText());
        double finish = Double.parseDouble(finishField.getText());
        double step = Double.parseDouble(stepField.getText());

        List<Point> points = processor.createPointList(start, finish, step);



        double sum = processor.sumArr(points);
        double average = processor.averArifm(points);
        Point max = points.get(processor.getIndexOfMax(points));
        Point min = points.get(processor.getIndexOfMin(points));



        TypeInLabel(average, sum, max, min);
    }
}


//    double x1 = 0.2;
//        double x2 = 2.8;
//        double step = 0.002;

