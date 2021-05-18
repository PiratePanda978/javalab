import javax.swing.*;
import java.awt.*;
import org.knowm.xchart.*;

public class Q3 {
  public static void main(String[] args) {
    double[] popdensity = { 3929, 5308, 7240, 9638, 12866, 17069, 23192, 31443, 38558, 50156, 62948, 75995, 91972,105711, 122775, 131669, 150697 };
    double popSize[] = new double[popdensity.length];
    double popSize1[] = new double[popdensity.length];
    double x_axis[] = new double[popdensity.length];
    double x_axis1[] = new double[popdensity.length];
    double start = 1790;
    double start1 = 1790;
    for (int i = 0; i < popdensity.length; i++) {
        double density = 197273000 / (Double) (1 + Math.exp((-0.03134 * (start - 1913.25))));
        popSize[i] = density;
        x_axis[i] = start;
        start += 10;
      }
    for (int i=0; i < popdensity.length; i++) {      
      popSize1[i] = popdensity[i]*1000;
      x_axis1[i] = start1;
      start1+=10;
    }
    final XYChart chart = new XYChartBuilder().width(600).height(400).title("").xAxisTitle("Year").yAxisTitle("Population Size").build();
    chart.addSeries("b",x_axis1,popSize1);
    chart.addSeries("a",x_axis,popSize);
    // new SwingWrapper(chart).displayChart();
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame = new JFrame("Question 3");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel chartPanel = new XChartPanel<XYChart>(chart);
        frame.add(chartPanel, BorderLayout.CENTER);
        JLabel label = new JLabel("Population size graph", SwingConstants.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
      }
    });
  }
}