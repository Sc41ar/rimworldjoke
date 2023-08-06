import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JPanel canvas;
    private JSlider populationSlider;
    private JLabel populationLabel;
    private JLabel riceCount;
    private JLabel potatoCount;
    private JLabel cornCount;

    public GUI() {
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
        populationLabel = new JLabel("population: 0");
        cornCount = new JLabel("corn count: 0");
        riceCount = new JLabel("rice count: 0");
        potatoCount = new JLabel("potato count: 0");
        populationSlider.setPreferredSize(new Dimension(500, 75));
        populationLabel.setPreferredSize(new Dimension(100, 20));
        initConstrains();
        this.add(canvas);
        canvas.revalidate();
    }

    private void initConstrains() {
        GridBagConstraints populationLabelConstrains = new GridBagConstraints();
        GridBagConstraints populationSliderConstrains = new GridBagConstraints();
        GridBagConstraints cornConstrains = new GridBagConstraints();
        GridBagConstraints riceConstrains = new GridBagConstraints();
        GridBagConstraints potatoConstrains = new GridBagConstraints();
        canvas.setLayout(new GridBagLayout());

        populationLabelConstrains.gridx = 0;
        populationLabelConstrains.gridy = 0;
        populationLabelConstrains.weightx = 0.1;

        populationSliderConstrains.gridx = 0;
        populationSliderConstrains.gridy = 1;
        populationSliderConstrains.gridwidth = 4;
        populationSliderConstrains.weightx = 0.1;

        cornConstrains.gridx = 5;
        cornConstrains.gridy = 0;
        cornConstrains.weightx = 0.5;

        riceConstrains.gridx = 5;
        riceConstrains.gridy = 1;
        riceConstrains.weightx = 0.5;

        potatoConstrains.gridx = 5;
        potatoConstrains.gridy = 2;
        riceConstrains.weightx = 0.5;


        canvas.add(populationSlider, populationSliderConstrains);
        canvas.add(populationLabel, populationLabelConstrains);
        canvas.add(cornCount, cornConstrains);
        canvas.add(riceCount, riceConstrains);
        canvas.add(potatoCount, potatoConstrains);

    }

    private void setEvents() {

    }

}
