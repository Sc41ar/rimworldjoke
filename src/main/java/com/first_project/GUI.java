package com.first_project;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JPanel canvas;
    private JSlider populationSlider;
    public JLabel populationLabel;
    private JLabel riceCount;
    private JLabel potatoCount;
    private JLabel cornCount;
    private JLabel baseSaturation;
    private JLabel baseDishSat;
    public JLabel simpleDishCount;
    EventsCallback eventsCallback;

    public GUI(EventsCallback eventsCallback) {
        this.eventsCallback = eventsCallback;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension currentDimension = toolkit.getScreenSize();
        int width = currentDimension.width / 2;
        int height = currentDimension.height / 2;
        this.setBounds((width - width / 2), (height - height / 2), width, height);
        this.setVisible(true);
    }

    public void init() {
        canvas = new JPanel();
        populationSlider = new JSlider();
        populationSlider.setMinimum(1);
        populationSlider.setMaximum(30);
        populationSlider.setPaintLabels(true);
        populationSlider.setSnapToTicks(true);
        populationSlider.setMajorTickSpacing(1);
        populationSlider.setPaintTicks(true);
        populationSlider.setValue(1);
        baseSaturation = new JLabel("Базовое насыщение колониста в день: 1.6");
        baseDishSat = new JLabel("базовое насыщение простых блюд: 0.9");
        simpleDishCount = new JLabel("кол-во простых блюд: 0");
        populationLabel = new JLabel("population: 0");
        cornCount = new JLabel("corn count: 0");
        riceCount = new JLabel("rice count: 0");
        potatoCount = new JLabel("potato count: 0");
        populationSlider.setPreferredSize(new Dimension(500, 75));
        populationLabel.setPreferredSize(new Dimension(100, 20));
        initConstrains();
        setEvents();
        this.add(canvas);
        canvas.revalidate();
    }

    private void initConstrains() {
        GridBagConstraints populationLabelConstrains = new GridBagConstraints();
        GridBagConstraints populationSliderConstrains = new GridBagConstraints();
        GridBagConstraints cornConstrains = new GridBagConstraints();
        GridBagConstraints riceConstrains = new GridBagConstraints();
        GridBagConstraints potatoConstrains = new GridBagConstraints();
        GridBagConstraints dishConstrains = new GridBagConstraints();
        GridBagConstraints saturationConstrains = new GridBagConstraints();
        GridBagConstraints simpleCountConstrains = new GridBagConstraints();
        canvas.setLayout(new GridBagLayout());

        populationLabelConstrains.gridx = 0;
        populationLabelConstrains.gridy = 0;
        populationLabelConstrains.weightx = 0.1;

        populationSliderConstrains.gridx = 0;
        populationSliderConstrains.gridy = 1;
        populationSliderConstrains.gridwidth = 3;
        populationSliderConstrains.weightx = 0.1;

        cornConstrains.gridx = 5;
        cornConstrains.gridy = 0;
        cornConstrains.weightx = 0.5;

        riceConstrains.gridx = 5;
        riceConstrains.gridy = 1;
        riceConstrains.weightx = 0.5;

        potatoConstrains.gridx = 5;
        potatoConstrains.gridy = 2;
        potatoConstrains.weightx = 0.5;

        dishConstrains.gridx = 4;
        dishConstrains.gridy = 0;

        saturationConstrains.gridx = 4;
        saturationConstrains.gridy = 1;

        simpleCountConstrains.gridx = 4;
        simpleCountConstrains.gridy = 2;

        canvas.add(simpleDishCount, simpleCountConstrains);
        canvas.add(baseSaturation, saturationConstrains);
        canvas.add(baseDishSat, dishConstrains);
        canvas.add(populationSlider, populationSliderConstrains);
        canvas.add(populationLabel, populationLabelConstrains);
        canvas.add(cornCount, cornConstrains);
        canvas.add(riceCount, riceConstrains);
        canvas.add(potatoCount, potatoConstrains);

    }

    private void setEvents() {
        populationSlider.addChangeListener(e -> {
            int currentPop = populationSlider.getValue();
            eventsCallback.populationChaged(currentPop);
        });
    }

}
