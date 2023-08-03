import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JPanel canvas;
    private JSlider populationSlider;
    private JLabel populationLabel;
    private JLabel riceCount;
    private JLabel potatoCount;
    private JLabel cornCount;

    public GUI(){
        this.setBounds(0, 0, 500, 500);
        this.setVisible(true);
    }

    public void init()
    {
        canvas = new JPanel();
        populationSlider = new JSlider();
        populationLabel = new JLabel("population: 0");
        cornCount = new JLabel("corn count: 0");
        riceCount = new JLabel("rice count: 0");
        potatoCount = new JLabel("potato count: 0");
        populationSlider.setPreferredSize(new Dimension(200, 50));
        populationLabel.setPreferredSize(new Dimension(100, 20));
        canvas.setLayout(new BorderLayout());
        canvas.add(populationLabel, BorderLayout.LINE_START);
        canvas.add(populationSlider, BorderLayout.LINE_START);
        canvas.add(riceCount,BorderLayout.LINE_END);
        canvas.add(potatoCount, BorderLayout.LINE_END);
        canvas.add(cornCount, BorderLayout.LINE_END);
        canvas.setPreferredSize(new Dimension(100,100));
        this.add(canvas);
        this.repaint();
    }


}
